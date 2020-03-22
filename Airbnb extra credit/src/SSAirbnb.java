/**
 * @author - Sohail Shaik
 * @Date - Mar 16, 2020
 * @Assignment - SSAirbnb
 */
public class SSAirbnb {

	public static void main(String[] args) {
		int[] arr = {9, 6, 1, 3, 8, 10, 12, 11};
		selectionSort(arr);
		//		for(int i = 0; i < arr.length; i++) {
		//			System.out.print(arr[i] + " ");
		//		}

		int[] nums = findLongest(arr);
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		} 

	}

	/**
	 * 	precondition - nums is to be sorted
	 */
	public static int[] findLongest(int[] nums) {
		int start = 0, end = 0;
		for(int i = 0; i < nums.length; i++) {
			if(exists(nums, nums[i]+1)) {
				start = nums[i];
				for(int j = i+2; j < nums.length && exists(nums, nums[j]); j++) {
					end = nums[j];
				}
				int[] arr = {start, end};
				return arr;
			}
		}
		int[] arr = {start, end};
		return arr;
	}

	public static boolean exists(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target)
				return true;
		}
		return false;
	}

	public static void selectionSort(int[] items) {
		for(int index = 0; index < items.length-1; index++) {
			int swapPlace = index;
			for(int subIndex = index+1; subIndex < items.length; subIndex++) {
				if(items[subIndex] < items[swapPlace]) {
					swapPlace = subIndex;
				}
			}

			if(index != swapPlace) {
				int temp = items[index];
				items[index] = items[swapPlace];
				items[swapPlace] = temp;
			}
		}
	}
}
