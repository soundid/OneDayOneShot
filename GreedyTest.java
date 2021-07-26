public class GreedyTest {

    public static void main(String[] args) {


        String input[] = {"test", "teacher"};
        System.out.println(new GreedyTest().solve(input));

    }

    public String solve(String[] input) {

        if (input.length == 0) return "";

        String firstStr = input[0];

        for (int i = 1; i < input.length; i++) {

            while (input[i].indexOf(firstStr) != 0) {
            //공통된 te라는 동일한 문구 찾게 위해 firstStr.length()-1를 해줌으로써
            // te의 t의 위치인 0이 나오도록 while문 조건으로 걸어준다.
            //그리고 0이 나올 때에 firstStr에 담기는 te를 return 하게 한다.

                firstStr = firstStr.substring(0, firstStr.length()-1);

            }

        }
        return firstStr;
    }
}