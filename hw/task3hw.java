// Реализовать алгоритм пирамидальной сортировки (HeapSort).

package hw;

public class task3hw {

    public static void main(String args[]) {
        int arr[] = { 18, 21, 30, 5, 15, 7 };
        sort(arr);

        System.out.println("Отсартированный массив: ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

    }

    public static void sort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            kucha(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            kucha(arr, i, 0);
        }
    }

    static void kucha(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            kucha(arr, n, largest);
        }
    }

}
