package threads;
import javax.swing.JOptionPane;


public class AulaThread {

    public static void main(String[] args) throws InterruptedException {

        Thread emails =   new Thread(threadEmail);
        Thread NFs    =   new Thread(threadNF);

        emails.start();
        NFs.start();

        JOptionPane.showMessageDialog(null,"Finalizado");
    }
 
    private static  Runnable threadEmail = new Runnable(){
        
        public void run(){
            
            for (int pos = 1; pos <= 10; pos++ ){

                try {
                    System.out.println("Enviando Email: " + pos);
                    Thread.sleep(2_000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
            System.out.println("-=-=-=-Emails Enviados-=-=-=-");
            }

    };

    private static Runnable threadNF = new Runnable(){

        public void run(){

            for (int pos = 1; pos <= 10; pos++ ){

                try {
                    System.out.println("Nota enviada: " + pos);
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
    
            }
            System.out.println("-=-=-=-Notas Enviadas-=-=-=-");
        }
        
    };
}


