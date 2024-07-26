import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		if (N <= 3) {
			System.out.println(N % 15746);
		} else {
			int[] dp = new int[N + 1];
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 3;
			for (int i = 4; i <= N; i++) {
				dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
			}
			System.out.println(dp[N]);
		}
	}
}