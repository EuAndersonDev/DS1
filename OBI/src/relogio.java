import java.util.Scanner;

public class relogio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int S = scanner.nextInt();
        
    
        int T = scanner.nextInt();
        

        int totalSeconds = H * 3600 + M * 60 + S;
        

        totalSeconds += T;
        
        int newH = (totalSeconds / 3600) % 24;
        int newM = (totalSeconds / 60) % 60;
        int newS = totalSeconds % 60;
        
 
        System.out.printf("%d\n",newH);
        System.out.printf("%d\n",newM);
        System.out.printf("%d\n",newS);
        

    }
}