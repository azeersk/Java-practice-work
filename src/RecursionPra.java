import java.util.Scanner;

class Calculate{
    public void printNum(int a){
        if (a==0){
            return;
        }
        System.out.println(a);
        printNum(a-1);
    }
}
class Factorial extends Calculate{
    public int calcFactorial(int F){
        if (F==1 || F==0){
            return F;
        }
        int Fact_num = calcFactorial(F-1);
        int Fact_num1 = F*Fact_num;
        return Fact_num1;
    }
}

public class RecursionPra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        Calculate objCalc = new Calculate();
        //objCalc.printNum(a);
        Factorial objFact = new Factorial();
        System.out.println(objFact.calcFactorial(a));
    }
}
