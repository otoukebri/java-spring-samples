package be.zelda.samples.sealed.classes;

import java.math.BigDecimal;

public final class DebitTransaction extends Transaction {
    public DebitTransaction(BigDecimal value) {
        super(value);
    }

    @Override
    public BigDecimal entry(BigDecimal value) {
        return this.value.add(value);
    }
}
