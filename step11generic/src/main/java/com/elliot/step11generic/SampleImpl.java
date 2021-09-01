package com.elliot.step11generic;

public class SampleImpl implements InterfaceSample<Integer, String> {


    @Override
    public Integer testMethod1(Integer t) {
        return t;
    }

    @Override
    public String testMethod2(String t) {
        return t;
    }
}
