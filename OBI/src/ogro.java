import java.util.*;
public class ogro {
	public static void main(String asrgs[]) {
		Scanner in = new Scanner(System.in);
		
		int e = in.nextInt();
		int d = in.nextInt();
		int resultado = 0;
		
		 
			if(e > d) {
				resultado = e + d;
				
			}else {
				resultado =  (d - e) * 2;
				
			}
		System.out.printf("%d\n", resultado);
		
	}
}
