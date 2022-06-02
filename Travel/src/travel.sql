DROP TABLE GOODS_BOOKING;
DROP SEQUENCE booking_seq;

DROP TABLE GOODS_REVIEWS;
DROP SEQUENCE review_seq;

DROP TABLE TRAVEL_CUSTOMERS;

DROP TABLE GOODS_LISTS;
DROP SEQUENCE list_seq;

CREATE TABLE TRAVEL_CUSTOMERS
(
    customer_id VARCHAR2(30) PRIMARY KEY,  --회원아이디
    customer_pw VARCHAR2(30) NOT NULL, --회원비밀번호
    customer_name VARCHAR2(30) NOT NULL, --이름
    email VARCHAR2(50) NOT NULL --이메일
);

CREATE TABLE GOODS_LISTS
(
    course_num NUMBER PRIMARY KEY, --상품번호
    course_title VARCHAR2(500) NOT NULL, --상품명
    course_text VARCHAR2(2000) NOT NULL, --상품설명
    course_clickcount NUMBER DEFAULT 0 --조회수
);
CREATE SEQUENCE list_seq;

CREATE TABLE GOODS_BOOKING
(
    booking_num NUMBER PRIMARY KEY, --예약번호
    customer_id VARCHAR2(30), --회원아이디
    course_num NUMBER REFERENCES GOODS_LISTS(course_num), --상품번호
    member_num NUMBER NOT NULL,--인원수
    travel_period NUMBER NOT NULL, -- 기간
    travel_price NUMBER NOT NULL, -- 가격
    used_or_not CHAR(1) CHECK (used_or_not IN('y','n')) -- 이용여부
);
CREATE SEQUENCE booking_seq;

CREATE TABLE GOODS_REVIEWS
(
    review_num NUMBER PRIMARY KEY, --후기번호
    customer_id VARCHAR2(30), --회원아이디
    course_num NUMBER REFERENCES GOODS_LISTS(course_num) ON DELETE CASCADE, --상품번호
    review_score NUMBER DEFAULT 0, --평점
    review_title VARCHAR2(500) NOT NULL, --후기글제목
    review_text VARCHAR2(2000) NOT NULL --후기글내용
);
CREATE SEQUENCE review_seq;