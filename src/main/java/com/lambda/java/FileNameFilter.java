package com.lambda.java;
import java.io.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FileNameFilter {

	public static int filename(String path,String extension) {
		File file=new File(path);
		int count=0;
		String[] files=file.list();
		Predicate<String> p= f->f.endsWith(extension);
	    Consumer<String> con=f->System.out.println(f);
	    for(String f:files) {
	    	if(p.test(f)){
	    		con.accept(f);
	    		count++;
	    	}
	    }
		return count;
		
	}
}
