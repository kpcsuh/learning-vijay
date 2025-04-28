package com.example.learning_vijay.module1;

import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Excercise1 {

    public static void main(String[] args) {
        // Filtering names that start with "A"
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Annie", "Aaron", "Alex");
        // Write answer here
        List<String> nameList = names.stream()
        		.filter(name->name.startsWith("D"))
        		.collect(Collectors.toList());
        
        System.out.println("Names List:"+ nameList);		
        	
        		


        //Sum only even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
//        List<Integer> filteredList = new ArrayList<Integer>();
//        int sum=0;
//        // Write answer here
//            for(Integer i=0;i<numbers.size();i++)
//            {
//        	    if (numbers.get(i) % 2 == 0) {
//        	    	filteredList.add(numbers.get(i));
//        	    }
//            }    
//       
//        System.out.println("Sum of Numbers: " + filteredList);
        
  
        Predicate<Integer> p = j -> j %2 == 0;
        
        Function<Integer, Integer> sqr = j -> j * j;
        
        
        
       // List<Integer> filtered=  numbers.stream().filter(p).collect(Collectors.toList());
        
        Stream <Integer> temp = numbers.stream().filter(p);
        
       long count =  numbers.stream().map(sqr).count();
        
        System.out.println("Sum of Numbers: " + count);

        // Prasad
             
        

    }
}

