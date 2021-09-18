--공동구매를 진행할 때 구매or 판매 했을 때 buy_sell table insert, artwork_info update(달성액)
create or replace function co_buying_func
(
    pi_artwork_info_id in sj_buy_sell.artwork_info_id%type, --artwork_info table의 id
    pi_member_id in sj_buy_sell.member_id%type, --member table의 id
    pi_piece_no in sj_buy_sell.piece_no%type, --조각 개수
    pi_piece_amt in sj_buy_sell.piece_amt%type, --조각당 금액
    pi_type in sj_buy_sell.type%type --type(공동구매 - 구매(1), 판매(2))
)
return number
is
    v_result number(1); --성공(1) / 실패(0)했을 때 return 값
    v_error_message sj_transfer_exception_log.error_message%type; --오류 메시지
    v_change_amt number(20) := pi_piece_no * pi_piece_amt; --update 해야 할 달성액
begin
    --buy_sell table에 구매 정보 insert
    insert into sj_buy_sell(id, artwork_info_id, member_id, piece_no, piece_amt, type)
    values('buy_sell' || seq_sj_buy_sell.nextval, pi_artwork_info_id, 
    pi_member_id, pi_piece_no, pi_piece_amt, pi_type) ;
    
    case 
        when pi_type = '1' then --공동구매 - 구매
            --artwork_info에 공동구매 달성액 update
            update sj_artwork_info set achie_amt = achie_amt + v_change_amt 
            where id = pi_artwork_info_id;
            
        when pi_type = '2' then --공동구매 - 판매
            --artwork_info에 공동구매 달성액 update
            update sj_artwork_info set achie_amt = achie_amt - v_change_amt 
            where id = pi_artwork_info_id;
        
    end case;

    v_result := 1;
    commit;
    return v_result;
exception
    when others then
        rollback;
        v_result := 0;
        
        begin
            v_error_message := sqlerrm;
            insert into sj_transfer_exception_log(id, program_name, error_message, description)
                values('exception' || sj_seq_transfer_exception_log.nextval,'공동구매 판매 or 구매', v_error_message, 
                'member_id : ' || pi_member_id || 
                ', piece_no : ' || pi_piece_no || ', piece_amt : ' || pi_piece_amt || ', type : ' || pi_type);
            commit;
            return v_result;
            exception
                when others then
                    null;
            end;
end;   
        
        
        
        