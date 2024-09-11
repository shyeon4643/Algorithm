import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1];
		int[] arr = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = 0;
		dp[1] = arr[1];
		for (int i = 2; i <= N; i++) {
			if (i == 2) {
				dp[i] = arr[i] + arr[i - 1];
			} else {
				dp[i] = Math.max(dp[i-1] ,Math.max(dp[i - 2] + arr[i], arr[i - 1] + dp[i - 3] + arr[i]));
			}
		}
		System.out.println(dp[N]);

	}
}
