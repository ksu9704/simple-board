# simple-board

## 테이블 설계

### board
CREATE TABLE IF NOT EXISTS `simple_board`.`board` (</br>
`id` BIGINT(32) NOT NULL AUTO_INCREMENT COMMENT 'primary key',</br>
`board_name` VARCHAR(100) NOT NULL,</br>
`status` VARCHAR(50) NOT NULL,</br>
PRIMARY KEY (`id`))</br>
ENGINE = InnoDB;

---
### post
CREATE TABLE IF NOT EXISTS `simple_board`.`post` (</br>
`id` BIGINT(32) NOT NULL AUTO_INCREMENT,</br>
`board_id` BIGINT(32) NOT NULL,</br>
`user_name` VARCHAR(50) NOT NULL,</br>
`password` VARCHAR(4) NOT NULL,</br>
`email` VARCHAR(100) NOT NULL,</br>
`status` VARCHAR(50) NOT NULL,</br>
`title` VARCHAR(100) NOT NULL,</br>
`content` TEXT NULL,</br>
`posted_at` DATETIME NOT NULL,</br>
PRIMARY KEY (`id`))</br>
ENGINE = InnoDB;

---

### reply
CREATE TABLE IF NOT EXISTS `simple_board`.`reply` (</br>
`id` BIGINT(32) NOT NULL AUTO_INCREMENT,</br>
`post_id` BIGINT(32) NOT NULL,</br>
`user_name` VARCHAR(50) NOT NULL,</br>
`password` VARCHAR(4) NOT NULL,</br>
`status` VARCHAR(50) NOT NULL,</br>
`title` VARCHAR(100) NOT NULL,</br>
`content` TEXT NOT NULL,</br>
`replied_at` DATETIME NOT NULL,</br>
PRIMARY KEY (`id`))</br>
ENGINE = InnoDB;

---

![스크린샷 2023-07-09 오후 11 51 32](https://github.com/KongSangUk/simple-board/assets/100742282/1023d9f2-fe1a-486b-9884-2dd493733701)

---
