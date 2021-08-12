package practice;


import static jdk.nashorn.internal.objects.Global.print;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public static void main(String[] args) {

        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        List<List<Integer>> relist = convert(A);
        System.out.println(relist);

        int[][] B = reConvert(relist);

        for(int i=0; i<B.length; i++){
            for (int j=0; j<B[i].length; j++){
                System.out.println("B[" + i +"]" + " " + B[i][j]);
            }
        }

    }

    private static int[][] reConvert(List<List<Integer>> relist) {

        int[][] array = new int[relist.size()][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[relist.get(i).size()];
        }

        for (int i = 0; i < relist.size(); i++) {
            for (int j = 0; j < relist.get(i).size(); j++) {
                array[i][j] = relist.get(i).get(j);
            }
        }

        return array;
    }

    private static List<List<Integer>> convert(int[][] a) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < a.length; j++) {
                list.add(a[i][j]);
            }
            result.add(list);
        }

        return result;
    }

}
