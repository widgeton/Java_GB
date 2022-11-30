//Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.Random;

public class app0 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int length = 13;
        ArrayList<Integer> intArray = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            intArray.add(rnd.nextInt(1, 100));
        }
        System.out.println(intArray);
        System.out.println(mergeSort(intArray));
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> intArray) {
        ArrayList<Integer> arr1 = new ArrayList<>(intArray.subList(0, intArray.size() / 2));
        ArrayList<Integer> arr2 = new ArrayList<>(intArray.subList(intArray.size() / 2, intArray.size()));

        if (intArray.size() == 1) return intArray;
        return compareArrays(mergeSort(arr1), mergeSort(arr2));
    }

    public static ArrayList<Integer> compareArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> intArray = new ArrayList<>();
        int length = arr1.size() + arr2.size();
        for (int i = 0; i < length; i++) {
            if (arr1.isEmpty()){
                intArray.addAll(arr2);
                break;
            }
            else if (arr2.isEmpty()){
                intArray.addAll(arr1);
                break;
            }
            else if (arr1.get(0) < arr2.get(0)) {
                intArray.add(arr1.get(0));
                arr1.remove(0);
            } else {
                intArray.add(arr2.get(0));
                arr2.remove(0);
            }
        }
        return intArray;
    }
}
