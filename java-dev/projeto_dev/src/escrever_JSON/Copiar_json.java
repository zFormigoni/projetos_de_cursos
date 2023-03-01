package escrever_JSON;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Copiar_json {
	
	public static void main(String[] args) throws IOException {
//		Gerando e escrevendo arquivo.json		
		File file = new File("C:\\Users\\user\\eclipse-workspace\\JavaDev1\\src\\escrever_JSON\\Arquivo_JSON.json");
		if (!file.exists()) {file.createNewFile();}
	
		FileReader fileReader = new FileReader(file);
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> list = new ArrayList<Usuario>();
		
		for (JsonElement jsonElement: jsonArray) {
			
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			list.add(usuario);
		}
		
		System.out.println("leitura do arquivo.json:");
		
		for (Usuario usuario : list) {
			System.out.println(usuario.toString());
		}
		
	}
}
