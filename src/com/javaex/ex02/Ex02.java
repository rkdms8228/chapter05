package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {
	
	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			
			String str = br.readLine(); //한 줄씩 읽어 옴 | 줄 바꿈 기호는 제외
			
			if(str == null) {
				break;
			}
			
			System.out.println(str);
			
		}
		
		br.close();
		
	}

}
