
public class ArrayUtils {

	// Ordena el arreglo en orden decreciente
	public static <Q extends Comparable<? super Q>> void sort(Q [] a, int nelems) {
		for (int i = 0; i < nelems; i++) {
			for (int j = i+1; j < nelems; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					Q temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	
	public static <Q extends Comparable<? super Q>> Q min(Q [] a, int nelems) {
		
		
		return null;
	}
	
	public static <Q extends Comparable<? super Q>> Q max(Q [] a, int nelems) {
		
		
		return null;
	}
		
}
