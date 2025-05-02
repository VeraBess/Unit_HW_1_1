package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;
public class CashBackHackerTest {

    @Test
    public void buyMore100Rub() {   //докупить на 100 руб
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void buyMore0Rub() { //докупить на 0 руб если куплено на 1000
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(1_000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void buyMore999Rub() { //докупить на 999 руб если куплено на 1001
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void buyMore1000Rub() { //докупить на 1000 руб если куплено на 0
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}