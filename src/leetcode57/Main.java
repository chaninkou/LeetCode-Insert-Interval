package leetcode57;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		
		int[] newInterval = {4,8};
		
		System.out.println("Intervals: " + Arrays.deepToString(intervals));
		
		System.out.println("Intervals: " + Arrays.toString(newInterval));
		
		InsertNewInterval solution = new InsertNewInterval();
		
		System.out.println("Solution: " + Arrays.deepToString(solution.insert(intervals, newInterval)));
		
	}
	
	
}
