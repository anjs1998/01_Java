package edu.kh.io.pack2.run;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		str2 = str2 + "world";
		System.out.println(str2.hashCode());
		
		//가변성의 StringBuilder, StringBuffer
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.hashCode());
		
		sb.append("Hello World");
		sb.append("12345");
		System.out.println(sb.hashCode());
		
		ByteService service = new ByteService();
		service.fileByteOutput();
		service.bufferedFileByteOutput();
		service.fileByteInput2();
		service.bufferedFileByteInput();
		service.readProperties();
		service.fileCopy();
	}
	
	
}
