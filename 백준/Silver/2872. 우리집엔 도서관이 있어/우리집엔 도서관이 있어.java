import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int current = N, count = 0;
		for (int i = N-1; i >= 0; i--) {
			if(arr[i] == current){
				current--;
			}else{
				count++;
			}
		}
		System.out.println(count);
	}
}