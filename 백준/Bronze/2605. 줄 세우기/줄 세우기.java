import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());   // N 입력받기
		
		ArrayList<Integer> student = new ArrayList<>(N);
		
	
		// 뽑은 번호 입력 받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int nums = Integer.parseInt(st.nextToken());
			student.add(i- nums, i+1);
		}
		
		
		// 출력하기
		student.forEach(s -> System.out.printf(s +  " "));
	}
}
