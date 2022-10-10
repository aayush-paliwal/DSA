package Java.Strings;

public class String1 {
    public static void main(String[] args) {

//    1  String is a class
//    2  Every string we create is actually an object of class string
//    So here name is reference variable,"Aayush" is object and String is datatype
        String name="Aayush";
        System.out.println(name);


        // Here a,b and c will point to same object
        String a="Aayush Paliwal";
        System.out.println(a);
        String b="Aayush Paliwal";
        System.out.println(b);
        String c=a;

//        == checks if two reference variables are pointing to same object
        System.out.print("Does a and b pointing to same object ?");
        System.out.println(a==b);
        System.out.print("Does a and c pointing to same object ?");
        System.out.println(a==c);
        System.out.println("Does a equals b ? "+a.equals(b));
        System.out.println();


        b="change";
        System.out.println(b);
        System.out.println(a);
        System.out.print("Does a and b pointing to same object ?");
        System.out.println(a==b);
        System.out.println();

        a="Paliwal";     // This is not changing the object but this is creating the new object
        System.out.println(a);
        System.out.println();



//        To create two different object of same value

        String s1=new String("Aman");
        String s2=new String("Aman");
        System.out.println(s1==s2);    // Now it will give false
        System.out.println();


//      But if we only just want to compare values we will use .equals
        System.out.println(s1.equals(s2));




    }
}
