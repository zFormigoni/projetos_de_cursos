package escrever_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import escrever_Txt.Pessoa;
import primeiroProjeto_Classes.pessoa;

public class planilhas_entrada {
	
public static void main(String[] args) throws Exception {
		
	FileInputStream entrada = new FileInputStream(new File("C:\\Users\\user\\eclipse-workspace\\JavaDev1\\src\\escrever_Excel\\Planilha_de_testes.xls"));
					
	HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); 	//	prepara a entrada do arquivo para ler
	HSSFSheet planilha = hssfWorkbook.getSheetAt(0);		// 	escoçhe a primeira planilha do arquivo
	
	Iterator<Row> linhaIterator = planilha.iterator();
	
	List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	while (linhaIterator.hasNext()) {
		
		Row linha = linhaIterator.next();
		Iterator<Cell> celula = linha.iterator();
		Pessoa pessoa = new Pessoa();
		
		while (celula.hasNext()) {
			Cell cell = celula.next();			
			//	System.out.println(cell);					//	o sysout mostra como a planiha esta sendo percorrida
			//	System.out.println("( "+ cell.getRowIndex()+ " , " + cell.getColumnIndex() + ")");
			
			switch (cell.getColumnIndex()) {
			case 0: 
				pessoa.setNome(cell.getStringCellValue());
				break;
			case 1:
				pessoa.setEmail(cell.getStringCellValue());
				break;			
			}												
		}													//	fim das celulas da linha
		listaPessoas.add(pessoa);
	}
	
	entrada.close();										//	terminou de ler a lista	
	
	for (Pessoa p : listaPessoas) {    						//	poderia gravar no banco  de dados, enviar por email e etc...
		System.out.println(p);
	}
		
		
	}
}
