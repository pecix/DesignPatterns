package DesignPatterns.strategy;

import java.math.BigDecimal;

public class Strategy {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal(100);
        TaxContex taxContex = new TaxContex();
        taxContex.setTaxStrategy(new TaxPL());
        System.out.println(taxContex.getTax(value));
    }
}
