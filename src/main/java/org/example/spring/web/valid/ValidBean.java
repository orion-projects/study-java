package org.example.spring.web.valid;

import jakarta.validation.constraints.*;

import java.sql.Timestamp;

public class ValidBean {

    @Null
    private Object validNull;

    @NotNull
    private Object validNotNull;

    @AssertTrue
    private Boolean validAssertTrue;

    @AssertFalse
    private Boolean validAssertFalse;

    @Min(value = 0)
    private Long validMin;

    @Max(value = 0)
    private Long validMax;

    @DecimalMin("0")
    private Long validDecimalMin;

    @DecimalMax("0")
    private Long validDecimalMax;

   // @Size(min = -10, max = 10)
    private Long validSize;

    @Digits(integer = 1, fraction = 10)
    private Long validDigits;

    @Past
    private Timestamp validPast;

    @Future
    private Timestamp validFuture;

    public Object getValidNull() {
        return validNull;
    }

    public void setValidNull(Object validNull) {
        this.validNull = validNull;
    }

    public Object getValidNotNull() {
        return validNotNull;
    }

    public void setValidNotNull(Object validNotNull) {
        this.validNotNull = validNotNull;
    }

    public Boolean getValidAssertTrue() {
        return validAssertTrue;
    }

    public void setValidAssertTrue(Boolean validAssertTrue) {
        this.validAssertTrue = validAssertTrue;
    }

    public Boolean getValidAssertFalse() {
        return validAssertFalse;
    }

    public void setValidAssertFalse(Boolean validAssertFalse) {
        this.validAssertFalse = validAssertFalse;
    }

    public Long getValidMin() {
        return validMin;
    }

    public void setValidMin(Long validMin) {
        this.validMin = validMin;
    }

    public Long getValidMax() {
        return validMax;
    }

    public void setValidMax(Long validMax) {
        this.validMax = validMax;
    }

    public Long getValidDecimalMin() {
        return validDecimalMin;
    }

    public void setValidDecimalMin(Long validDecimalMin) {
        this.validDecimalMin = validDecimalMin;
    }

    public Long getValidDecimalMax() {
        return validDecimalMax;
    }

    public void setValidDecimalMax(Long validDecimalMax) {
        this.validDecimalMax = validDecimalMax;
    }

    public Long getValidSize() {
        return validSize;
    }

    public void setValidSize(Long validSize) {
        this.validSize = validSize;
    }

    public Long getValidDigits() {
        return validDigits;
    }

    public void setValidDigits(Long validDigits) {
        this.validDigits = validDigits;
    }

    public Timestamp getValidPast() {
        return validPast;
    }

    public void setValidPast(Timestamp validPast) {
        this.validPast = validPast;
    }

    public Timestamp getValidFuture() {
        return validFuture;
    }

    public void setValidFuture(Timestamp validFuture) {
        this.validFuture = validFuture;
    }
}
