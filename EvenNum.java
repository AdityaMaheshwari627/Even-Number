package Arrays;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
        	arr[i]=obj.nextInt();
        }
        System.out.print("Even elements are:{");
        for(int i=0;i<n;i++) {
        	if((arr[i])%2==0) {
        		System.out.print(arr[i]+",");
        	}
        }
        System.out.print("}");
	}

}
