package ru.netology.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CashbackHackServiceTest {

    @Test
    void shouldReturn1000IfAmountIs0() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 0;
        int actual = cashback.remain(amount);
        int expexted = 1000;
        assertEquals(expexted, actual);
    }

	
    @Test
    void shouldReturn1IfAmountIs999() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 999;
        int actual = cashback.remain(amount);
        int expexted = 1;
        assertEquals(expexted, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expexted = 0;
        assertEquals(expexted, actual);
    }


}