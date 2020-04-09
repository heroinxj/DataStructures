package topinterview.other;

/**
 * 11. Container With Most Water
 *     盛最多水的容器
 *
 * @author Heroin X
 * @date 2020/3/25 15:46
 */
public class MaxArea11 {
    public static void main(String[] args) {

//        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        int[] arr = new int[0];
        int i = maxArea(arr);
        System.out.println(i);

    }

    public static int maxArea(int[] height) {
        int len = height.length;
//        if(len <= 1 || height == null){
//            return 0;
//        }

        int left = 0, right = len-1;
        int maxWater = 0;
        int high = 0;

        while( left <= right){
            int width = right - left;
            //int high = Math.min(height[left], height[right]);
            if(height[left] > height[right]){
                high = height[right];
                right--;
            }else{
                high = height[left];
                left--;
            }
            maxWater = Math.max(maxWater, high * width);
        }

        return maxWater;
    }
}
