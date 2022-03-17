package ru.netology;

import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;


class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldReturn100ifPurchase900(){
        int actual = service.remain(900);
        int expected = 100;
        assertEquals (expected,actual);

    }

    @Test
    public void shouldReturn1ifPurchase999(){
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn999ifPurchase1(){
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn0ifPurchase1000(){
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn1000ifPurchace0(){
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturn500ifPurchace500(){
        int actual = service.remain(500);
        int expected = 500;
        assertEquals(expected,actual);
    }


    @Test
    public void shouldReturnMaxIfPurchaceOverMax(){
        int actual = service.remain(2000);
        int expected = 1000;
        assertEquals(expected,actual);
    }

}