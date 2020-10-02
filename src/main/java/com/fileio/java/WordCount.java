package com.fileio.java;
import java.io.*;
public class WordCount {

	public static int count(File file) throws FileNotFoundException,IOException {
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		int count=0;String str="";
		while((str=br.readLine())!= null) {
			String words[]=str.split(" ");
			count=count+words.length;
		}
		br.close();
		return count;
	}
}
