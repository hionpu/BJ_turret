import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfCase = Integer.parseInt(br.readLine());

		int[] input = new int[6];

		while ( numberOfCase-- > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for (int i = 0; i < input.length; i++) {
				input[i] = Integer.parseInt(st.nextToken());
			}
			System.out.println(solution(input));
		}
	}
		public static int solution(int[] input){
			int x1 = input[0];
			int y1 = input[1];
			int r1 = input[2];
			int x2 = input[3];
			int y2 = input[4];
			int r2 = input[5];

		if (x1 == x2 && y1 == y2) {
			if (r1 == r2) {
				return -1;
			} else {
				return 0;
			}
		}

		int centerDistanceSquared = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);

		if ((r1 + r2) * (r1 + r2) == centerDistanceSquared ||
			(r1 - r2) * (r1 - r2) == centerDistanceSquared ) {
			return 1;
		}
		else if ((r1 - r2) * (r1 - r2) > centerDistanceSquared ||
			(r1 + r2) * (r1 + r2) < centerDistanceSquared)
		{
			return 0;
		}
		else
		{
			return 2;
		}
	}
}

