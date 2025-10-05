package hw.sort;

public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int step = 1; step < n; step++) {
            int key = arr[step];
            int j = step - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
    }
}
