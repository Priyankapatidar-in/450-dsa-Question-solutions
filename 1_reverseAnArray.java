
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
		//code
		
		Scanner sc= new Scanner(System.in);
		int t,n,a[];
		t=sc.nextInt();
		while(t>0){
		    
		n=sc.nextInt();
		a=new int[n];
		
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    
		}
		
		int temp;
		for(int i=n-1;i>=0;i--){
		   System.out.print(a[i]+" ");
		}
		System.out.println();
		t--;
		}
	}
}
