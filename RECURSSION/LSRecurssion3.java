package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class LSRecurssion3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Here we wish to linear search the target elemet using different techniqur of : ");
        int []a  = {1,4,2,3,4,4,5};
        int target = 4;
        System.out.println(" Found the target at index : " + LS(a,target,0));
    }
    public static ArrayList<Integer> LS(int []a , int target, int start)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(start == a.length)
            return list;
        if(a[start] == target)
            list.add(start);
        ArrayList<Integer> listfrombelowcalls = LS(a, target,++start);
        list.addAll(listfrombelowcalls);
        return list;
    }
    // please draw the stack functin graph how the stack is coming out of flow of control
}
