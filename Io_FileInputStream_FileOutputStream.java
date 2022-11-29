import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Io_FileInputStream_FileOutputStream {

	public static void main(String[] args) throws IOException {
		
		//文件输出
		String fileName = "C:\\Users\\Admin\\Desktop\\text.txt";
		FileInputStream fis = new FileInputStream(fileName);
		int a;
		/*
		 * while ((a = fis.read()) != -1) { // read()一次读一个字节 ， -1:到达文件末尾
		 * System.out.print((char) a); // 除了英文都乱码 // System.out.println(a); //13代表换行 }
		 */

		//文件写入_法1
		 FileOutputStream fos =new FileOutputStream(fileName,true);
		 fos.write("你好".getBytes());  //返回值:byte[]
		 fos.write("\r\n".getBytes());
		 
		//文件写入_法2
		 String str ="hello world";
		 for(int i=0;i<str.length();i++) {
			 fos.write(str.charAt(i));
		 }
		 
		 while((a=fis.read())!=-1) {
			 System.out.print((char)a);
		 }
		 fos.close();
		 fis.close();
	}
}
