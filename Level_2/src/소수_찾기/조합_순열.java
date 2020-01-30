//package 소수_찾기;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * @title  : 조합 순열
// * @author : jaeha-dev (Git)
// * @refer  : https://dreamhollic.tistory.com/entry/Programmers-완전탐색-소수찾기level-2
// */
//public class 조합_순열 {
//
//    private static List<Integer> list = new ArrayList<>();
//
//    public static void main(String[] args) {
//        func("123", "2");
//
//        System.out.println(Arrays.toString(list.toArray()));
//    }
//
//    private static void func(String s, String number) {
//        if (number.length() == 0) {
//            if (! s.isEmpty()) {
//                list.add(Integer.parseInt(s));
//            }
//
//        } else {
//            for (int i = 0; i < number.length(); i++) {
//                func(s + number.charAt(i), number.substring(0, i) + number.substring(i + 1, number.length()));
//            }
//            for (int i = 0; i < number.length(); i++) {
//                func(s, number.substring(0, i) + number.substring(i + 1, number.length()));
//            }
//        }
//    }
//}