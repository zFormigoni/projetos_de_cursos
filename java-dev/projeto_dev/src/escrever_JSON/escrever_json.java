package escrever_JSON;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class escrever_json {
	
	public static void main(String[] args) throws IOException {
		
		
//		Gerando e escrevendo arquivo.json		
		File file = new File("C:\\Users\\user\\eclipse-workspace\\JavaDev1\\src\\escrever_JSON\\Arquivo_JSON.json");
		if (!file.exists()) {file.createNewFile();}

//		Gerando Usuarios
		Usuario usuario1 = new Usuario();
		usuario1.setNome("nome_US1");
		usuario1.setLogin("log_US1");
		usuario1.setSenha("senha_US1");
		usuario1.setCpf("cpf_US1");
		
		Usuario usuario2 = new Usuario();
		usuario2.setNome("nome_US2");
		usuario2.setLogin("log_US2");
		usuario2.setSenha("senha_US2");
		usuario2.setCpf("cpf_US2");
		
		
//		Salvando usuarios na lista 
		List<Usuario> usuraios = new ArrayList<Usuario>();
		usuraios.add(usuario1);
		usuraios.add(usuario2);
		
		
//		Escrevendo a lista no arquivo.json	
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String usuario_JSON = gson.toJson(usuraios);
		
				
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(usuario_JSON);
		fileWriter.flush();
		fileWriter.close();

	}
}
