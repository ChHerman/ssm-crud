CREATE DATABASE ssm_crud;
USE ssm_crud;
DROP table student;
CREATE TABLE student(
  `student_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '学生ID',
  `student_name` VARCHAR(50) NOT NULL COMMENT '学生姓名',
  `student_class` VARCHAR(50) NOT NULL COMMENT '学生班级',
  PRIMARY KEY(student_id)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '学生信息表';

INSERT INTO student(student_name,student_class)
VALUES
("张三","高三一班"),
("李四","初一二班"),
("王五","一年一班");