//Write a program to find the sum and product of all elements of an ArrayList.

import java.util.*;
class Main {
    public static void main(String[] args) {
    //creates array list
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for(int x = 0; x<10; x++){
    System.out.println("Input an integer");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    //Adds the input in the array list
    nums.add(num);
    }
    //This finds and print the sum and product
   int sum = 0;
   int product = nums.get(0);
   for(int y :nums){
     sum+= nums.get(y);
   }
   for(int z: nums){
     product*=nums.get(z);
   }
   System.out.println("Sum: " + sum +" and Product is: " + product);
}
}