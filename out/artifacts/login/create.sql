use ssm;

drop table if exists users;

CREATE TABLE `users` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id' ,
`username`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账号' ,
`password`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='用户表'
AUTO_INCREMENT=4
ROW_FORMAT=COMPACT
;

INSERT INTO `users` (`id`, `username`, `password`) VALUES ('1', 'root', 'root');