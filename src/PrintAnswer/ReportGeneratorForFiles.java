package PrintAnswer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;


public class ReportGeneratorForFiles{
	
	public void creatFile(ArrayList<String> ektyposi,String onomaArxeiou)
	{
		try
		{
			PrintWriter outputStream = new PrintWriter(new FileOutputStream(onomaArxeiou + ".txt"));
			for(int i=0;i<ektyposi.size();i++){
				outputStream.println(ektyposi.get(i));
			}
			outputStream.close( );
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("Problem opening report.");
			System.exit(0);
		}
		
	}
	
}




