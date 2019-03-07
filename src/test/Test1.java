package test;

import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class Test1 {

    public static void main(String... args){
        System.out.println("Enter space separated chars:");
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Integer[] intArr = new Integer[10];
        int i = 0;
        for(String str : input) {
            int inte = Integer.parseInt(str);
            intArr[i] = inte;
            System.out.println("str = "+str+"\n");
            System.out.println("inte = "+inte+"\n");
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("santosh");
        stringList.add("sindham");

        stringList.stream().forEach(p -> System.out.println(p));
        stringList.stream()
                .map( str -> {
                    return str.toUpperCase();
                }).forEach(print -> System.out.println(print));

        System.out.printf("%s and %s hi there %d", "santosh", "sindham", 1);
    }

    public boolean returnBoolean(boolean value){
        return value;
    }
}
