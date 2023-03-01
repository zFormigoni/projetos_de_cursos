package primeiroProjetoJava_Executavel;

import javax.swing.*;

import primeiroProjeto_Classes.*;

import java.util.ArrayList;
import java.util.List;


public class testes {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>(); /**Lista de alunos**/

        PermitirAcesso secretario = new Secretario();

                                                                                                            /**  INICIO DA PARTE EXECUTAVEL**/
            
        //String login = JOptionPane.showInputDialog("Login");
        //String senha = JOptionPane.showInputDialog("Senha");

        try {
            if (secretario.autenticar("login", "senha")) {
                for (int qtd = 1; qtd <= 4; qtd++) {  /** cadastros de alunos **/
                    Aluno aluno = new Aluno();
                    int pos = 1, c = 0, remover = 0;
                    Float maior = 0f;
                    Float menor = 0f;

                    ArrayList nomeM = new ArrayList<>();
                                                                                                                        /** cadastros de alunos **/
                    aluno.setNome(JOptionPane.showInputDialog("Nome: "));
                    aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));

                    Materia materia = new Materia();
                                                                                                             /**  cadastros de materias **/
                    while (c == 0) { 
                        materia = new Materia();
                        Float[] notas = new Float[4];

                        materia.setMateria(JOptionPane.showInputDialog("Materia " + pos));
                                                                                        /**Adicionar notas**/
                        int notasPorMateria = 0;
                        while (notas.length > notasPorMateria){
                            notas[notasPorMateria] = Float.parseFloat(JOptionPane.showInputDialog("Nota " + (notasPorMateria+1) +": "));
                            if (notasPorMateria == 0 ){
                                maior = menor = notas[notasPorMateria];
                            } else {
                                if (notas[notasPorMateria] > maior )     { maior = notas[notasPorMateria];    } 
                                if (notas[notasPorMateria] < menor )    { menor = notas[notasPorMateria];    }
                            }
                            notasPorMateria += 1;
                        }
                        

                        materia.setNotas(notas);

                        System.out.println(materia.toString());
                        
                        nomeM.add(materia.getMateria());
                        
                        aluno.getMaterias().add(materia);

                        
                        c = JOptionPane.showConfirmDialog(null, "Inserir nova materia?");
                        pos += 1;
                    }

                    remover = JOptionPane.showConfirmDialog(null, "Gostaria de remover alguma materia? ");
                    /**  Remover materias **/
                    if (remover == 1 || remover == 2) {
                        JOptionPane.showMessageDialog(null, "nenhuma materia excluida");
                    } else {   /** Remover materias **/
                        while (remover == 0) {
                            String removerMateria = JOptionPane.showInputDialog(nomeM + "\nQual materia?");

                            JOptionPane.showMessageDialog(null, "Materia excluida: " + nomeM.get(Integer.valueOf(removerMateria).intValue() - 1));

                            aluno.getMaterias().remove(Integer.valueOf(removerMateria).intValue() - 1);
                            nomeM.remove(Integer.valueOf(removerMateria).intValue() - 1);
                            if (nomeM.size() == 0) {                            /** Verifica se todas as materias foram excluidas **/
                                JOptionPane.showMessageDialog(null, "Todas as materias foram excluidas");
                                break;
                            } else {
                                remover = JOptionPane.showConfirmDialog(null, "Materias Restantes: " + nomeM + "\nGostaria de remover mais alguma materia? ");
                                if (remover == 1) {
                                    JOptionPane.showMessageDialog(null, "Materias Restantes: " + nomeM);
                                    break;
                                }
                            } /** Verifica se todas as materias foram excluidas **/
                        }     /** Remover materias **/
                    }

                    /** Adicionar aluno a lista **/
                    alunos.add(aluno);

                    System.out.println("maior nota: "+ maior);
                    System.out.println("menor nota: "+ menor);
                   
                }
                
                /** MOSTRAR LISTA DE ALUNOS **/
                for (Aluno aluno : alunos) {
                    /*if (aluno.getAprovado() == "Aprovado") {} else if (aluno.getAprovado() == "Recuperacao") {} else {}*/
                    System.out.println("\n");
                    System.out.println("Nome........" + aluno.getNome() + 
                            "\nMedia......." +  aluno.getMedia() +
                            "\nSituação...." +  aluno.getAprovado() + 
                            "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"+
                            "\n Maior e Menor nota:"+ 
                            "\n Maior e Menor nota: " );

                }
            } else {
                JOptionPane.showMessageDialog(null, "Acesso negado");
            }
        }catch (Exception e){ /** Mostrar erros **/

            List<String> saida = new ArrayList<>();
            e.printStackTrace();
            for (int pos = 0; pos < e.getStackTrace().length; pos++){
                saida.add("\n Classe de erro: "+ e.getStackTrace()[pos].getClassName());
                saida.add("\n Metodo de erro: "+ e.getStackTrace()[pos].getMethodName());
                saida.add("\n Linha de erro: "+ e.getStackTrace()[pos].getLineNumber());
                saida.add("\n Class: "+ e.getStackTrace()[pos].getClass());
                saida.add("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }

            JOptionPane.showMessageDialog(null, "Erro" + saida.toString());
        }
    }
}
