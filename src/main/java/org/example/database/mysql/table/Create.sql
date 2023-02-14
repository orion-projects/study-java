/*
 create table <表名>
 (
    字段1, 数据类型 [列级约束条件] [默认值],
    字段2, 数据类型 [列级约束条件] [默认值],
    ......
    [表级约束条件]
 );
 */

/*
 主键约束
 */
use test;
create table primaryFieldTable
(
    id int primary key auto_increment
);
create table primaryTable
(
    id int auto_increment,
    constraint primaryKey primary key (id)
);

/*
 非空约束
    字段的值不能为空。
 */
 create table notNullTable
(
    id int not null
 );

/*
 唯一性约束
    列要求唯一，允许为空，但只能有一个空值。
 */
 create table uniqueFieldTable
(
    id int unique
 );
create table uniqueTable
(
    id int,
    constraint unique (id)
);

/*
 默认约束
 */
 create table defaultTable
(
    id int default 0
 );

/*
 自增，必须是主键的一部分。非SQL标准语法。
 */
 create table autoIncrementTable
(
    id int primary key auto_increment
 );
