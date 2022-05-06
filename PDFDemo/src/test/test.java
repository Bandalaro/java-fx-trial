package test;
import com.itext.text.Document;
import com.itextpdf.pdf.Pdfwriter;
import com.itext.text.Paragaraph;
import java.io.*;


public class test {

	public static void main(String[] args) {
		try {
			Document document = new Document();
			Pdfwriter.getInstance(document,new FileOutputStream("d:/demo.pdf")  );
			document.open();
			document.add(new Paragaraph("EVALUVATION OF A EXPRESSION:"));
			document.close();
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("executed");
		

	}

}
