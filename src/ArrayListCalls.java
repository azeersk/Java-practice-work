import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListCalls {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1; i<5; i++){
            numbers.add(i);
        }
        int a = numbers.get(2);
        int s = numbers.set(2,15);
        System.out.println(a);
        System.out.println(numbers);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }
}
