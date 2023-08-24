import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 숫자의 갯수 입력받음
        String input = sc.next(); //숫자 n개 입력받음
        
        int sum=0;// 초기화
        
        for(int i =0;i<N;i++){
           sum+=input.charAt(i)-'0';
        }
    System.out.print(sum);
    }
}