package escrever_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class planilha_edicao {
	
	public static void main(String[] args) throws Exception {
		
		/* o local do arquivo pode ser colocado direto na "entrada", n�o sendo necessario iniciar um File, porem na "saida" o mesmo endere�o deve ser colocado
File file = new File("C:\\Users\\user\\eclipse-workspace\\JavaDev1\\src\\escrever_Excel\\Planilha_de_testes.xls");
		*/
		
		//	escolha do arquivo
		FileInputStream entrada = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\JavaDev1\\src\\escrever_Excel\\Planilha_de_testes.xls"); 
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while (linhaIterator.hasNext()) {							//	enquanto existir linhas 
			
			Row linha = (Row) linhaIterator.next();					// 	dados da pessoa da linha
			
			int numeroCelulas = linha.getPhysicalNumberOfCells();	// 	numero de celulas	
			
			Cell celula = linha.createCell(numeroCelulas);			//	cria nova celula na linha
			celula.setCellValue("1,523");							// 	valor inserido na celula
		}
		
		FileOutputStream saida = new FileOutputStream("C:\\Users\\user\\eclipse-workspace\\JavaDev1\\src\\escrever_Excel\\Planilha_de_testes.xls");
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("planilha atualizada");
										
	}
}
