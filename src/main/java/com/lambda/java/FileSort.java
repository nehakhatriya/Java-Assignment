package com.lambda.java;
import java.io.*;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class FileSort {

	private static Stream<File> files(File[] files,Predicate<File> p) {
		Stream<File> file=Stream.of(files).filter(p).sorted();
		return file;
	}
	
	private static Stream<File> directories(File[] files,Predicate<File> p) {
		Stream<File> dir=Stream.of(files).filter(p).sorted();
		return dir;
	}
	
	public static void main(String[] args) {
		
		File[] file= {new File("X://lineWord.txt"),new File("X://GOT"),new File("X://AWS"),new File("X://Emp.txt")};
		Stream<File> dir=directories(file,f->f.isDirectory());
		Stream<File> fl=files(file,f->!f.isDirectory());
		Stream<File> sorted=Stream.concat(dir,fl);
		sorted.forEach(System.out::println);
	}
	
	
}
