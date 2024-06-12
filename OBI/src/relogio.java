import java.util.Scanner;

public class relogio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int h = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        
        int T = in.nextInt();
        
        int totalSeconds = h * 3600 + m * 60 + s;
        totalSeconds += T;
        
        int newH = (totalSeconds / 3600) % 24;
        int newM = (totalSeconds / 60) % 60;
        int newS = totalSeconds % 60;
        
        System.out.printf("%d\n",newH);
        System.out.printf("%d\n",newM);
        System.out.printf("%d\n",newS);
    }
}