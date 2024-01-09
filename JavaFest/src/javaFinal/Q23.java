package javaFinal;

public class Q23 {

	public static void main(String[] args) {
		//아래와 같은 2차원 배열을 왼쪽으로 90도 회전하여 출력하시오
//		원본
//		{{1,2,3,4,5},
//		{6,7,8,9,10},
//		{11,12,13,14,15},
//		{16,17,18,19,20},
//		{21,22,23,24,25}}
		
//		90도회전
//		{{5,10,15,20,25},
//		{4,9,14,19,24},
//		{3,8,13,18,23},
//		{2,7,12,17,22},
//		{1,6,11,16,21}}
		
		int[][] arr = new int [5][5];
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 4; j >= 0 ; j--) {
				arr[j][i] = count;
				count++;
				
			}
			
		}
		
		/*  int[0][0] =5
		/*  int[0][1] =10
		/*  int[0][2] =15
		/*  int[0][3] =20
		/*  int[0][4] =25
		 * 
		 */
		/*  int[1][0] =4
		/*  int[1][1] =9
		/*  int[1][2] =14
		/*  int[1][3] =19
		/*  int[1][4] =24
		 * 
		 * 
		 * 
		/*  int[3][0] =2
		/*  int[3][1] =7
		/*  int[3][2] =12
		/*  int[3][3] =17
		/*  int[3][4] =22
		 * 
		 */
		/*  int[4][0] =1
		/*  int[4][1] =6
		/*  int[4][2] =11
		/*  int[4][3] =16
		/*  int[4][4] =21
		 */
		 
		 
		
		//출력문
		for (int[] array : arr) {
			for (int array1 : array) {
				System.out.print(array1 + " ");
			}
			System.out.println();
			
		}
	}

}
