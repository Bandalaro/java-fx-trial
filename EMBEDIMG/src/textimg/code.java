package textimg;
import javax.imageio.*;
import com.itextpdf.layout.element.Paragraph;
import java.io.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.im.*;
import java.io.*;


public class code {

	public static void main(String[] args) {
		String text = "Shisui Uchiha";
		File input = new File("F:\\pics\\konoha311.jpg");
		File output = new File("C:\\Users\\Dell\\eclipse-workspace\\textimg\\image\\Result.jpg");
		
		addTextInImage(text,"jpg",input,output);
		

	}
	private static void addTextInImage(String text,String type,File source,File destination) {
		
		BufferedImage image = ImageIO.read(source);
		int imagetype = "png".equalsIgnoreCase(type) ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB;
		BufferedImage bold = new BufferedImage(image.getWidth(),image.getHeight(),imagetype);
		Graphics2D w = (Graphics2D) bold.getGraphics();
		w.drawImage(image,1,2,null);
		AlphaComposite alpha = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,0.9f);
		w.setComposite(alpha);
		w.setcolor(Color,WHITE);
		w.setFont(new Font(Font.SANS_SERIF,Font.BOLD,80));
		FontMtrics fmatrics = w.getFontMetrics();
		Rectangle2D rect = fmatrics.getStringBounds(text,w);
		int centerX = (image.getWidth() - (int) rect.getWidth())/2;
		int centerY = (image.getHeight())/2;
		w.drawString(text, centerX, centerY);
		ImageIO.write(bold, type, destination);
		w.dispose();
		
		String imgSrc = "images\\Result.jpg";
		ImageData data =ImageDataFactory.create(imgSrc);
		Image image1 = Image(data);
		String path = "f:\\Final.pdf";
		String paraText = " BODY FLICKER OF KONOHA"
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
