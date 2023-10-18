import java.util.ArrayList;
import java.util.Scanner;

public class l5_w3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        int num1;
        while ((num1 = sc.nextInt()) != 0) {
            list1.add(num1);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        int num2;
        while ((num2 = sc.nextInt()) != 0) {
            list2.add(num2);
        }
        ArrayList<Integer> result = SortMergeList.intersect(list1, list2);
        System.out.println(result.toString());
    }
}

class SortMergeList {
    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()) {
            int n1 = list1.get(i);
            int n2 = list2.get(j);

            if (n1 == n2) {
                result.add(n1);
                i++;
                j++;
            } else if (n1 < n2) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
