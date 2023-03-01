package Ioc;

public class EnviarEmail {
    public EnviarEmails(String tipo, String endereco, String senha){

    }

    public static EnviarEmails obterDados(){
        return new EnviarEmail("stmp", "contato@gmail.com", "senha");

    }

    public void retornar(String mensagem){
        System.out.println("email enviado");
    }


}
