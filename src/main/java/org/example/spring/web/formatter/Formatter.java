package org.example.spring.web.formatter;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

public class Formatter {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private Double num;

    private Sex sex;

    @AnnotationFormatter
    private Double money;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public static class Sex{

        /**
         * 0男、1女
         */
        private Integer integer;

        public Sex(Integer integer){
            this.integer = integer;
        }

        public Integer getInteger() {
            return integer;
        }

        public void setInteger(Integer integer) {
            this.integer = integer;
        }
    }
}
