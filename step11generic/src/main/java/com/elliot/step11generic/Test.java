package com.elliot.step11generic;

import android.util.Log;

public class Test<T>{
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {

        Test<String> test = new Test();
        test.set("test");
        Log.d("test", test.get());
    }
}