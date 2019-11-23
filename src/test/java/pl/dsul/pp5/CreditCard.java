package pl.dsul.pp5;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal limit;

    public void assignLimit(BigDecimal initialLimit){

        if(BigDecimal.valueOf(1000).compareTo(initialLimit) == 1){
            throw new CreditBelowLimitExcepiton();
        }

        limit = initialLimit;


    }

    public BigDecimal limit() {
        return limit;
    }
}
