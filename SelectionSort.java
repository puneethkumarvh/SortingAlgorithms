//selection sort implementation.
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int[] arr= {3,4,1,5,10,15,8,9,3};
		for(int i=0;i<arr.length;i++){
		    int min_index = i;
		    for(int j=i;j<arr.length;j++){
		        if(arr[j]<arr[min_index]){
		            min_index = j;
		        }
		    }
		    int temp = arr[i];
		    arr[i]=arr[min_index];
		    arr[min_index]=temp;
		}
		System.out.println(Arrays.toString(arr));
	    
	}
}
