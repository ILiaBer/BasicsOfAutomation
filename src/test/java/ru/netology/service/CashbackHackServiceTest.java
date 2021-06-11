package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void ShouldReturnResidue() {
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void AmountZero(){
        int actual = cashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }
    @Test
    public void AmountMoreThenBoundary(){
        int actual = cashbackHackService.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);
    }
}