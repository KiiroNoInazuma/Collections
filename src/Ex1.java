
import java.util.*;

public class Ex1 {

    static void showOdd(List<Integer> list) {
        for (Integer integer : list) {
            if (integer % 2 != 0)
                System.out.println(integer);
        }
    }

    static void showEven(TreeSet<Integer> list) {
        for (Integer integer : list) {
            if (integer % 2 == 0)
                System.out.println(integer);
        }
    }

    static void showWord(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int k = 1; k < list.size(); k++) {
                if (list.get(i).equals(list.get(k)) && i < k) {
                    System.out.println(list.get(i));
                    break;
                } else if (list.get(i).equals(list.get(k)) && i > k) {
                    break;
                }

            }
        }
    }

    static void repeaters(ArrayList<String> ar) {
        int check = 1;
        Collections.sort(ar);
        for (int i = 0; i < ar.size() - 1; i++) {
            if (ar.get(i).equals(ar.get(i + 1))) {
                check++;

                if (i == ar.size() - 2) {
                    if (ar.get(ar.size() - 1).equals(ar.get(ar.size() - 2))) {
                        check++;
                        System.out.println(ar.get(i) + " - " + (check - 1));
                    }

                }

            } else {

                System.out.println(ar.get(i) + " - " + check);
                check = 1;
                if (i == ar.size() - 2) {
                    System.out.println(ar.get(i + 1) + " - " + check);
                }
            }
        }
    }

    static void repeaterV2(ArrayList<String> arr) {
        TreeSet<String> set = new TreeSet<>(arr);
        Iterator<String> it = set.iterator();
        String test;
        int count = 0;
        while (it.hasNext()) {
            test = it.next();
            for (String s : arr) {
                if (test.equals(s)) {
                    count++;
                }
            }
            System.out.print(test+" - ");
            System.out.println(count);
            count = 0;
        }
    }


    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<>(List.of("Красный", "Фиолетовый", "Зеленый", "Красный", "Фиолетовый", "Фиолетовый", "Синий", "Зеленый", "Желтый", "Зеленый", "Желтый", "Синий"));
        repeaterV2(color);
        System.out.println("---");
        repeaters(color);
    }
}
