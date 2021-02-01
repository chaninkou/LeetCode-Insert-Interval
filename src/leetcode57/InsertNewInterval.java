package leetcode57;

import java.util.LinkedList;
import java.util.List;

public class InsertNewInterval {
	public int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> result = new LinkedList<>();

		int i = 0;

		// Add all the interval that is not needed to change
		while (i < intervals.length && intervals[i][1] < newInterval[0]) {
			result.add(intervals[i]);
			i++;
		}

		// Update the new Interval accordingly to min and max
		while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
			newInterval[0] = Math.min(newInterval[0], intervals[i][0]); // Start
			newInterval[1] = Math.max(newInterval[1], intervals[i][1]); // End
			i++;
		}

		// Insert the new interval
		result.add(newInterval);

		// Add the rest of the unused interval into result
		while (i < intervals.length) {
			result.add(intervals[i]);
			i++;
		}

		return result.toArray(new int[result.size()][]);
	}
}
