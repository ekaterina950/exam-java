import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void alternate( List<Integer> list,List<Integer> newList ){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int length1 = list.size();
        int length2 = newList.size();
        int res = 0;
        int res1 =0;
        if (length1 > length2) {
            res = length2;
            res1 = length1;
            for (int i = 0; i < res; i++) {

                result.add(list.get(i));
                result.add(newList.get(i));
            }
            for (int i = res; i < res1; i++) {

                result.add(list.get(i));

            }
        } else {
            res = length1;
            res1=length2;
            for (int i = 0; i < res; i++) {

                result.add(list.get(i));
                result.add(newList.get(i));
            }
            for (int i = res; i < res1; i++) {

                result.add(newList.get(i));

            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5,4,4,4,4);
        List<Integer> newList = Arrays.asList(2, 5, 8,8,8,8,8,8);
        alternate(list, newList);

    }
}