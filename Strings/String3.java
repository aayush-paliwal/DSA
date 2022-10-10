package Java.Strings;

import java.util.ArrayList;

public class String3 {
    public static void main(String[] args) {
        System.out.println('a'+'b');    // Here Operator is converting them into their ASCII value and adding them
        System.out.println("a"+"b");    // Here it will concatenate them
        System.out.println('a'+3);
        System.out.println((char)('a'+3));

//        NOTE: When we do addition or any other operation with characters then it first
//              convert them first into their ASCII value and then perform operation.
//              But with strings it uses string values.


        System.out.println("a"+4);
//        When string is added to integer  then,integer first get converted to Integer that will
//        call toString().


        System.out.println("string"+43.4);
        System.out.println("string"+new ArrayList<>());
        System.out.println("string"+new Integer(40));
        System.out.println(4+new Integer(5));

//        NOTE: + operator in java is only defined for primitives and any one of these values
//              is string.We can also use this with objects but one object should be of
//              type string

//        System.out.println(new Integer(4)+new ArrayList<>());    // Not work
        System.out.println(new Integer(4) + "" + new ArrayList<>());     // Will work
    }
}
