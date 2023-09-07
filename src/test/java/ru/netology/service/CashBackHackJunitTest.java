package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackTestNg {
    @org.junit.Test
    public void shouldCalculateIfAmountLessThan1000 () {

        CashBackHackService cashBackHackService = new CashBackHackService();
        int amount = 900;

        int actual = cashBackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateIfAmountMoreThan1000 () {

        CashBackHackService cashBackHackService = new CashBackHackService();
        int amount = 1100;

        int actual = cashBackHackService.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateIfAmountEqual1000 () {

        CashBackHackService cashBackHackService = new CashBackHackService();
        int amount = 1000;

        int actual = cashBackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateIfAmountMoreThan5000 () {

        CashBackHackService cashBackHackService = new CashBackHackService();
        int amount = 5900;

        int actual = cashBackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateIfAmountEqual0 () {

        CashBackHackService cashBackHackService = new CashBackHackService();
        int amount = 0;

        int actual = cashBackHackService.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateIfAmountLessThan0 () {

        CashBackHackService cashBackHackService = new CashBackHackService();
        int amount = -1000;

        int actual = cashBackHackService.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

}
