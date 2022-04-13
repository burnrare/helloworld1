package co.edu.dimension;

public class ArrayExample {
	public static void main(String[] args) {
		int[][] intAry = new int[4][3];

		intAry[0][0] = 10;
		intAry[1][0] = 20;
		intAry[3][2] = 100;

		int[][] arr = new int[5][5];
		int[][] arr2 = new int[5][5];
		int[][] arr3 = new int[5][5];

		for (int j = 0; j < intAry.length; j++) {

			System.out.println();

			for (int i = 0; i < intAry[j].length; i++) {
				System.out.print("[" + j + "] " + "[" + i + "] => " + intAry[j][i]);
			}
			System.out.println();

//			for (int i = 0; i < intAry[j].length; i++) {
//				System.out.println(intAry[j][i]);
//			}
//
//			for (int i = 0; i < intAry[j].length; i++) {
//				System.out.println(intAry[j][i]);
//			}

		}

		System.out.println("-----------------------------------------------------");

		int cnt = 1;

		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				arr[i][j] = cnt++;
				System.out.printf("%3d", arr[i][j]);
			}
		}

		System.out.println("\n-----------------------------------------------------");

		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", arr[j][i]);
			}
		}

		System.out.println("\n-----------------------------------------------------");

		for (int i = 4; i >= 0; i--) { // 4 3 2 1 0 [j]
			System.out.println();
			for (int j = 0; j < 5; j++) { // 0 1 2 3 4 [j]
				System.out.printf("%3d", arr[i][j]);
			}
		}

		System.out.println("\n-----------------------------------------------------");

		cnt = 0;
		
		for (int i = 0; i < 5; i++) { // 가로 index[i]
			System.out.println();
			System.out.printf("%3d", arr2[i][0]);
			for (int j = 0; j < 4; j++) {
				System.out.printf("%3d", arr2[0][j]);
			}
			for (i = 1; i < 5; i++) { // 세로 index[i]
				System.out.println();
				for(int j = 0; j < 4; j++) {
					arr2[1][j] = cnt++;
//					System.out.printf("%3d", arr2[1][j]);
					System.out.print("1");
				}
			}
			
		}
		
		
		
		
		

	}
}
