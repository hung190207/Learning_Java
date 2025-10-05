package hw.sort;

import hw.utils.ArrayTools;

class Main {
    public static void main(String[] args) {

        int[] originalArray = ArrayTools.genRandomInts(214748366);

        var algorithms = new SortingAlgorithm[]{
                new BubbleSort(),
                new InsertionSort(),
                new SelectionSort()
        };


        for (SortingAlgorithm algorithm : algorithms) {
            int[] arr = originalArray.clone();
            System.out.println("Using " + algorithm.getClass().getSimpleName() + ":");
            algorithm.sort(arr);

            if (ArrayTools.isSorted(arr)) System.out.println("Array is sorted");
            else System.out.println("Array is NOT sorted");
        }

    }
}
