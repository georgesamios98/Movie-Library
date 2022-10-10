package MainEngine;

import java.util.ArrayList;
import PrintAnswer.ReportGeneretorManager;
import dataLoad.FullDataLoader;


public class MainEngine 
{
	FullDataLoader programma;
	ReportGeneretorManager arxeioReport;
	public MainEngine() {
		programma = new FullDataLoader();
		arxeioReport = new ReportGeneretorManager();
	}


	public void userOption(int id,String filename,int typefile)
	{
		ArrayList<String> report= new ArrayList<String>();
		programma.loadData();
		
		report.add(programma.getMovie(id).getTitle());
		report.add(programma.getMovie(id).toString());
		arxeioReport.reportGeneretor(report, typefile, filename);
		
	}


}