package hw.sort;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int step = 0; step < n; step++) {
            int min = step;

            for (int i = step + 1; i < n; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            int temp = arr[step];
            arr[step] = arr[min];
            arr[min] = temp;
        }
    }

}
