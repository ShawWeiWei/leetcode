import java.util.*;

/**
 * Created by yes on 4/1/16.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        ArrayList<Node> listNode = new ArrayList<>();
        for (int i = 0; i < len; ++i) {
            Node node = new Node(i, nums[i]);
            listNode.add(node);
        }
        Collections.sort(listNode);
        Object[] arrayNode = listNode.toArray();
        int i = 0;
        int j = nums.length - 1;
        boolean isExi = false;
        while (i < j) {
            int res = ((Node)arrayNode[i]).getNum() + ((Node)arrayNode[j]).getNum();
            if (res == target) {
                isExi = true;
                break;
            } else if (res > target) {
                j--;
            } else {
                i++;
            }
        }
        if (isExi) {
            int[] result;
            int index1 = ((Node)arrayNode[i]).getPos()+1;
            int index2 = ((Node)arrayNode[j]).getPos()+1;
            if (index1 < index2) {
                result = new int[]{index1, index2};
            } else {
                result = new int[]{index2, index1};
            }
            return result;
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {3, 2, 4};
        int res[] = solution.twoSum(nums, 6);
        System.out.println(Arrays.toString(res));
    }
}
