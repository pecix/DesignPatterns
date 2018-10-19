package DesignPatterns.strategy;

import java.math.BigDecimal;

public class TaxContex {

    private TaxStrategy strategy;

    public void setTaxStrategy(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal getTax(BigDecimal value) {
        return strategy.calculate(value);
    }

}
