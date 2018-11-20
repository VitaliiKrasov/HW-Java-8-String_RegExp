package com.soft.main;

import java.lang.reflect.Array;
import java.util.Comparator;

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        return s.compareTo(t1);
    }6

}

