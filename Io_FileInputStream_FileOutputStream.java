import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Io_FileInputStream_FileOutputStream {

	public static void main(String[] args) throws IOException {
		
		//�ļ����
		String fileName = "C:\\Users\\Admin\\Desktop\\text.txt";
		FileInputStream fis = new FileInputStream(fileName);
		int a;
		/*
		 * while ((a = fis.read()) != -1) { // read()һ�ζ�һ���ֽ� �� -1:�����ļ�ĩβ
		 * System.out.print((char) a); // ����Ӣ�Ķ����� // System.out.println(a); //13������ }
		 */

		//�ļ�д��_��1
		 FileOutputStream fos =new FileOutputStream(fileName,true);
		 fos.write("���".getBytes());  //����ֵ:byte[]
		 fos.write("\r\n".getBytes());
		 
		//�ļ�д��_��2
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
