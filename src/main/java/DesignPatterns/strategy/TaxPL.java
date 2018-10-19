package DesignPatterns.strategy;

import java.math.BigDecimal;

public class TaxPL implements TaxStrategy {

    @Override
    public BigDecimal calculate(BigDecimal value) {
        return value.multiply(BigDecimal.valueOf(0.23));
    }
}
