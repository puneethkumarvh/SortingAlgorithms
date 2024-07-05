//Insertion Sort
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int [] arr={7,3,4,1,3,2,0,8,9,-2,1,-10};
		int n = arr.length;
		for(int i=1;i<=n-1;i++){
		    int j=i;
		    while(j>0 && arr[j]<arr[j-1]){
		        int temp = arr[j];
		        arr[j]=arr[j-1];
		        arr[j-1]= temp;
		        j--;
		    }
		    
		}
		System.out.println(Arrays.toString(arr));
	}
}
