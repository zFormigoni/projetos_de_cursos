package escrever_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class planilha_edição2 {
	
	public static void main(String[] args) throws Exception {
		
		/* o local do arquivo pode ser colocado direto na "entrada", não sendo necessario iniciar um File, porem na "saida" o mesmo endereço deve ser colocado
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
			
			String valorCelula = 
			linha.getCell(0						/* escolhe a coluna de onde vai puxar o valor da celula, exemplo: 0 = coluna A, 1 = coluna B... */)
.getStringCellValue(); // pega o valor da celula
			
			linha.getCell(0						/* escolhe a coluna de onde vai alterar o valor da celula, exemplo: 0 = coluna A, 1 = coluna B... */)
.setCellValue(valorCelula + " === teste da aula"); 
			
		}
		
		FileOutputStream saida = new FileOutputStream("C:\\Users\\user\\eclipse-workspace\\JavaDev1\\src\\escrever_Excel\\Planilha_de_testes.xls");
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("planilha atualizada");
										
	}
}
