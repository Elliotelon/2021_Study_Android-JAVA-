package com.elliot.step11generic;

public class TestGeneric<T>
{
    public T sample;

    public void showYourType()
    {
        if(sample instanceof Integer)
            System.out.println("Integer 타입이군요!!");
        else if(sample instanceof String)
            System.out.println("String 타입이군요!!");
    }
}
