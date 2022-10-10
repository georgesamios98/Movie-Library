package PrintAnswer;

import java.util.ArrayList;

public class ReportGeneretorManager {

	public void reportGeneretor(ArrayList<String> ektyposi,int eidosEktyposis,String onomaArxeiou){
		if(eidosEktyposis == 1){
			ReportGeneratorForFiles arxeioTXT = new ReportGeneratorForFiles();
			arxeioTXT.creatFile(ektyposi, onomaArxeiou);
		}
		else if(eidosEktyposis == 2){
			ReportGeneratorForHTML arxeioHTML= new ReportGeneratorForHTML();
			arxeioHTML.creatHTML(ektyposi, onomaArxeiou);
		}
		else if(eidosEktyposis == 3){
			ReportGeneretorForPDF arxeioPDF = new ReportGeneretorForPDF();
			arxeioPDF.creatPDF(ektyposi, onomaArxeiou);
		}
		else System.out.println("Do it again");
	}
}
