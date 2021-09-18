-- �ܵ� ������

--�迭 ����
CREATE TYPE array_varchar_table AS TABLE OF VARCHAR2 (20); -- Array of String
create type array_char_table as table of char(4);
CREATE TYPE array_int AS TABLE OF NUMBER; -- Array of integers

create or replace procedure collect_change
(
    pi_member_id in sj_member.id%type, --����� ���� table id
    pi_account_no_array in array_varchar_table, --����ڰ� �ܵ��� ���� ���� array
    pi_bank_code in array_char_table, --����� ������ bank code
    pi_tran_amt_array in array_int, --����� �� ������ �ݾ�
    pi_wallet_account_number in sj_account_info.account_number%type, --ȸ�� ���¹�ȣ
    pi_wallet_bank_code in sj_account_info.bank_code%type, --ȸ�� ���� ���� �ڵ�
    pi_member_fintech_use_no in sj_account_info.fintech_use_no%type, --����� fintech_use_no
    pi_wallet_fintech_use_no in sj_account_info.fintech_use_no%type --ȸ�� sj_account_info.fintech_use_no%type
)
is
    v_error_message sj_transfer_exception_log.error_message%type; --���� �޽���
begin
    for i in 1 .. pi_account_no_array.count loop
        -- wallet table�� insert
        insert into sj_wallet(id, member_id, tran_amt, inout_type, account_number, bank_code)
        values('wallet'|| seq_sj_wallet.nextval, pi_member_id, pi_tran_amt_array(i), 'I' ,
        pi_account_no_array(i), pi_bank_code(i) );
        
        --account_transfer_info �ŷ����� ���̺� insert(����� ���)
        insert into sj_account_transfer_info(id, inout_type, tran_amt, account_number,
        bank_code, other_account_number, other_bank_code, fintech_use_no )
        values('transfer' ||seq_sj_account_transfer_info.nextval, 'O', pi_tran_amt_array(i),
        pi_account_no_array(i), pi_bank_code(i), pi_wallet_account_number, pi_wallet_bank_code,
        pi_member_fintech_use_no);
        
        --account_transfer_info �ŷ����� ���̺� insert(ȸ�� ���� �Ա�)
        insert into sj_account_transfer_info(id, inout_type, tran_amt, account_number,
        bank_code, other_account_number, other_bank_code, fintech_use_no )
        values('transfer' ||seq_sj_account_transfer_info.nextval, 'I', pi_tran_amt_array(i),
        pi_wallet_account_number, pi_wallet_bank_code, pi_account_no_array(i), pi_bank_code(i)
        , pi_wallet_fintech_use_no);
        
        --account_info �������� ���̺��� �ܾ� update(����� ����)
        update sj_account_info set balance = balance - pi_tran_amt_array(i) 
        where fintech_use_no = pi_member_fintech_use_no and account_number = pi_account_no_array(i); 
        
        --account_info �������� ���̺��� �ܾ� update(ȸ�� ����)
        update sj_account_info set balance = balance + pi_tran_amt_array(i) 
        where fintech_use_no = pi_wallet_fintech_use_no and account_number = pi_wallet_account_number; 
    end loop;

    commit;

exception
    when others then
    rollback;
    begin
            v_error_message := sqlerrm;
            insert into sj_transfer_exception_log(id, program_name, error_message, description)
                values('exception' || sj_seq_transfer_exception_log.nextval,'�ܵ�������', v_error_message, 
                'member_id : ' || pi_member_id );
            commit;
            return v_result;
            exception
                when others then
                    null;
            end;
    
end;