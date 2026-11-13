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



import java.util.*;
public class ArrayListproblems {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(15);
        list.add(2);
        list.add(35);
        list.add(91);

        System.out.println(list);
        // 2.finding sum and avg
        int sum = 0;
        for(int i = 0 ; i<list.size();i++){
            sum = list.get(i) + sum; 
        }
            float avg = (float)sum /list.size();
            System.out.println("Sum : " + sum);
            System.out.println("avg : " + avg);

            //3.find max and min value
            int max = list.get(0);
            int min  = list.get(0);
            for(int i = 0 ; i<list.size();i++){
                        if(max < list.get(i)){
                            max = list.get(i);
                        }
                        if(min>list.get(i)){
                        min  = list.get(i);
            }
        }
            System.out.println("max value : " + max);
            System.out.println("Min value : " + min);

            //3.contains in the array
            System.out.println(list.contains(10));

    }
}

import java.util.*;

public class RemoveDuplicateusingAL {
        public static void main(String[] args) {
            ArrayList<Integer> list  = new ArrayList<>();

            list.add(10);
            list.add(11);
            list.add(12);
            list.add(11);
            list.add(10);

            // LinkedHashSet<Integer> set =  new LinkedHashSet<>(list);
            // ArrayList <Integer> res = new ArrayList<>(set);
            // System.out.println(res);
            
            ArrayList <Integer> res = new ArrayList<>();
            for(int i = 0;i<list.size();i++){
                if(!res.contains(list.get(i))){
                    res.add(list.get(i));
                }
            }
            System.out.println(res);
            
        
        
        }    
}

