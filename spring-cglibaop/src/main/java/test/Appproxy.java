package test;

import sun.misc.ProxyGenerator;
import test.dao.Dao;

import java.io.File;
import java.io.FileOutputStream;

public class Appproxy {
	public static void main(String[] args) {
		Class<?>[] Myproxy = new Class[]{Dao.class};
//		byte bytes[] = ProxyGenerator.generateProxyClass("dao", Myproxy);
		byte bytes[] = ProxyGenerator.generateProxyClass("$Proxy", Myproxy);
		File file=new File("d:\\Dao.class");
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			fileOutputStream.write(bytes);
			fileOutputStream.flush();
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
