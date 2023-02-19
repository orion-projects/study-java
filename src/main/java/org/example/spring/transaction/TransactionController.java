package org.example.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    private TransactionDao transactionDao;

    @RequestMapping("insert")
    public String insert(@RequestParam("num")Integer integer){
        try {
            transactionDao.insert("wcs", integer);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "success";
    }
}
