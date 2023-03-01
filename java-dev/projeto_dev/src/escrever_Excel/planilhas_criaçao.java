package escrever_Excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.eventusermodel.FormatTrackingHSSFListener;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import escrever_Txt.Pessoa;
import primeiroProjeto_Classes.pessoa;

public class planilhas_criaçao {
	
	public static void main(String[] args) throws Exception {
		
		File arquivo = new File("C:\\Users\\user\\eclipse-workspace\\JavaDev1\\src\\escrever_Excel\\Planilha_de_testes.xls");
				
		if (!arquivo.exists()){
			System.out.println("Criei um arquivo");
			arquivo.createNewFile(); 
		}else{
			System.out.println("arquivo Existente");	
		}

// cria��o da lista de pessoas
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("pessoa1");
        pessoa1.setEmail("pessoa1@gmail.com");
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("pessoa2");
        pessoa2.setEmail("pessoa2@gmail.com");
        
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("pessoa3");
        pessoa3.setEmail("pessoa3gmail.com");
        
        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("pessoa4");
        pessoa4.setEmail("pessoa4gmail.com");
        
//lista de pessoas
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(pessoa1);        
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
		
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); // usado para escrever a planilha
		HSSFSheet linhaPessoa = hssfWorkbook.createSheet("planilha de testes");
		
		int numeroLinha = 0;
		for (Pessoa pessoa : pessoas) {
			Row linha = linhaPessoa.createRow(numeroLinha ++);
			
			int celula = 0;
			
			Cell celNome = linha .createCell(celula ++);
			celNome.setCellValue(pessoa.getNome());
			
			Cell celEmail = linha.createCell(celula ++);
			celEmail.setCellValue(pessoa.getEmail());
		}
			
		FileOutputStream saida = new FileOutputStream(arquivo); 	
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
			
	
			
			
			
			
			
		
		
	}
}
