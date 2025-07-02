package com.autobots.java.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class HW {
    public static void main(String[] args) {

    }

    public List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s.concat(s).concat(s)).collect(Collectors.toList());
    }
    public List<String> moreY(List<String> strings) {
        return strings.stream().map(s -> "y".concat(s).concat("y")).collect(Collectors.toList());
    }
//    public int last2(String str) {


   // }

}
