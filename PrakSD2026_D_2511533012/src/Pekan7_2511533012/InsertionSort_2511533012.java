package Pekan7_2511533012;

public class InsertionSort_2511533012 {
	
	public static void InsertionSort_2511533012(int[] arr_3012) {
		int n_3012 = arr_3012.length;
		for (int i_3012 = 1; i_3012 < n_3012; i_3012++) {
			int key_3012 = arr_3012[i_3012];
			int j_3012 = i_3012 - 1;
			while (j_3012 >= 0 && arr_3012[j_3012] > key_3012) {
				arr_3012[j_3012 + 1] = arr_3012[j_3012];
				j_3012--;
			}
			arr_3012[j_3012 + 1] = key_3012;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_3012[] = {23, 78, 45, 8, 32, 56, 1};
		int n_3012 = arr_3012.length;
		System.out.print("array yang belum terurut: \n");
		for (int i_3012 = 0; i_3012 < n_3012; i_3012++)
			System.out.print(arr_3012[i_3012] + " ");
		System.out.println("");
		InsertionSort_2511533012(arr_3012);
		System.out.print("array yang terurut: \n");
		for (int i_3012 = 0; i_3012 < n_3012; i_3012++)
			System.out.print(arr_3012[i_3012] + " ");
		System.out.println("");
	}

}
