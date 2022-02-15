package com.example.demo.lamdba;


import java.util.*;

/**
 * @Author QianWei.Song
 * @Date: 2021/12/7 13:52
 * @Version 1.0
 */


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class leeCode {


    //有效的括号
    public static boolean isValid(String s) {
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();

    }

    //两个升序的链表的节点元素  组合成一个新的升序链表
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode middlelistNode = null;
        boolean flag = true;


        return list1;
    }


    //去除给定的的数组中的 指定的元素val 后的长度
    public static int removeElement(int[] nums, int val) {
        //双指针的做法
        int length = nums.length;
        if (length == 0) return 0;
        //a记录要被替换的位置 不便利的位置
        int a = 0, b = 0;
        for (; b < length; b++) {
            if (nums[b] != val) {
                if (b != a) {
                    nums[a] = nums[b];
                }
                a++;
            }
        }
        return a;
    }

    public static int strStr(String haystack, String needle) {
        return "".equals(needle) ? 0 : haystack.indexOf(needle);
    }

    //环和杆   完成
    public static int countPoints(String rings) {
        if (rings.length() / 2 > 2) {
            return 0;
        }
        char[] chars = rings.toCharArray();
        HashMap<Integer, List<Character>> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {

        }
        return 0;
    }

    //特殊打字机 完成
    public static int minTimeToType(String word) {
        char[] chars = word.toCharArray();
        char thisChar = 'a';
        int time = 0;
        for (int i = 0; i < chars.length; i++) {
            //小于13  就正转  大于就反转
            int num = chars[i] - thisChar;
            int abs = num > 0 ? num : -num;
            time += abs < 13 ? abs + 1 : 27 - abs;
            thisChar = chars[i];
        }
        return time;
    }

    //好三元组 完成
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a
                            && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[i] - arr[k]) <= c) {
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                        num++;
                    }
                }
            }
        }
        return num;
    }

    //换酒问题  完成
    public static int numWaterBottles(int numBottles, int numExchange) {
        if (numBottles < numExchange) {
            return numBottles;
        }
        int sum = numBottles;
        while (numBottles / numExchange > 0) {
            int exchangeBeer = numBottles / numExchange;
            int emptyBottles = numBottles % numExchange;
            numBottles = exchangeBeer + emptyBottles;
            sum += exchangeBeer;
        }
        return sum;
    }

    //数组取最大值
    public static int maxProduct(int[] nums) {
    /*    int maxSum =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                maxSum= Math.max((nums[i] - 1) * (nums[j] - 1), maxSum);
            }
        }
        return maxSum;*/

        int maxOne = 0;
        int maxTwo = 0;
        //优化
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxTwo) {
                if (nums[i] > maxOne) {
                    maxTwo = maxOne;
                    maxOne = nums[i];
                } else {
                    maxTwo = nums[i];
                }
            }
        }
        return (maxTwo - 1) * (maxOne - 1);

    }

    //消失的数字
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        return null;
    }

    //相对名次
    public static String[] findRelativeRanks(int[] score) {
        int[] copyScore = score;
        Arrays.sort(copyScore);
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        return null;
    }

    //搜索插入数组位置
    public static int searchInsert(int[] nums, int target) {
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (target <= nums[i]) {
                    return i;
                }
                if (target > nums[nums.length - 1]) {
                    return nums.length;
                }
            }
        }
        return 0;
    }

    //最大子数组和  （未完成）
    public int maxSubArray(int[] nums) {
        return 0;
    }

    //最后一个单词的长度
    public static int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        return split[split.length - 1].length();

    }

    //加一
    public static int[] plusOne(int[] digits) {
        //进位标志
        boolean flag = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i]>8){
                flag=true;
                digits[i]=(digits[i]+1) % 10;
            }else {
                digits[i]=digits[i]+1;
                flag=false;
            }
        }
        //首位需要进位
        if(flag){
            for (int i = 0; i < digits.length; i++) {
                digits[i+1]=digits[i];
                if(i==0){
                    digits[0]=1;
                }
            }
        }
        return digits;
    }

    //主函数
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] ints = plusOne(a);
        System.out.println();
    }
}
