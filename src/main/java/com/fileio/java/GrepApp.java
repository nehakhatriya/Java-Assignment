package com.fileio.java;
import java.util.*;
import java.io.*;
public class GrepApp {

	static Map<Integer,String> src;
	public static Map<Integer,String> search(String key,File file)  throws IOException{
		src=new LinkedHashMap<Integer,String>();
		BufferedReader br=new BufferedReader(new FileReader(file));
		int line=1;String str;
		while((str=br.readLine())!=null) {
			if(str.contains(key)) {
				src.put(line, str);
			}
			line++;
		}
		for( Integer i: src.keySet()) {
			System.out.println(i+":"+src.get(i));
		}
	   br.close();
		return src;
	}
}
