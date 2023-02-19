/*
 CREATE TABLE table_name
 [col_name data_type]
 [UNIQUE | FULLTEXT | SPATIAL] [INDEX | KEY] [index_name] (col_name [length]) [ASC | DESC]
 */
create table tableIndex
(
    id int primary key auto_increment,
    name varchar(32),
    age int,
    index (name),
    index (age)
);

/*
 ALTER TABLE table_name ADD [UNIQUE | FULLTEXT | SPATIAL] [INDEX | KEY] [index_name] (col_name [length]) [ASC | DESC]
 */
 alter table tableIndex add index (name, age);

/*
 CREATE [UNIQUE | FULLTEXT | SPATIAL] INDEX index_name ON table_name (col_name [length]) [ASC | DESC]
 */

 create index abc on tableIndex (age, name);

/*
 ALTER TABLE table_name DROP INDEX index_name;
 */
alter table tableIndex drop index abc;

/*
 SHOW INDEX FROM table_name;
 */
show index from tableIndex;

/*
 EXPLAIN [EXTEND] SELECT select_options;
 */

 explain select * from tableIndex where name='123';

/*
不使用索引
1、LIKE匹配的字符串第一个字符为%。
2、不满足最左匹配原则。
3、查询条件中只有OR关键字且OR前后的两个条件中的列都是索引时，查询中才使用索引，否则不使用索引。
 */