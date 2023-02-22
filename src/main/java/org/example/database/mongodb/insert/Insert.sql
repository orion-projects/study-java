/*
新增一条数据。
 */
db.books.insertOne({"_id": 0, "title": "wcs"});

/*
新增多条数据。
ordered
1、true
   按照提供的顺序插入，默认值。如果一个文档产生了插入错误，则数组中后续所有的文档均不会插入集合中。
2、false
   允许重新排列插入的顺序以提高性能。尝试插入所有的文档，而不管某些是否发生错误。
 */
db.books.insertMany([{"_id": 3,"title": "zs"}, {"_id": 1, "title": "ls"}], {"ordered": true});
db.books.find();
db.books.deleteMany({});