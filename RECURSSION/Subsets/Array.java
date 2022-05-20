package Bharat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Here we wish to print the subset of array: ");
        int []a = {1,2,3};
        List<List<Integer>> list = subset(a);
        System.out.println(list);
    }
    public static List<List<Integer>> subset(int []a )
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int n : a)
        {int s = outer.size();
           for(int i =0; i<s; i++)
           {
               List<Integer> internal = new ArrayList<>(outer.get(i));
               internal.add(n);
               outer.add(internal);
           }

        }

        return outer;
    }
    
}
