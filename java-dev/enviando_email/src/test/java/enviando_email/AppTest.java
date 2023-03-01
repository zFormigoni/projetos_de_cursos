package enviando_email;


public class AppTest{
	
	
	@org.junit.Test
	public void testEmail() throws Exception {
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		//editando texto em html 
		stringBuilderTextoEmail.append("olá, <br/><br/>"); 	// <br/> == quebra de linha em HTML
		stringBuilderTextoEmail.append("testando email em html, <br/><br/>");
		
		// inserindo um link 
		stringBuilderTextoEmail.append("<a target=\"blank\" href=\"https://www.youtube.com/watch?v=E8QDdy_NoA8&t=2915s\" style=\"color:#2525a7; padding: 14px 25px; text-align:center; text-decoration: none; display:inline-block; border-radius: 30px; font-size: 30px; font-family:courier; border: 3px solid green; background-color: #99DA39;\">acessar </a>");
		
		stringBuilderTextoEmail.append("<br/><span style=\" font: 18px\">Ass.: Vitor</span>");
		
		

		Objeto_Enviar_Email email = new Objeto_Enviar_Email(/*assunto			*/	"assunto: TESTE HTML", 
															/*remetente			*/	"HTML",
															/*lista de destino	*/	"testejava2003@gmail.com, vitor.formigoni@gmail.com,",
															/*corpo email		*/	stringBuilderTextoEmail.toString());						
	
	
		// email.enviar_email(false);			//	enviar sem HTML 	
		//email.enviar_email(true);				//	enviar com HTML
		//email.enviar_email_anexo(true);		//	enviar com HTML e anexo
		email.enviar_email_lista_anexo(true);	//	enviar com HTML e lista de anexos
		System.out.println("email enviado");
   }
}