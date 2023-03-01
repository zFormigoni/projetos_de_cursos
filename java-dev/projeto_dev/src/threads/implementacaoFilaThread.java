package threads;


import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class implementacaoFilaThread extends Thread {
    
    private static ConcurrentLinkedQueue<objetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<objetoFilaThread>();

    public static void add(objetoFilaThread objetoFilaThread) {
        pilha_fila.add(objetoFilaThread);
    }

    @Override
    public void run() {
        System.out.println("fila rodando");
        while(true){
            Iterator iteracao = pilha_fila.iterator();
            synchronized(iteracao) { 

                while ( iteracao.hasNext()){
                    objetoFilaThread processar = (objetoFilaThread) iteracao.next();        //pega o objeto atual e processa

                    for (int qnt = 0;qnt < 100; qnt ++){
                        //thread rodando, exemplos processar 10 mil notas fiscais, enviar emails, gerar lista de PDFS...
                        System.out.println("------------------");
                        System.out.println(processar.getNome());
                        System.out.println(processar.getEmail());
                        System.out.println("enviando email: " + qnt);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    iteracao.remove();          //remorver item depois de processado

                    // tempo para descarga de memoria
                    try {
                        Thread.sleep(100);                          
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
              // tempo para descarga de memoria
              try {
                Thread.sleep(100);                          
            } catch (InterruptedException e) {
                e.printStackTrace();
                }
            
            }
              
        }
    }
}
