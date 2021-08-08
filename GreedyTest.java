import java.util.Arrays;
import java.util.stream.Stream;

public class GreedyTest {


    public static void main(String[] args) {

        int[] stock = {8, 2, 6, 5, 1, 7, 5};

//        Before
//        int num1=0;
//        //주식을 같은날 같은 가격에 팔 게 될 경우는 0원 이익이기에
//        //배열의 index 1부터 계산해서 max를 계산한다.
//        for(int i=0; i<stock.length; i++){
//            for(int j=1; j<stock.length; j++){
//                if(num1 <stock[j]-stock[i]){
//                    num1 = stock[j]-stock[i];
//                    System.out.println(stock[j] + " " + stock[i]);
//                }
//            }
//        }
//        System.out.println(num1);


//        After
        int max = 0;
        int min = stock[0];
        //주식을 같은날 같은 가격에 팔 게 될 경우는 0원 이익이기에
        //배열의 index 1부터 계산해서 max를 계산한다.
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] < min) {
                min = stock[i];

            }else {
                max=Math.max(max, stock[i]-min);
            }
        }
        System.out.println(max);
    }


}

//    public static void main(String[] args) {
//
//        int[]stock = {8,2,6,5,1,7,5};
//
//        int num1=0;
//        int num2=0;
//        //주식을 같은날 같은 가격에 팔 게 될 경우는 0원 이익이기에
//        //배열의 index 1부터 계산해서 max를 계산한다.
//        for(int i=0; i<stock.length; i++){
//            for(int j=1; j<stock.length; j++){
//                if(num1 <stock[j]-stock[i]){
//                    num1 = stock[j]-stock[i];
//                    System.out.println(stock[j] + " " + stock[i]);
//                }
//            }
//        }
//        System.out.println(num1);
//
//    }
