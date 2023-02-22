create table selectTable
(
    id int primary key auto_increment,
    class_id int,
    name varchar(32)
);

create table classTable
(
    id int primary key auto_increment,
    name varchar(32)
);

insert into selectTable(class_id, name)
values (null, 'wcs'),(1, 'zs'),(2, 'ls'),(3, 'we');

select * from selectTable;

insert into classTable(name)
values ('班级1'),('班级2');

select * from classTable;


/*
 SELECT {* | <字段列表>}
 [
    FROM <表1>,<表2>...
    [WHERE <表达式>]
    [GROUP BY <group by definition>]
    [HAVING <expression> [{<operator> <expression>}...]]
    [ORDER BY <order by definition>]
    [LIMIT [<offset>,} <row count>]
 ]

 SELECT [字段1, 字段2, ... , 字段n]
 FROM [表或视图]
 WHERE [查询条件];
 */

/*
 分组查询
 [GROUP BY 字段] [HAVING <条件表达式>]
 分组函数
 1、MAX()
 2、MIN()
 3、AVG()
 4、SUM()
 5、COUNT()
 */

/*
 内连接查询
    内连接（INNER JOIN）使用比较运算符进行表间某（些）列数据的比较操作并列出这些表中与连接条件相匹配的数据行，组合成新的记录。在内连接查询中，只有满
 足条件的记录才能出现在结果的关系中。
 */
select * from selectTable, classTable where selectTable.class_id<classTable.id;
select * from selectTable inner join classtable on selectTable.class_id=classTable.id;

/*
 左连接
    左连接（LEFT JOIN）返回包括左表中的所有记录和右表中连接字段相等的记录。如果左表的某行在右表中没有匹配行，则在相关联的结果行中右表所有列均为空值。
 */
select * from selectTable left join classtable on selectTable.class_id=classTable.id;

/*
 右连接
    右连接（RIGHT JOIN）返回包括右表中的所有记录和左表中连接字段相等的记录。如果右表的某行在左表中没有匹配行，则在相关联的结果行中左表所有列均为空值。
 */
select * from selectTable right join classtable on selectTable.class_id=classTable.id;