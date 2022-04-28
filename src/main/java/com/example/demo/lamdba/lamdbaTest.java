package com.example.demo.lamdba;


import com.example.demo.pojo.Person;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Author QianWei.Song
 * @Date: 2021/11/30 15:18
 * @Version 1.0
 */
public class lamdbaTest {
    //需求：筛选年龄大于20的
    public static void main(String[] args) {
   /*     List<Person> person = Arrays.asList(
                new Person("QQQ", 10, 12.0)
                , new Person("WWW", 20, 12.0)
                , new Person("EEE", 30, 12.0)
                , new Person("EEE", 30, 12.0)
                , new Person("RRR", 40, 12.0)
                , new Person("TTT", 50, 12.0));*/

        // List<Person> lists= filterByAge(person,t->t.getAge()>30);
        //System.out.println(lists.toString());
        // person.stream().filter(t->t.getAge()<30).forEach(System.out::println);
        Person person1 = new Person();
        Supplier<List<Person>> fun = ArrayList::new;
        // List<Person> apply = fun.apply(10);

        //流去重
        // System.out.println(person.stream().distinct().collect(Collectors.toList()));
/*        person.stream().map(Person::getName).forEach(System.out::println);
       //平均值
        Double collect = person.stream()
                .collect(Collectors.averagingDouble(Person::getPrice));
        //最大值
        Optional<Person> max = person.stream().max(Comparator.comparingDouble(Person::getPrice));
        Optional<Person> min = person.stream().min(Comparator.comparingDouble(Person::getPrice));
        person.stream()
                .collect(Collectors.summarizingDouble(Person::getPrice));

         person.stream()
                .collect(Collectors.summarizingDouble(Person::getPrice));*/
        //   int i = twoSum(0);
        //  Boolean aBoolean = test2(12321);
        // String s = test3("aa bb nn mm oo pp jj gg", 3);

       // System.out.println(resolveRomeNum("MCMXCIV"));
        String[] str={"flower","flow","flight"};
        String s = longestCommonPrefix(str);

    }

    private static <T> List<Person> filterByAge(List<Person> person, Predicate<Person> pre) {
        List<Person> aaa = new ArrayList<>();
        for (Person person1 : person) {
            if (pre.test(person1)) {
                aaa.add(person1);
            }
        }
        return aaa;
    }

    private static int twoSum(int x) {
        String s = String.valueOf(x);
        StringBuilder newStr;
        int a = 0;
        if (s.contains("-")) {
            //去掉符号
            s = s.replaceFirst("-", "");
            //反转
            char[] chars = s.toCharArray();
            newStr = new StringBuilder("-");
            for (int i = chars.length - 1; i >= 0; i--) {
                newStr.append(chars[i]);
            }
        } else {
            //反转
            char[] chars = s.toCharArray();
            newStr = new StringBuilder("");
            for (int i = chars.length - 1; i >= 0; i--) {
                newStr.append(chars[i]);
            }
        }
        if (Long.parseLong(newStr.toString()) >= Integer.MAX_VALUE
                || Long.parseLong(newStr.toString()) <= Integer.MIN_VALUE) {
            return 0;
        }
        return Integer.parseInt(newStr.toString());
    }

    //判断回文数
    public static Boolean test2(int x) {
        int handler = x;
        //反转数字
        if (x == 0) {
            return true;
        }
        int res = 0;
        while (x > 0) {
            int pop = x % 10;
            x /= 10;
            res = res * 10 + pop;
        }
        if (handler == res) {
            return true;
        }
        return false;
    }

    public static String test3(String str, int k) {
        String[] s = str.split(" ");
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < k; i++) {
            res.append(s[i] + " ");
        }
        return res.toString().trim();
    }

    //解析罗马数字
    public static int resolveRomeNum(String s) {
        //解析
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        //思路  正常情况下是  VII  7  = 5+1+1
        //特殊情况          IV   4  =  5-1
        //遇到右侧得数字比自己大得情况  将自己 取反
 /*       char[] chars = s.toCharArray();
        Integer res = 0;
        for (int i = 0; i < chars.length; ++i) {
            //最后一位判断
            int temp = 0;
            Integer integer = 0;
            Integer nextInteger = 0;
            if ((i + 1) != chars.length) {
                integer = map.get(chars[i]);
                nextInteger = map.get(chars[i + 1]);
                if (integer < nextInteger) {
                    temp = -integer;
                }else {
                    temp = map.get(chars[i]);
                }
            } else {
                temp = map.get(chars[i]);
            }
            res+=temp;
        }
        return res;*/

        //最佳解答
        return 0;
    }

    //最长公共前缀
    public static String longestCommonPrefix(String[] strs) {
        //思路 ：
        int index = 0;
        int len = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < len) {
                len = strs[i].length();
                index = i;
            }
        }
        //最短字符串重后往前截取匹配
        String shortStr = strs[index];
        boolean flag = true;
        while (flag) {
            for (String str : strs) {
                if (str.startsWith(shortStr)) {
                    flag = false;
                    continue;
                }
                shortStr = shortStr.substring(0,shortStr.length()-1);
                flag = true;
                break;
            }
        }
        return shortStr;
    }
}
