//bubble sort 

import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int[] arr= {3,4,1,5,10,15,8,9,18};
		for(int i = arr.length-1;i>=1;i--){
		    int did_swap= 0;
		    for(int j=0;j<i;j++){
		        if(arr[j]>arr[j+1]){
		            int temp = arr[j];
		            arr[j]= arr[j+1];
		            arr[j+1]= temp;
		            did_swap =1;
		        }
		    }
		    if(did_swap==0){
		        break;
		    }
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
