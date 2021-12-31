import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
    public static void main(String[] args){
        ArrayList array = new ArrayList<>();
        array.add("apple");
        array.add("banana");
        array.add("orange");
        array.add(12345);
        System.out.println("ArrayList is: "+ array);
        System.out.println(array.size());
        for(int i=0; i<array.size(); i++){
            if (array.get(i)== "orange"){
                System.out.println(i);
                array.remove(i);
            }
        }
        System.out.println("ArrayList is: "+ array);
        List<Integer> listArray = new LinkedList<>();
        for(int j=5; j<12; j++){
            listArray.add(j);
        }
        System.out.println(listArray.contains(6));
        System.out.println("cleared list: "+ listArray.removeAll(listArray));
    }
}
