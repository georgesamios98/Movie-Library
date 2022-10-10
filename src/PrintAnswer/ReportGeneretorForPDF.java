package PrintAnswer;

import java.io.FileOutputStream;
import java.util.ArrayList;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ReportGeneretorForPDF
{
	public void creatPDF(ArrayList<String> ektyposi,String onomaArxeiou)
	{
		Document document = new Document();		
		
				
				
		try {
			PdfWriter.getInstance(document,new FileOutputStream("./output/"+onomaArxeiou+".pdf"));
			
			document.open();
			
			Paragraph p2;
			for(int i =0 ;i<ektyposi.size();i++){
				p2 = new Paragraph(ektyposi.get(i));
				document.add(p2);
			}
			
			document.close();
			
		} catch (Exception e) {
			System.exit(0);
		} 
	}
}
