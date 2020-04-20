package array;

public class SortArray {
	
	
	static void swap(int[] a, int i, int j){
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}

	
	static void sort(int[] a){
	    int low = -1;
	    int mid = 0;
	    int high = a.length;
	 
	    while(mid < high){
	        if(a[mid] == 0){
	            low++;
	            swap(a, low, mid);
	            mid++;
	        }else if(a[mid] == 1){
	            mid++;
	        }else if(a[mid] == 2){
	            high--;
	            swap(a, mid, high);
	        }
	    }
	}
	
public static void main(String[] args) {
		
		int[]a = {1,0,2,0,0,1,2,2,1};
		sort(a);
		for(int val : a)
		{
			System.out.println(val + " ");
		}
 
	}


}
