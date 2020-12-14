package be.zelda.samples.sealed.classes;

import java.math.BigDecimal;

public sealed abstract class Transaction permits CreditTransaction, DebitTransaction {

    protected final BigDecimal value;

    public abstract BigDecimal entry(BigDecimal bigDecimal);

    public Transaction(BigDecimal value) {
        this.value = value;
    }
}
