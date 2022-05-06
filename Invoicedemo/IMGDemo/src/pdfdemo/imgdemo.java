package pdfdemo;
import com.itextpdf.layout.element.Paragraph;
import java.io.*;


public class imgdemo {

	public static void main(String[] args) throws FileNotFoundException , MalformedURLException {
		String imgSrc = "images\\Screenshot (66)";
		ImageData data =ImageDataFactory.create(imgSrc);
		Image image1 = Image(data);
		String path = "f:\\INVOICE.pdf";
		String paraText = " INVOICE IN PDF"
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
