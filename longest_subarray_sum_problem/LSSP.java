
public class LSSP {
public static void main(String[] args) {
	int[] arr =  {3,-2, -3, 4, -1, -2, 1, 5, -3,4};
	int max_sum_so_far = 0;
	int max_sum_ending_here = 0;
	for(int i=0;i<arr.length;i++) {
		
		max_sum_ending_here = max_sum_ending_here + arr[i];
		
		if(max_sum_ending_here <0) {
			max_sum_ending_here = 0;
		}
		
		if(max_sum_so_far < max_sum_ending_here) {
			max_sum_so_far = max_sum_ending_here;
		}
	}
	
	System.out.println(max_sum_so_far);
}
}
