import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Integer> secondList = new ArrayList<Integer>();
        List<Integer> firstList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        for (int itVar : firstList) {
            if (itVar > 0 && itVar % 2 == 0) {
                secondList.add(itVar);
            }
        }
        secondList.sort(Integer::compareTo);
        System.out.println(secondList);
        System.out.println("******");
        StreamMain streamMain = new StreamMain();
        streamMain.streamMain();
    }
}