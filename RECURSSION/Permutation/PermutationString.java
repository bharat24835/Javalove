package Bharat;

import java.util.ArrayList;
import java.util.List;

public class PermutationString {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
       List<String> op = new ArrayList<>();
              call(p, up, op);
        System.out.println(op);


    }
    public static  void call (String p, String up, List<String> op)
    {


        if(up.isEmpty())
        {
             op.add(p);
            return ;
        }
        char ch = up.charAt(0);

        for( int i =0; i<=p.length() ; i++)
        {
            String first = p.substring(0, i);
            String seconf = p.substring(i,p.length());
            call(first+ch+seconf,up.substring(1) , op);
        }
        return ;
    }
}
