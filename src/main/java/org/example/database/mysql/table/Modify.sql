create table modifyTable
(
    id int
);

/*
 修改表名
 alter table <旧表名> rename [to] <新表名>;
 */
 alter table modifyTable rename modifyTable2;
 alter table modifyTable2 rename modifyTable;

/*
 change
 alter table <表名> change <旧字段名> <新字段名> <新数据类型>;
 修改字段名称或者字段类型。
 */
 alter table modifyTable change id id long;

/*
 add
 alter table <表名> add <新字段名> <数据类型> [<约束条件>] [first | after 已存在字段名]
 */
 alter table modifyTable add name varchar(32) unique after id;

/*
 modify
 alter table <表名> modify <字段1> <数据类型> [first | after <字段2>];
 修改字段类型或者位置。
 */
 alter table modifyTable modify id int;
 alter table modifyTable modify id int after name;

/*
 drop
 */
 alter table modifyTable drop name;

/*
 engine
 */
 alter table modifyTable engine 'MyISAM';
 alter table modifyTable engine 'InnoDB';