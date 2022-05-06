package pdfdemo;
import com.itextpdf.layout.element.Paragraph;
import java.io.*;


public class imgdemo {

	public static void main(String[] args) throws FileNotFoundException , MalformedURLException {
		String imgSrc = "images\\konoha377 (1).png";
		ImageData data =ImageDataFactory.create(imgSrc);
		Image image1 = Image(data);
		String path = "f:\\Demo 2.pdf";
		String paraText = " naruto"
		Paragraph paragraph = new Paragraph(paraText);
		PdfWriter pdfwriter = new PdfWriter(path);
		
		PdfDocument pdfDocument = new PdfDocument(pdfWriter);
		pdfDocument.addNewPage();
		Document document = new Document(pdfDocument);
		document.add(paragraph1);
		document.add(image1);
		
		document.close();
		
		
	}

}
