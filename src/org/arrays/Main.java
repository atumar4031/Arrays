package org.arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String numbers = arrays(5);
        System.out.println(numbers);


    }
    public static String arrays(int size){
        int[] numbers = new int[size];
        for(int i =0 ; i<numbers.length; i++)
            numbers[i] = i + 1;

        String output = "[";
        for (int n: numbers)
            output += n+", ";
        output = output.substring(0, output.lastIndexOf(','));
        output += "]";

        return output;
    }
}
