package com.saxon.testdemo.binary;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.junit.Test;

public class BinaryDemo {

	@Test
	public void m() {
		String psWord = "123456";
		byte[] bytesGBK;
		byte[] bytesUTF;
		try {
			bytesGBK = psWord.getBytes("GBK");
			bytesUTF = psWord.getBytes("UTF-8");
			System.out.println(Charset.defaultCharset());
			
			System.out.println("gbk");
			for (int i = 0; i < bytesGBK.length; i++) {
				System.out.println(bytesGBK[i]);
			}
			System.out.println("utf-8");
			for (int j = 0; j < bytesUTF.length; j++) {
				System.out.println(bytesUTF[j]);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void m2() {
		byte a = 13;// 00001101
		byte b = (byte) ~a;// 11110010 取反：00001101=13 +1=14, -14
		System.out.println(b);
	}
	
	@Test
	public void m3() {
		String psWord = "123456";
		byte[] bytes = psWord.getBytes();
		for(int i = 0; i < bytes.length; i++) {
			System.out.println(~bytes[i]);
		}
		System.out.println("++++++++++++++++++");
		byte[] newBytes = change(bytes);
		for (int i = 0; i < newBytes.length; i++) {
			byte b = newBytes[i];
			System.out.println(b);
		}
	}
	
	private byte[] change(byte[] buff) {
		for(int i = 0;i < buff.length;i++) {
			int b = 0;
			for(int j = 0; j < 8; j++) {
				int bit = (buff[i] >> j & 1) == 0 ? 1 : 0;
				b += (1 << j) * bit;
			}
			buff[i] = (byte) b;
		}
		return buff;
	}
}
