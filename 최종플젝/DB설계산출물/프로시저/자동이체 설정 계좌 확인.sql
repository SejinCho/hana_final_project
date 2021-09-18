-- 자동이체 설정 여부 return 테이블 type
create or replace type auto_account_check_obj_type as object(
    account_number varchar2(20),
    bank_code char(3),
    bank_name varchar2(100),
    balance number(20),
    auto_check_yn char(1)
);

create or replace type auto_account_check_tab_type as table of auto_account_check_obj_type;

-- 계좌 번호 배열
CREATE TYPE array_account_number_table AS TABLE OF VARCHAR2(20); -- Array of String
-- 은행 코드 배열
create type array_bank_code_table as table of char(3);
--은행 이름 배열
create type array_bank_name_table as table of varchar2(100);
-- 잔액 배열
CREATE TYPE array_balance_int AS TABLE OF NUMBER; -- Array of integers


--함수 생성
create or replace function auto_account_check_func
(
    pi_account_number in array_account_number_table,
    pi_bank_code in array_bank_code_table,
    pi_bank_name in array_bank_name_table,
    pi_balance in array_balance_int
    
)
return auto_account_check_tab_type
is
    --컬렉션 변수 선언 및 초기화
    i_auto_account_check_tab auto_account_check_tab_type := auto_account_check_tab_type();
    v_error_message sj_transfer_exception_log.error_message%type; --오류 메시지
    v_count number;
    
begin
    for i in 1 .. pi_account_number.count 
        loop
            --if문
            select count(*) into v_count from sj_auto_tran_account where account_number = pi_account_number(i);
            
            
            if v_count = 0 then -- 자동이체 설정 안한 계좌
                i_auto_account_check_tab.extend;
                i_auto_account_check_tab(i) := auto_account_check_obj_type(pi_account_number(i), pi_bank_code(i), 
                pi_bank_name(i), pi_balance(i), 'N');
                
            elsif v_count = 1 then --자동이체 설정 한 계좌
                i_auto_account_check_tab.extend;
                i_auto_account_check_tab(i) := auto_account_check_obj_type(pi_account_number(i), pi_bank_code(i), 
                pi_bank_name(i), pi_balance(i), 'Y');
            end if;
        
        end loop;
        
    --컬렉션 변수를 변환
    return i_auto_account_check_tab;     
    
end;