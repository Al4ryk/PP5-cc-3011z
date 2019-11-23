package pl.dsul.pp5;

import org.junit.Test;
import org.junit.Assert;

import java.math.BigDecimal;

public class CreditCardTest {
    
    public static final int INNITIAL_LIMIT = 1000;
    @Test
    public void itAllowAssignLimitToCreditCard() {

        CreditCard creditCard = new CreditCard();
        
        creditCard.assignLimit(BigDecimal.valueOf(INNITIAL_LIMIT));

        Assert.assertEquals(BigDecimal.valueOf(INNITIAL_LIMIT), creditCard.limit())

    }
    
    public void denyAssignLimitBelowMinimum() {
        CreditCard creditCard = new CreditCard();
        
        try {
            creditCard.assignLimit(BigDecimal.valueOf(500));
            Assert.fail("Exception should be thrown");
            
        } catch (CretidBelowLimitException e) {
            Assert.assertTrue(condition true);
        }
        
    }
}
