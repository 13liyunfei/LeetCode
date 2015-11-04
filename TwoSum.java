package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		if (nums == null || nums.length == 0 || nums.length == 1) {
			return new int[2];
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		// keyΪtarget - nums[i]�����õ����ظ�����Ŀ˵��ֻ��һ����
		for (int i = 0; i < nums.length; i++) {
			map.put(target - nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			Integer v = map.get(nums[i]);

			// Ԫ�ز���ʹ������
			if (v != null && v != i) {
				return new int[] { i + 1, v + 1 };
			}
		}

		return null;
	}

}
