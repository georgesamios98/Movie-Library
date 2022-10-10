package PrintAnswer;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
//import java.text.DecimalFormat;
//import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import dataModel.*;


public class ReportGeneratorForHTML 
{
	public void creatHTML(ArrayList<String> ektyposi,String onomaArxeiou)
	{
		String epikefalida = new String("");
		epikefalida.concat("<!doctype html>");
		epikefalida.concat("\n");
		epikefalida.concat("<html>");
		epikefalida.concat("\n");
		epikefalida.concat("<head>");
		epikefalida.concat("\n");
		epikefalida.concat("<meta http-equiv=\"Content-Type\" content\"text/html; charset=windows-1253\">");
		epikefalida.concat("\n");
		epikefalida.concat(ektyposi.get(0));
		epikefalida.concat("\n");
		epikefalida.concat("</head>");
		epikefalida.concat("\n");
		epikefalida.concat("<body>");
		epikefalida.concat("\n");
		try
		{
			PrintWriter outputStream = new PrintWriter(new FileOutputStream(onomaArxeiou + ".html"));
			outputStream.println(epikefalida);
			outputStream.println(ektyposi.get(0)+"\n"+"<p>");
			for(int i=0;i<ektyposi.size();i++){
				outputStream.println(ektyposi.get(i));
			}
			outputStream.println("</p>"+"\n");
			outputStream.println("</body>\n</html>");
			outputStream.close( );
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("Problem opening report.");
			System.exit(0);
		}
	}
	

}
