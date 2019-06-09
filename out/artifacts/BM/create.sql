use ssm;

drop table if exists users;

CREATE TABLE `users` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id' ,
`username`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账号' ,
`password`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码' ,
`student_id`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号' ,
creat_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '创建时间',
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='用户表'
AUTO_INCREMENT=4
ROW_FORMAT=COMPACT
;

INSERT INTO `users` (`id`, `username`, `password`,`student_id`) VALUES ('1', 'root', 'root','1');