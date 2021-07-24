import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GreedyTest {

    public static void main(String[] args) {

        int num = 7; //fearNumber 배열길이와 동일한 num
        int[] fearNumber = {2, 3, 1, 2, 2};
        int[] fearNumber2 = {5, 1, 1, 1, 1, 1, 1};

        GreedyTest a = new GreedyTest();
        System.out.println(a.check(num, fearNumber2));
    }


    public int check(int num, int[] fearNumber) {
        int number = num;
        int x=num;
        int count=0;
        for(int i=0; i<= number-1; i++){
            if(x>0){
                count++;
                x -=fearNumber[i];

            }

        }
        return count;
    }
}