// Реализовать алгоритм пирамидальной сортировки (сортировка кучей)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class app2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 20; i++) {
            arr.add(rnd.nextInt(1, 100));
        }
        System.out.println(arr);
        sort(arr);
        System.out.println(arr);
    }
    public static void sort(ArrayList<Integer> arr)
    {
        int n = arr.size();

        for (int i = n / 2 - 1; i >= 0; i--)
            heap(arr, n, i);

        for (int i=n-1; i>=0; i--)
        {
            Collections.swap(arr, 0, i);
            heap(arr, i, 0);
        }
    }
    public static void heap(ArrayList<Integer> arr, int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr.get(l) > arr.get(largest))
            largest = l;

        if (r < n && arr.get(r) > arr.get(largest))
            largest = r;

        if (largest != i)
        {
            Collections.swap(arr, i, largest);
            heap(arr, n, largest);
        }
    }
}
