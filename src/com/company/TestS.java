package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestS {
    int a;
    int b;
    @Before//метод выполняется перед каждым тестируемым методом @Test
    public void SetUp(){//определяем значения раннее введенным переменным
    a = 8;
    b = 2;
   }
   @Test//тестовый метод
    public void testPlus(){
        int res = 10;
        Assert.assertEquals("Error",res,Calculator.plus(a,b));//проверяем свои предположения о программе
   }
    @Test
    public void testMinus(){
        int res = 6;
        Assert.assertEquals("Error",res,Calculator.minus(a,b));
    }
    @Test
    public void testMultiplication(){
        int res = 16;
        Assert.assertEquals("Error",res,Calculator.multiplication(a,b));
    }
    @Test
    public void testDivision(){
        int res = 4;
        Assert.assertEquals("Error",res,Calculator.division(a,b));
        //assertEquals 1 параметр - сообщение при несоответствии фактического и ожидаемого результата,
        //2 параметр фактический результат, 3 - ожидаемый
    }
}
