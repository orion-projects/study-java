
create table integerTable
(
    tiny_int tinyInt,
    small_int smallint,
    medium_int mediumint,
    int_int int,
    big_int bigint,
    unsigned_tiny_int tinyint unsigned,
    unsigned_small_int smallint unsigned,
    unsigned_medium_int mediumint unsigned,
    unsigned_int_int int unsigned,
    unsigned_big_int bigint unsigned
);

create table floatTable
(
    float_num float,
    double_num double,
    dec_num dec(32, 16),
    decimal_num decimal(32, 16)
);

create table dateTimeTable
(
    year_date year,
    date_date date,
    time_date time,
    date_time_date datetime,
    timestamp_date timestamp
);