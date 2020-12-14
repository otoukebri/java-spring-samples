package be.zelda.samples.sealed.classes;

import java.math.BigDecimal;

public final class CreditTransaction extends Transaction {

    public CreditTransaction(BigDecimal value) {
        super(value);
    }

    @Override
    public BigDecimal entry(BigDecimal value) {
        return this.value.subtract(value);
    }
}
