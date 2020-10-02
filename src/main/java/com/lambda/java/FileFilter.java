package com.lambda.java;
import java.io.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class FileFilter {
	
	public static int subdir(String path) {
	File file=new File(path);
	int count=0;
	File[] paths=file.listFiles();
    Predicate<File> p= f->f.isDirectory();
    Consumer<File> con=f->System.out.println(f.getName());
    for(File fl:paths) {
    	if(p.test(fl)) {
    		con.accept(fl);
			count++;
    	}
    }
    return count;
}

}
