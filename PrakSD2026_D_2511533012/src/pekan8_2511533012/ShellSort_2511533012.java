package pekan8_2511533012;

public class ShellSort_2511533012 {
	
	   public static void shellsort_2511533012(int[] A_3102) {
	        int n_3102 = A_3102.length;
	        int gap_3102 = n_3102 / 2;
	        while (gap_3102 > 0) {
	            for (int i_3102 = gap_3102; i_3102 < n_3102; i_3102++) {
	                int temp_3102 = A_3102[i_3102];
	                int j_3102 = i_3102;
	                while (j_3102 >= gap_3102 && A_3102[j_3102 - gap_3102] > temp_3102) {
	                    A_3102[j_3102] = A_3102[j_3102 - gap_3102];
	                    j_3102 = j_3102 - gap_3102;
	                }
	                A_3102[j_3102] = temp_3102;
	            }
	            gap_3102 = gap_3102/2;
	        }
	        
	    }

	    public static void main(String[] args) {
	        int[] data_3102 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};

	        System.out.print("Sebelum: ");
	        printArray_2511533012(data_3102);

	        shellsort_2511533012(data_3102);

	        System.out.println("sesudah (shellsort): ");
	        printArray_2511533012(data_3102);
	    }

	    public static void printArray_2511533012(int[] arr_3102) {
	        for (int i_3102 : arr_3102)
	            System.out.print(i_3102 + " ");
	        System.out.println();
	    }
}
