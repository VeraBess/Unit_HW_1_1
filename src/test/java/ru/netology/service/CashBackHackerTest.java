package ru.netology.service;

// import org.testng.annotations.Test;
// import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.Test;

// import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {

    // JUnit4
    @Test
    public void buyMore100Rub() {   //докупить на 100 руб
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void buyMore0Rub() { //докупить на 0 руб если куплено на 1000
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(1_000);
        int expected = 1_000;

        assertEquals(expected, actual);
    }

    @Test
    public void buyMore999Rub() { //докупить на 999 руб если куплено на 1001
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(1001);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void buyMore1000Rub() { //докупить на 1000 руб если куплено на 0
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    //API Junit Jupiter
    @Test
    void buyMore100RubJupiter() {   //докупить на 100 руб
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void buyMore0RubJupiter() { //докупить на 0 руб если куплено на 1000
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(1_000);
        int expected = 1_000;

        assertEquals(expected, actual);
    }

    @Test
    void buyMore999RubJupiter() { //докупить на 999 руб если куплено на 1001
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(1001);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    void buyMore1000RubJupiter() { //докупить на 1000 руб если куплено на 0
        CashBackHacker cashBackHacker = new CashBackHacker();

        int actual = cashBackHacker.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}