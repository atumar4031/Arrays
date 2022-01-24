package org.arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size = 3;
        int[] numbers = new int[size];
        for(int i =0 ; i<numbers.length; i++)
            numbers[i] = i + 1;

        String output = "[";
        for (int n: numbers)
            output += n+", ";
        output = output.substring(0, output.lastIndexOf(','));
        output += "]";
        System.out.println(output);

    }
}
