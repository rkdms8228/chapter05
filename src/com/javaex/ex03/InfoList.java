package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class InfoList {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB_원본-1.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		//리스트 생성
		List<Info> iArray = new ArrayList<Info>();
		
		while(true) {
				
			String str = br.readLine();
			
			if(str == null) {
				break;
			}else {
				
				//배열 관리
				String[] info = str.split(",");
				iArray.add(new Info(info[0], info[1], info[2]));
				
			}
			
			//해당 부분까지 write로 입력해야 출력 겹치지 않음
			bw.write(str);
			bw.newLine();
		}
			
		//전체 출력
			for(Info i : iArray) {
				
				System.out.println("이름: "+i.getName());
				System.out.println("핸드폰: "+i.getHp());
				System.out.println("회사: "+i.getCompany());
				System.out.println();
				
			}
			
		bw.close();
		br.close();

	}

}
