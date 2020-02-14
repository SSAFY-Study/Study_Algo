import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n��m8_Main {
	static int n,m;
	static int[] inData;
	static int[] output;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		inData = new int[n];
		output = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < inData.length; i++) {
			inData[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(inData);
		dfs(0);
		
		br.close();
		bw.flush();
		bw.close();
		
	}//end of main
	public static void dfs(int depth) throws IOException {
		if (depth == m) {
			for (int i = 0; i < output.length; i++) {
				bw.write(output[i] + " ");
			}
			bw.newLine();
		} else {
			for (int i = 0; i < inData.length; i++) {
				if(depth != 0 && inData[i]<output[depth-1]) continue;
				output[depth] = inData[i];
				dfs(depth+1);
			}
		}
	}
	
}//end of class













