import java.util.Arrays;
import java.util.stream.Stream;

public class GreedyTest {


    public static void main(String[] args) {

        String input = "02894";

        long result = input.charAt(0)-'0';
        //result를 잡고 들어가는 이유 하기 조건문에서 num 또는 result가 0일경우에 더해주라는 조건이 없다면 result는 무조건 0이 된다.
        //제일 앞자리가 0일 경우엔 한번은 0보다 큰 다른 숫자가 한번은 더해진다.
        //제일 앞자리가 0이 아니라면 result가 0이 아니라면 숫자들이 곱해진다.


        for (int i = 0; i < input.length(); i++) {

            int num = input.charAt(i)-'0';
            if (result<= 1 || num<=1) {
                result += input.charAt(i) - '0';
            } else {
                result *= input.charAt(i) - '0';
            }

        }

        System.out.println(result);

    }

}
