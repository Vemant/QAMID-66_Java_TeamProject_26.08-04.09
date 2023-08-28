package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {

    @Test
    public void shouldAddLessThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(3_000);

        int expected = 2_000 + 3_000;
        int actual = account.add(3_000);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMethodPay() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );
        account.pay(500);

        int expected = 2_000 + 5000;
        int actual = account.pay(500);


        Assertions.assertEquals(expected, actual);
    }


}
