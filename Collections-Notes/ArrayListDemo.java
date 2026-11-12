/*
 ArrayList Notes:
 - Size maarum array
 - add(), get(index), remove(index), size()
 - remove(index) removed value-a return pannum
*/


import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.get(2));
        System.out.println(list.remove(3));
        System.out.print(list.size());
    }
}
