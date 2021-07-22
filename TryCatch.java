

public class TryCatch {


    public static void main(String[] args) {

        String input = "in(f(le)ar)n)";
        String input2 = "a)b(c)d";
        String input3 = "(a(b(c)d)";
        String input4 = "))((";
        String input5 = ")()(";
        TryCatch a = new TryCatch();
        System.out.println(a.check(input5));


    }


    public String check(String input5) {

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        int count = 0;

        for (char c : input5.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if(count == 0) continue; //char 삭제를 continue로 건너 뛰는 방법으로 구현
                count--;
            }
                a.append(c);
        }
        for(int i=a.length()-1; i>=0; i-- ){
            if (a.charAt(i)=='(' && count-->0) continue;
            //다른 경우수 생각안하고 일단은 문제에서 말하는 그대로 구현해보려 할 것
            //앞에서부터 저장시 )(로 나오고
            //뒤에서부터 저장시 ()로 나온다.
            b.append(a.charAt(i));

        }
        return b.reverse().toString();
    }

}