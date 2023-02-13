package org.example.spring.web.valid;

import javax.validation.constraints.*;
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

    @Size(min = -10, max = 10)
    private Long validSize;

    @Digits(integer = 1, fraction = 10)
    private Long validDigits;

    @Past
    private Timestamp validPast;

    @Future
    private Timestamp validFuture;
}
