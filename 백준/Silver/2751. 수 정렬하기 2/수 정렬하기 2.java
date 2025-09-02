import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i =0; i<n ; i++)
			list.add(Integer.parseInt(bf.readLine()));
		
		Collections.sort(list);
		
		for(int a:list)
			sb.append(a+"\n");
		
		System.out.println(sb);
	}
}