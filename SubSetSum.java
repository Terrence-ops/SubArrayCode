package programmingtesting;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;


public class SubSetSum {
	//a method that will print the subset array 
	public static void subsetArray(int[] arr, int stIdx, int eIdx) {
		
		System.out.println(IntStream.range(stIdx, eIdx + 1)
											.mapToObj(k -> arr[k])
											.collect(Collectors.toList()));
	}
	//this method will find sub-array
	public static int locateSubarr(int[] arr, int sum) {

		for(int stIdx = 0; stIdx < arr.length; stIdx++) {
			
			int currSum = 0;
			
			//review all arrays beginning from start to finish
			for(int eIdx = stIdx; eIdx < arr.length; eIdx++) {
				
				currSum += arr[eIdx];
				
				//check to see if current sum is equal to given sum
				if(currSum == sum) {
					
					subsetArray(arr, stIdx, eIdx);
				}
				
			}
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6};
		int sum = 10; 
		locateSubarr(arr, sum);


	}

}
