package waysToCreateStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WithStreamFunction {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("John","Jane","Jack");
        Stream<String> streamOfString=list.stream();
        System.out.println(list);
       streamOfString.forEach(System.out::println);
    }
}
