package escrever_Txt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AulaTxt {
    public static void main(String[] args) throws IOException {
 
        
/*      Arquivo.TXT 
// criaÁ„o da lista de pessoas
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("pessoa1");
        pessoa1.setEmail("pessoa1@gamil.com");
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("pessoa2");
        pessoa2.setEmail("pessoa2@gamil.com");
        
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("pessoa3");
        pessoa3.setEmail("pessoa3gamil.com");
        
//lista de pessoas
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(pessoa1);        
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
//criaÁ„o de arquivo.TXT
        File arquivo = new File("C:\\Users\\user\\.vscode\\Projects\\javaDev\\src\\TestesAulas\\LeituraEscrita\\ArquivoTXT.txt");

//iniciando metodo para escerever no arquivo 
        FileWriter escrever_arquivo = new FileWriter(arquivo);

//iniciando metodo de ler Arquivo.TXT
        FileInputStream entrada_arquivo = new FileInputStream(arquivo);
        Scanner ler_arquivo = new Scanner(entrada_arquivo,"UTF-8");      //Usar esse metodo "Scanner teste = new Scanner(source, charsetName)" e usar o "UTF-8"

//                                                                                                                      ESCREVENDO ARQUIVO.TXT   
//verifica√ß√£o se arquivo.TXT existe ou se deve ser criado
        if (!arquivo.exists()){
            arquivo.createNewFile();
        }
   
// adicionando pessoas no arquivo.TXT    
        for (Pessoa p : pessoas){

            escrever_arquivo.write("Nome: " + p.getNome() + ";" + "Email: " + p.getEmail() + ";");
            escrever_arquivo.write("\n");
        }

// sempre fechar o arquivo no final 
        escrever_arquivo.flush();
        escrever_arquivo.close(); 


        
   

        List<Pessoa> novapessoas = new ArrayList<Pessoa>();
        Pessoa novaPessoa = new Pessoa();
//                                                                                                                   LENDO ARQUIVO.TXT
        while(ler_arquivo.hasNext()){
            String linha = ler_arquivo.nextLine();
            System.out.println(linha);
//                                                                                                                    PUXANDO DADOS DO ARQUIVO.TXT 
            if (linha != null && !linha.isEmpty()){

                String[] dados = linha.split("\\;");

                System.out.println(dados[0]);
                System.out.println(dados[1]);
                novaPessoa.setNome(dados[0]);
                novaPessoa.setEmail(dados[1]);

                
            }
            novapessoas.add(novaPessoa);
        }
        System.out.println("\n\n\n\n\n\n");
        for (Pessoa p : novapessoas){
            System.out.println(p.getNome());

        }
//*/
/*      Arquivo.csv (limitado mas funciona para excel)*/
// criacao da lista de pessoas
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("andressa");
        pessoa1.setEmail("andressa@gamil.com");
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("vitor");
        pessoa2.setEmail("vitor@gamil.com");
        
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("pessoa3");
        pessoa3.setEmail("pessoa3gamil.com");
        
//lista de pessoas
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(pessoa1);        
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
//cria√ß√£o de arquivo.CSV
        File arquivo = new File("C:\\Users\\user\\.vscode\\Projects\\javaDev\\src\\TestesAulas\\LeituraEscrita\\ArquivoCSV.csv");

//iniciando metodo para escerever no arquivo 
        FileWriter escrever_arquivo = new FileWriter(arquivo);

//iniciando metodo de ler Arquivo.CSV
        FileInputStream entrada_arquivo = new FileInputStream(arquivo);
        Scanner ler_arquivo = new Scanner(entrada_arquivo,"UTF-8");      //Usar esse metodo "Scanner teste = new Scanner(source, charsetName)" e usar o "UTF-8"

//                                                                                                                      ESCREVENDO ARQUIVO.CSV   
//verifica√ß√£o se arquivo.CSV existe ou se deve ser criado
        if (!arquivo.exists()){
            arquivo.createNewFile();
        }
   
// adicionando pessoas no arquivo.CSV    
        for (Pessoa p : pessoas){

            escrever_arquivo.write("Nome: " + p.getNome() + ";" + "Email: " + p.getEmail() + ";");
            escrever_arquivo.write("\n");
        }

// sempre fechar o arquivo no final 
        escrever_arquivo.flush();
        escrever_arquivo.close(); 


        
   

        List<Pessoa> novapessoas = new ArrayList<Pessoa>();
        Pessoa novaPessoa = new Pessoa();
//                                                                                                                   LENDO ARQUIVO.CSV
        while(ler_arquivo.hasNext()){
            String linha = ler_arquivo.nextLine();
            System.out.println(linha);
//                                                                                                                    PUXANDO DADOS DO ARQUIVO.CSV 
            if (linha != null && !linha.isEmpty()){

                String[] dados = linha.split("\\;");

                System.out.println(dados[0]);
                System.out.println(dados[1]);
                novaPessoa.setNome(dados[0]);
                novaPessoa.setEmail(dados[1]);

                
            }
            novapessoas.add(novaPessoa);
        }
        System.out.println("\n\n\n\n\n\n");
        for (Pessoa p : novapessoas){
            System.out.println(p.getNome());

        }
//*/
/*      Arquivo.XLS*/

        //File arquivo = new File("C:\\Users\\user\\.vscode\\Projects\\javaDev\\src\\TestesAulas\\LeituraEscrita\\ArquivoXLS.xls");

        if (!arquivo.exists()){
                arquivo.createNewFile();
        }

        

    }

}
