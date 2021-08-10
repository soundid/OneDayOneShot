import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class GreedyTest {


    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
        int seven = 7;
        System.out.println(checkCount7(nums, seven));
        System.out.println(checkByMap(nums, seven));

    }

    private static int checkCount7(int[] nums, int seven) {
//        int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
//        int seven = 7;
        int checkSeven = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) { //이중 for문으로 하는 이유 각 i위치별로 연속된 숫자의 케이스를 구하기 위해.
            checkSeven = 0;
            for (int j = i; j < nums.length; j++) { // i위치의 숫자를 더하는 것이 아닌 그 다음

                checkSeven = checkSeven + nums[j];
                if (checkSeven == seven) {

                    count++;
                }

            }
        }
        return count;
    }

    private static int checkByMap(int[] nums, int seven) {

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); //기준점 더한값이 7일경우에 빈도수체크 및 count해주는 값
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - seven)) {
                count += map.get(sum - seven); // 더한값에서 -7을 해준 값이 있는지를 파악해서 count해주는 방식
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1); //더한 동일한 값이 존재한 빈도수 체크용

        }

        return count;
    }
}
