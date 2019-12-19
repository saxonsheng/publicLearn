package com.saxon.testdemo.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ReadPerson {

	private String path = "C:\\Users\\Think\\Desktop\\persons.txt";
	
	@Test
	public void read() {
		
		File file = new File(path);
		BufferedReader reader = null; 
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			List<Person> persons = new ArrayList<>();
			while ( (line = reader.readLine()) != null ) {
				Person p = createPerson(line);
				persons.add(p);
			}
			persons.forEach(System.out :: println);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null ) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
					reader = null;
				}
			}
		}
	}
	
	/**
	 * 根据字符串信息，获取用户
	 * @param line 字符串信息
	 * @return
	 */
	private Person createPerson(String line) {
		String[] detail = line.split("，");
		return new Person(detail[0], Integer.parseInt(detail[1]), detail[2], Integer.parseInt(detail[3])); 
	}

	@Test
	public void write() {
		String newPerson = "王五，354，男，8000";
		Person p = createPerson(newPerson);
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(new File(path), true), true);
			pw.write("\n" + p.getString());
			System.out.println("添加成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				if (pw.checkError()) {
					System.out.println("发生错误！");
				}
				pw.close();
			}
		}
	}
}
