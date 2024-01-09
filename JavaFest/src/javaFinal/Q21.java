package javaFinal;

public class Q21 {

	public static void main(String[] args) {
		//아래와 같은 배열에서 두개의 숫자를 뽑아 서로의 거리를 비교한 후 거리가 가장 작은 숫자의 위치(index)출력
		int[] point = {92,32,52,9,31,2,68};
		
		
		
		int firstIndex = 0;
		int secondIndex = 0;
		int result = point[0] - point[1];
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j <= point.length; j++) {
				if(result > (point[i]-point[j])){
					firstIndex = i;
					secondIndex = j;
				}else {
					System.out.println("wrong");
				}
				
			}
			
		}System.out.println( firstIndex + secondIndex);
		

	}

}
