import java.util.Scanner;

import static java.lang.System.*;

class animal{
    public static void Setter(int AgeOf){
        int age = AgeOf;
        System.out.println(AgeOf+" over time!");
    }
    public static void getter(int a){
        Setter(a);
    }
}

public class hashExample {
    public static void main(String[] args){
        Scanner input = new Scanner(in);
        animal obj = new animal();
        int a= input.nextInt();
        obj.getter(a);
    }
}
