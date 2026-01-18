package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysListDemo {

    static List<Integer> list1 = new ArrayList<>();

    public static void main(String[] args){
        list1.add(10);
        list1.add(20);
        list1.add(100);
        list1.add(60);

        System.out.println(list1);

        list1.set(2,40);
        System.out.println(list1);

        System.out.println(list1.size());
        System.out.println(list1.reversed());
        System.out.println(list1.get(1));
        list1.remove(2);
        System.out.println("after removing : Remove by index " + list1);
        list1.remove(Integer.valueOf(10));
        System.out.println("after removing : Remove by value " + list1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        for(int n : list1)
        {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println(list1.contains(Integer.valueOf(2)));
//        list1.clear();
//        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(2);
        list2.add(3);
        System.out.println("Since list1 has all the elements of list2 : " + list1.containsAll(list2));

        list2.add(4);
        System.out.println("Since list1  all the elements of list2 : " + list1.containsAll(list2));
        System.out.println("Since list2 does not have all the elements of list1 : " + list2.containsAll(list1));
        list1.addFirst(10);
        System.out.println(list1);
        list1.addAll(list2);
        System.out.println(list1);
        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);
//        list1.addAll(4,list2);
//        System.out.println(list1);
        System.out.println("retainAll() keeps only the common elements between two collections. Frequency is NOT checked");
        list1.retainAll(list2);
        System.out.println(list1);
        System.out.println("List 2 : " + list2);
        list2.replaceAll(x->x+1);
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>(List.of(101,102,103));
        System.out.println("List 3 : " + list3);
    }
}
