select * from sj_account_info;
select * from sj_member;

update sj_member set privacy_agree_yn ='N' , token = '';
select * from sj_account_info;
select * from sj_account_transfer_info where OTHER_ACCOUNT_NUMBER='110420340941';

commit;
select a.*, (select bank_name from sj_bank where bank_code = a.bank_code ) as bank_name from sj_account_transfer_info a;
select a.bank_code, (select bank_name from sj_bank where bank_code = a.bank_code) from sj_account_info a;
select * from sj_member;
drop table sj_bank;
select bank_name from sj_bank where bank_code = '081';
select * from sj_member;
commit;
insert into sj_account_info(account_number, account_password, balance,
account_type, bank_code,account_state , jumin_no , name )
values('110420140111','1111',156,'1','002','1', '9408121212345','조세진');

insert into sj_account_transfer_info(id, inout_type, tran_amt, account_number,
bank_code, other_account_number, other_bank_code  )
values('transfer' ||seq_sj_account_transfer_info.nextval, 'I', 53000, '110420140111',
'002','110420340941', '081');

commit;
select * from sj_auto_tran_account;
DELETE from sj_auto_tran_account where id = 'auto1';
create table sj_auto_tran_account (
    id varchar2(30) not null ,
    member_id varchar2(30) not null,
    bank_code char(3),
    bank_name varchar(30),
    account_number varchar2(20),
    auto_amt number(20),
    reg_date date default sysdate,
    primary key (id),
    CONSTRAINT fk_sj_auto_tran_account FOREIGN KEY(member_id)
    REFERENCES sj_member(id)
);
create sequence sj_seq_auto_tran_account ; 

drop table sj_auto_tran_account ;

select * from sj_auto_tran_account;
select * from sj_account_info where account_number not in (select account_number from sj_auto_tran_account );
select * from sj_auto_tran_account;
drop table sj_auto_tran_account;
select * from sj_member;
insert into sj_auto_tran_account(id, member_id, bank_code, bank_name, account_number, auto_amt) values( 'auto' || sj_seq_auto_tran_account.nextval,     "member6" ,     "002" ,     "산업은행" ,     "110420340950" ,     "3"      )     ,       (    'auto' || sj_seq_auto_tran_account.nextval,     "member6" ,     "037" ,     "전북은행" ,     "110420340932" ,     "3"      );

select a.*, (select bank_name from sj_bank where bank_code = a.bank_code) as bank_name from sj_account_info a where account_number not in 
(select account_number from sj_auto_tran_account where member_id = 'member6')
and jumin_no = '9408121234567';

select * from sj_auto_tran_account;

select * from sj_writer_info;
drop table sj_writer_info;
commit;
CREATE TABLE sj_writer_info --작가 정보
(
    id    VARCHAR2(40) NOT NULL, --pk
    writer_name    VARCHAR2(40) NOT NULL, --작가 이름
    award_history    CLOB, --수상이력 
    writer_info    CLOB, --작가 정보
    career    CLOB, --전시이력
    file_chan_name    VARCHAR2(1000) NOT NULL, --변경된 파일 이름
    file_path    VARCHAR2(1000) NOT NULL, --파일 경로
    orgn_file_name    VARCHAR2(1000) NOT NULL, --원파일명
    file_size    NUMBER(10), --파일 크기
    reg_date date DEFAULT  sysdate, --등록 날짜
    PRIMARY KEY (id)
);
select * from sj_writer_info;
select * from sj_artwork_info;
select a.*, to_char(a.reg_date, 'yyyy-mm-dd') as regDate from sj_artwork_info a
		where a.state != '7'; 
select a.*, to_char(a.reg_date, 'yyyy-mm-dd') as regDate , w.* from sj_artwork_info a, sj_writer_info w
		where a.writer_id = w.id 
		and a.state != '7'; 
select a.id, a.title, a.writer_id,a.material, a.size_width,
		a.size_height,a.production_year, a.artwork_content, a.recruit_start_date,
		a.recruit_end_date, a.recruit_start_time, a.recruit_end_time,
		a.target_piece, a.estimated_price_max, a.estimated_price_min,
		a.achie_piece, a.sell_price, a.total_transfer_tax, a.sell_date,
		a.sell_place ,to_char(a.reg_date, 'yyyy-mm-dd') as regDate , w.writer_name,
		w.award_history, w.writer_info, w.file_chan_name, w.file_path, w.orgn_file_name
		from sj_artwork_info a, sj_writer_info w
		where a.writer_id = w.id 
		and a.state != '7';       
        
CREATE TABLE sj_artwork_info_img --작품정보 이미지
(
    id    VARCHAR2(40) NOT NULL, --pk
    artwork_info_id    VARCHAR2(40) NOT NULL, --artwork_info 테이블 id
    file_chan_name    VARCHAR2(1000) NOT NULL, --첨부파일 변경 명칭
    file_path    VARCHAR2(1000) NOT NULL, --첨부파일 저장위치
    orgn_file_name    VARCHAR2(1000) NOT NULL, --첨부파일 원파일명
    file_size    NUMBER(10), --첨부파일 크기 
    trns_err_msg    VARCHAR2(2000), --전송오류 내용
    PRIMARY KEY (id),
    CONSTRAINT fk_sj_artwork_info_img FOREIGN KEY(artwork_info_id)
    REFERENCES sj_artwork_info(id)
);
create sequence seq_sj_artwork_info_img ;
select * from sj_artwork_info;
select * from sj_artwork_info_img;
select seq_sj_artwork_info.nextval as id from dual;
drop table sj_artwork_info_img;
CREATE TABLE sj_artwork_info_img --작품정보 이미지
(
    id    VARCHAR2(40) NOT NULL, --pk
    artwork_info_id    VARCHAR2(40) NOT NULL, --artwork_info 테이블 id
    file_chan_name    VARCHAR2(1000) NOT NULL, --첨부파일 변경 명칭
    file_path    VARCHAR2(1000) NOT NULL, --첨부파일 저장위치
    orgn_file_name    VARCHAR2(1000) NOT NULL, --첨부파일 원파일명
    file_size    NUMBER(10), --첨부파일 크기 
    trns_err_msg    VARCHAR2(2000), --전송오류 내용
    PRIMARY KEY (id)
);