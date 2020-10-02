package com.stream.java;
import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
public class RandmNumber {

	public static void generateRandNum(String path) throws IOException {
		
    ArrayList<Integer> list=new ArrayList<Integer>();
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(path))){
			for(int i=0;i<200;i++) {
				int num=(int) (Math.random()*50+1);
				bw.write(num+"\n");		
			}		
		}
		try(BufferedReader br=new BufferedReader(new FileReader(path))){
			while(br.readLine()!=null) {
				list.add(Integer.parseInt(br.readLine()));
			}		
		}
		
		list.stream().distinct().sorted().forEach(e->System.out.println(e));
	}
}
