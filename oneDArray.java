package SingleDArray;

import java.util.Arrays;

public class oneDArray {

	public static void main(String[] args) {
		
		//1.Declaring Array
		//Approch 1. declaring 
		/*int a[]=new int[5];
		
		//adding values into array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;*/
		
		//Approch 2 declaration +assigned data
		int a[]= {10,20,30,40,50};
		
		//3.find size of array
		System.out.println(a.length); // returns length(size) of array of 5 
		
		//4. read single value from an array
		System.out.println(a[1]);
		
		//5. read multiple value from an array
		//System.out.println(Arrays.toString(a));//shows all values in the list [10,20,30,40,50]
		
		
		//normal for loop
//		for(int i=0;i<=a.length;i++) //not correct statement i<=a.length-1{
//			System.out.println(a[i]);
//		}
	
	//enhanced for loop   for each loop
		for (int x:a) {
			System.out.println(x);
		}
		
		
		
		

	}

}
