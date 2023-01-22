
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
            System.out.print(test + " - ");
            System.out.println(count);
            count = 0;
        }
    }

    static void replace(List<Integer> arr) {
        Set<Integer> set = new HashSet<>(arr);
        List<Integer> temp = new ArrayList<>();
        Iterator<Integer> it = set.iterator();
        int test;
        int count = 0;
        while (it.hasNext()) {
            test = it.next();
            for (Integer integer : arr) {
                if (test == integer) {
                    count++;
                }
            }
            if (count == 1) {
                temp.add(test);
            }
            count = 0;
        }
        for (int i = 0; i < arr.size(); i++) {
            for (Integer integer : temp) {
                if (arr.get(i) == integer.intValue()) {
                    arr.set(i, -1);
                }
            }
            if (arr.get(i) != -1) {
                arr.set(i, 0);
            }
        }

    }

    static void sumOriginal(List<Integer> list) {
        int sum = 0;
        replace(list);
        System.out.println(list);
        for (Integer integer : list) {
            sum += Math.abs(integer);
        }
        System.out.println("Всего " + sum + " уникальных значений.");

    }




    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<>(List.of("Красный", "Фиолетовый", "Зеленый", "Красный", "Фиолетовый", "Фиолетовый", "Синий", "Зеленый", "Желтый", "Зеленый", "Желтый", "Синий"));


    }
}
