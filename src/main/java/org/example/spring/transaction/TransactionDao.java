package org.example.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TransactionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(rollbackFor = {Exception.class})
    public void insert(String name, Integer integer) throws Exception {
        var sel = "insert into transactionBean(name) values ('" + name + "')";
        jdbcTemplate.execute(sel);
        if(integer.compareTo(0)>0){
            throw new Exception("发生异常");
        }
    }
}
