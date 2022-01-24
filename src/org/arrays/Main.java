package org.arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        String numbers = one_d_arrays(5);
//        System.out.println(numbers);
        two_d_arrays();

    }
    public static String one_d_arrays(int size){
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
    public static void two_d_arrays(){
        String[][] fruits = new String[3][3];

        for (int row = 0; row < fruits.length; row++){
            System.out.print("[");
            for (int col = 0; col < fruits[row].length ; col++){
                fruits[row][col] = row + "";
                System.out.print(fruits[row][col]+" ");
            }
        System.out.print("]");
        System.out.println();
        }
    }
}
