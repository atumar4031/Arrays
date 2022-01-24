package org.arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        String numbers = one_d_arrays(5);
//        System.out.println(numbers);
        String out = two_d_arrays();
        System.out.println(out);

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
    public static String two_d_arrays(){
        String[][] fruits = new String[3][3];
        String output = "";
        for (int row = 0; row < fruits.length; row++){
            String single_row = "[";
            for (int col = 0; col < fruits[row].length ; col++){
                fruits[row][col] = row + "";
                single_row += fruits[row][col]+", ";
            }
            single_row += "] \n";
            output += single_row;
        }

        return output;
    }
}
