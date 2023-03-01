package Ioc;

public class Pedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        
        pedido.gravar();
    }

    private EnviarEmail enviar;

    public void gravar(){
        this.enviar.retornar("prdido criado");
    }
}
