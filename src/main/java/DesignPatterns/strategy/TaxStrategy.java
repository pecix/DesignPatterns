package DesignPatterns.strategy;

import java.math.BigDecimal;

public interface TaxStrategy {
    BigDecimal calculate(BigDecimal value);
}
