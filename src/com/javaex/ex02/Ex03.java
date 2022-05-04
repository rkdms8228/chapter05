package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex03 {
	
	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\MS949-copy.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);
		
		while(true) {
			
			String str = br.readLine(); //한 줄씩 읽어 옴 | 줄 바꿈 기호는 제외
			
			if(str == null) {
				break;
			}
			
			System.out.println(str);
			bw.write(str);
			bw.newLine();
			
		}
		
		bw.close(); //닫아 주지 않으면 빈 파일이 나옴
		br.close();
		
	}

}
