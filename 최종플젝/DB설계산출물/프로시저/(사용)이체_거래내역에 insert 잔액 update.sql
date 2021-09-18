-- ��ü ���ν���
create or replace function transfer_fun
(
    n_id in sj_account_transfer_info.id%type,  --������
    n_inout_type in sj_account_transfer_info.inout_type%type, --����� Ÿ��
    n_tran_amt in sj_account_transfer_info.tran_amt%type, --�ŷ� �ݾ�
    
    n_account_number in sj_account_transfer_info.account_number%type, --�޴� ���
    n_bank_code in sj_account_transfer_info.bank_code%type,
    
    n_other_account_number in sj_account_transfer_info.other_account_number%type,
    n_other_bank_code in sj_account_transfer_info.other_bank_code%type,
    n_token in sj_account_transfer_info.token%type,
    
    n_jumin_no in sj_account_info.jumin_no%type,
    n_name in sj_account_info.name%type
)
return number  
is
    pragma autonomous_transaction;
    v_result number(1);
    v_error_message sj_transfer_exception_log.error_message%type;
begin
    --insert
    insert into sj_account_transfer_info(id, inout_type, tran_amt, account_number, 
    bank_code, other_account_number, other_bank_code, token) 
    values(n_id, n_inout_type, n_tran_amt, n_account_number,
    n_bank_code, n_other_account_number, n_other_bank_code, n_token); 
    
    --update
    case 
        when n_inout_type = 'I' then
           update sj_account_info set balance = balance + n_tran_amt where jumin_no = n_jumin_no 
           and name = n_name and account_number = n_account_number;


        when n_inout_type = 'O' then
            update sj_account_info set balance = balance - n_tran_amt where jumin_no = n_jumin_no 
            and name = n_name and account_number = n_account_number;
        
    end case;

    v_result := 1;
    commit;
    return v_result;
exception
    when others then
        rollback;        
        v_result := 0;

        begin --exception�� log ���̺� ���
            v_error_message := sqlerrm;
            insert into sj_transfer_exception_log(id, program_name, error_message, description)
                values('exception' || sj_seq_transfer_exception_log.nextval,'transfer : ', v_error_message, ', account_number : ' || n_account_number || 
                ', other_account_number : ' || n_other_account_number || ', tran_amt : ' || n_tran_amt);
            commit;
            return v_result;
            exception
                when others then
                    null;
            end;
           
end;