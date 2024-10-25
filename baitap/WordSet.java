package baitap;

import java.util.Scanner;
import java.util.*;
import java.io.*;
public class WordSet implements Comparable<WordSet> {
    private String sub;
    public WordSet(String s ){
        Scanner sc =new Scanner(new File(s));
        while(sc.hasNext()){
            sub+= sc.hasNext();
        }
    }
    
    public String union(WordSet o) {
            
        return name.compareTo(o.name);
    }
    @Override
    public String toString(){
        return id+" "+name+" "+date+" "+fee;
    }
    
    
    }
