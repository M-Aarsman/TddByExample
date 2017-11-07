package com.epam.wallet;

public interface Expression {
    Money reduce(Bank bank, String to);
}
