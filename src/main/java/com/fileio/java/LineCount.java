package com.fileio.java;
import java.io.*;
public class LineCount {

	public static int count(File file) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(file));
		int count=0;
		while(br.readLine()!=null) {
			count++;
		}
		br.close();
		return count;
	}
}
