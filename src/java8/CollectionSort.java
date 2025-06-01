package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

    public static void main(String[] args) {

        List<String> cricketers=List.of("rohit","kohli","sky","hardik","krunal","rahane");

        // Sorting in Ascending order

        Collections.sort(cricketers);

        // Sorting in Descending Order

        Collections.sort(cricketers,Collections.reverseOrder());

        // Sorting by Custom logic (By Length)

        Collections.sort(cricketers,(c1,c2)-> c1.length()-c2.length());

        // Search using binary search

        Collections.sort(cricketers);

        int index=Collections.binarySearch(cricketers,"kohli");

        // Reverse the list order

        Collections.reverse(cricketers);

        // Shuffle the list

        Collections.shuffle(cricketers);

        // swap elements at specified indexes

        Collections.swap(cricketers,0,cricketers.size()-1);



    }
}
