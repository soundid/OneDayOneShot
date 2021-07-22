public class TryCatch {


    public static void main(String[] args) {


        String num1 = "123";
        String num2 = "888";
        TryCatch a = new TryCatch();
        System.out.println(a.solve(num1, num2));


    }



    public String solve(String num1, String num2) {
        int carry = 0;

        StringBuilder sb = new StringBuilder();
        int numLengthA = num1.length() - 1; //이렇게
        int numLengthB = num2.length() - 1;

        while (numLengthA >= 0 || numLengthB >= 0) {
            int numA = 0;
            int numB = 0;
            numA = num1.charAt(numLengthA) - '0';
            numB = num2.charAt(numLengthB) - '0';
//        carry = (numA + numB)/10;
            int sum = numA + numB + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            numLengthA--;
            numLengthB--;

        }
        if (carry != 0) sb.append(carry); //마지막 끝에 carry에 들어간 숫자가
        return sb.reverse().toString();
    }


}