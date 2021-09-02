package com.elliot.step11generic;

import java.util.List;

class TestMethod {
    public static <T> List<T> method(List<T> list, T item) {
        list.add(item);
        System.out.println(list);
        return list;
    }
}
