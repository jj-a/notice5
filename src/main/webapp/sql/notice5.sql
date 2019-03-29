-- notice5.sql

-- 테이블 생성
CREATE TABLE notice5(
	noticeno NUMBER NOT NULL, 			-- 공지 번호
	title VARCHAR(300) NOT NULL, 		-- 공지 내용
	rname VARCHAR(300) NOT NULL, 	-- 작성자
	rdate DATE NOT NULL, 						-- 등록일
	PRIMARY KEY(noticeno)
) 
;


-- 조회
SELECT noticeno, title, rname, rdate FROM notice5 
ORDER BY noticeno DESC 
;

SELECT noticeno, title, rname, rdate FROM notice5 
WHERE title LIKE '%' || #{keyword} || '%' 
ORDER BY noticeno DESC 
;

SELECT noticeno, title, rname, rdate FROM notice5 
WHERE rname LIKE '%' || #{keyword} || '%' 
ORDER BY noticeno DESC 
;

SELECT noticeno, title, rname, rdate FROM notice5 
WHERE title LIKE '%' || #{keyword} || '%' OR rname LIKE '%' || #{keyword} || '%' 
ORDER BY noticeno DESC 
;

-- 상세조회
SELECT noticeno, title, rname, rdate FROM notice5 
WHERE noticeno=#{noticeno} 
;

-- 카운트
SELECT COUNT(*) FROM notice5 
;

-- 추가
INSERT INTO notice5(noticeno, title, rname, rdate) 
VALUES((SELECT NVL(MAX(noticeno), 0)+1 FROM notice5), #{title}, #{rname}, sysdate) 
;

INSERT INTO notice5(noticeno, title, rname, rdate) 
VALUES((SELECT NVL(MAX(noticeno), 0)+1 FROM notice5), '제목', '작성자', sysdate) 
;

-- 수정
UPDATE notice5 
SET title=#{title}, rname=#{rname}, rdate=sysdate 
WHERE noticeno=#{noticeno} 
;

-- 삭제
DELETE FROM notice5 
WHERE noticeno=#{noticeno} 
;

