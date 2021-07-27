public class GreedyTest {

    int start, finish;

    public static void main(String[] args) {

//        String input = "banana";
        String input = "bbbb";//끝에 연속된 문자가 같다면 끝에 b는 나오지 않는 경우 처리

        System.out.println(new GreedyTest().resolve(input));

    }

    public String resolve(String input) {

        int lens = input.length();
        for (int i = 0; i < lens; i++) {

            if (input.length() % 2 == 0) {

                findSubString(input, i, i + 1); //odd

            } else {

                findSubString(input, i, i); //even

            }

        }
        return input.substring(start, finish + start);

    }

    public void findSubString(String input, int left, int right) {
        while (0 <= left && right < input.length() && input.charAt(left) == input.charAt(right)) {

            left--; //넘아갈때에는 --로 한번 연산되는 것 염두
            right++;
            System.out.println(left + " " + right);

        }
        if (finish < right - left - 1) {
            start = left + 1;
            finish = right - left - 1;
        }
    }
}