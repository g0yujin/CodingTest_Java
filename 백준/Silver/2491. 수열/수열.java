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
		int count = 1;		//수열의 길이 카운트
		
		// 연속해서 커지는 경우
		for(int i=0; i<N-1; i++) {
			if(nums[i] <= nums[i+1]) {
				count += 1;
			}else {
				result.add(count); 
				count = 1;
			}
		}
		result.add(count);  
	
		//연속해서 작아지는 경우
		count = 1;
		for(int i=0; i<N-1; i++) {
			if(nums[i] >= nums[i+1]) {
				count += 1;
			}else {
				result.add(count); 
				count = 1;
			}
		}
		result.add(count);  
		
		// 최대 수열의 길이 구하기
		int max = result.get(0);
		for(int num:result) {
			if(num > max) max = num;
		}
		
		System.out.println(max);
		
	}
}
