package pekan8_2511533012;

public class QuickSort_2511533012 {
    static void swap_2511533012(int[] arr_3012, int i_3012, int j_3012) {
        int temp_3012 = arr_3012[i_3012];
        arr_3012[i_3012] = arr_3012[j_3012];
        arr_3012[j_3012] = temp_3012;
        
    }

    static void medianOftrhree_2511533012(int[] arr_3012, int low_3012, int high_3012) {
        int mid_3012 = low_3012 + (high_3012 - low_3012) / 2;
        
        if (arr_3012[low_3012] > arr_3012[mid_3012]) {
            swap_2511533012(arr_3012, low_3012, mid_3012);
        }
        if (arr_3012[low_3012] > arr_3012[high_3012]) {
            swap_2511533012(arr_3012, low_3012, high_3012);
        }
        if (arr_3012[mid_3012] > arr_3012[high_3012]) {
            swap_2511533012(arr_3012, mid_3012, high_3012);
        }
        swap_2511533012(arr_3012, mid_3012, high_3012);
    }

    static int patition_2511533012(int[] arr_3012, int low_3012, int high_3012) {
        medianOftrhree_2511533012(arr_3012, low_3012, high_3012);
        
        int pivot_3012 = arr_3012[high_3012];
        int i_3012 = low_3012 - 1;

        for (int j_3012 = low_3012; j_3012 <= high_3012 - 1; j_3012++) {
            if (arr_3012[j_3012] < pivot_3012) {
                i_3012++;
                swap_2511533012(arr_3012, i_3012, j_3012);
            }
        }
        swap_2511533012(arr_3012, i_3012 + 1, high_3012);
        return i_3012 + 1;
    }

    static void Quicksort_2511533012(int[] arr_3012, int low_3012, int high_3012) {
        if (low_3012 < high_3012) {
            int pi_3012 = patition_2511533012(arr_3012, low_3012, high_3012);
            Quicksort_2511533012(arr_3012, low_3012, pi_3012 - 1);
            Quicksort_2511533012(arr_3012, pi_3012 + 1, high_3012);
        }
    }

    public static void printArr_2511533012(int[] arr_3012) {
        for (int i_3012 = 0; i_3012 < arr_3012.length; i_3012++) {
            System.out.print(arr_3012[i_3012] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr_3012 = {10, 7, 8, 9, 1, 5};
        int N_3012 = arr_3012.length;
        System.out.println("Data sebelum di urutkan: ");
        printArr_2511533012(arr_3012);

        Quicksort_2511533012(arr_3012, 0, N_3012 - 1);

        System.out.println("Data terurut quicsort: ");
        printArr_2511533012(arr_3012);
    }
}
