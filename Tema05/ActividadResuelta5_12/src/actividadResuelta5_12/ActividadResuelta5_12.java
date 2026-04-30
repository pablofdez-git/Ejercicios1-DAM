package actividadResuelta5_12;

import java.util.Arrays;

public class ActividadResuelta5_12 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[5][5];
		
		for(int n = 0; n<5;n++) {
			for(int m = 0; m<5;m++) {
				matriz[n][m] = 10 * n * m;
			}
		}
		
		System.out.println(Arrays.deepToString(matriz));
		
	}

}
