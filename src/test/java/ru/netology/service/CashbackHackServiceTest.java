package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void calculateRemainder() {
        int amount = 600;
        int expected = 400;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void calculateRemainderIfZero() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void calculateRemainderIf1() {
        int amount = 999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void calculateRemainderIf1000() {
        int amount = 0;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void calculateRemainderIfOver1000() {
        int amount = 1500;
        int expected = 500;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}