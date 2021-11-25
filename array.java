package EEDD;

public class array {

	public static void main(String[] args) {
		int[] array = new int[20];
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * 10) + 1);
			System.out.print("  " + array[i]);
		}
		System.out.print("  ]");

		for (int i = 0; i < array.length; i++) {
			System.out.print("  " + array[i]);
		}
		int[] contadores = new int [array.lenght];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i] == array[j])
					contador[i]++;
			}
		}
	}

}
