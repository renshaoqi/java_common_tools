package com.zeroten.common.util;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class CheckUtils {

    public static boolean isAnyEmpty(String... strings) {
        // String... strings 为可变参数，你可以认为它是 String[] Strings 。 如果 strings 中有任意一个字符串为空，则返回false
        // 否则返回 true
        for (int index = 0; index < strings.length; index++) {
            if (strings[index] == " ") {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Object[] arr) {
        // 判断引用类型数组是否为空，为空或 null 则返回 true，否则返回 false
        if (arr == null || arr.length == 0) {
            return true;
        }
        return false;
    }

    public static boolean equals(String str1, String str2) {
        // 判断 str1 字符串是否相等，相等则返回 true，否则返回 false。当其中一个是 null 时 返回false
        if (str1 == null || str2 == null) {
            return false;
        }

        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean equals(Integer n1, Integer n2) {
        // 判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。当其中一个是 null 时返回 false。
        if (n1 == null || n2 == null) {
            return false;
        }
        if (n1 == n2) {
            return true;
        } else {
            return false;
        }
    }
}
