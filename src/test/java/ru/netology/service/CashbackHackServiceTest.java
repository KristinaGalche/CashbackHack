package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void calculateRemainder() {
        int amount = 800;
        int expected = 200;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateRemainderIf1() {
        int amount = 999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateRemainderIf100() {
        int amount = 1900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateRemainderIfZero() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}