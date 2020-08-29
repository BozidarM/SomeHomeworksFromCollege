/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domaci7_bonus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Domaci7_bonus {

    
    public static List<String> sortListStrings(List<String> ls) {
        List<String> ls1 = new ArrayList<String>();
        List<String> ls2 = new ArrayList<String>();
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).matches("^[A-z0-9]+$")) {
                ls2.add(ls.get(i));
            } else {
                ls1.add(ls.get(i));
            }
        }
        Collections.sort(ls1);
        ls.clear();
        ls1.addAll(ls2);
        return ls1;

        
		
    }

    public static void main(String[] args){
        
        List<String> inList = new ArrayList<String>();
        
        inList.add("x");
        inList.add("abc 33 44 5");
        inList.add("xx yy zz");
        inList.add("ab aa bb c d e");
        inList.add("ij 22");
        inList.add("ss");
        inList.add("ww z x y");
        inList.add("abc xx");
        inList.add("abc 33 44 5");
        inList.add("aaa");
        inList.add("xx a b c");
        inList.add("abc 1 2 3 4 5");
        inList.add("x");
        
        List<String> outList = sortListStrings(inList);
        
        for (String s : outList)
            System.out.println(s + " ");
    }

}
