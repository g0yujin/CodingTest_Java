import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] nums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		
		ArrayList<Integer> result = new ArrayList<>(); //수열의 길이를 저장할 배열
		
		int plusCnt = 1;	// 증가하는 수열의 길이
		int minusCnt = 1;   // 감소하는 수열의 길
		
		
		for(int i=0; i<N-1; i++) {
			   // 증가하는 수열 체크
			   if(nums[i] <= nums[i+1]) {
			       plusCnt += 1;
			   } else {
			       result.add(plusCnt);
			       plusCnt = 1;
			   }
			   
			   // 감소하는 수열 체크 
			   if(nums[i] >= nums[i+1]) {
			       minusCnt += 1;
			   } else {
			       result.add(minusCnt);
			       minusCnt = 1;
			   }
			}
			// 마지막 수열들 추가
			result.add(plusCnt);
			result.add(minusCnt);
		
			
			
		
		// 최대 수열의 길이 구하기
		int max = result.get(0);
		for(int num:result) {
			if(num > max) max = num;
		}
		
		System.out.println(max);
		
	}
}
