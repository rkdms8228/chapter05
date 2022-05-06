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

public class InfoListAdd {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB_원본-2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		List<Info> iArray = new ArrayList<Info>();
		
		while(true) {
				
			String str = br.readLine();
			
			if(str == null) {
				break;
			}else {
				
				String[] info = str.split(",");
				iArray.add(new Info(info[0], info[1], info[2]));
				
			}
			
		}
		
		//내 정보 추가
		iArray.add(new Info("김가은", "010-8563-8228", "055-111-1111"));
			
			for(Info i : iArray) {
				
				System.out.println("이름: "+i.getName());
				System.out.println("핸드폰: "+i.getHp());
				System.out.println("회사: "+i.getCompany());
				System.out.println();
				
				//추가한 정보 데이터에 추가
				String save = i.getName()+","+i.getHp()+","+i.getCompany();
				bw.write(save);
				bw.newLine();
				
			}
			
		bw.close();
		br.close();

	}

}
