import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M;
	static int[][] graph;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		graph = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String line = br.readLine();
			for(int j=0; j<M; j++) {
				graph[i][j] = line.charAt(j) -'0';
			}
				
		}
		BFS(0, 0);
		System.out.println(graph[N-1][M-1]);
		
	}

	private static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();  // 큐 생성
		queue.offer(new int[] {i, j});            // 큐에 삽입
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			int x = now[0];
			int y = now[1];
			
			for(int k=0; k<4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				
				if(nx >=0 && nx < N && ny >= 0 && ny < M && graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					queue.offer(new int[] {nx, ny});
				}
			}
		}
	}
}