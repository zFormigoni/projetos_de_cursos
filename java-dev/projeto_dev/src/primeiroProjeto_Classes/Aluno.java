package primeiroProjeto_Classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends pessoa{

    public static String APROVADO = "Aprovado";
    public static String RECUPERACAO = "Recuperacao";
    public static String REPROVADO = "Reprovado";

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String setAprovado() {

        if (getMedia() >= 5) {
            if (getMedia() >= 7) {
                return APROVADO;
            } else {
                return RECUPERACAO;
            }
        } else {
            return REPROVADO;
        }
    }

    public String getAprovado(){
        return this.setAprovado();
    }

    private List<Materia> materias = new ArrayList<Materia>();

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    public List<Materia> getMaterias() {
        return materias;
    }
    public Float Maior() {
        
    return null;
    }

    public Float getMedia() {
        Float m = 0.0F;

        for (Materia materia : materias) {
            Float soma = 0f;
            int pos = 0;

            while (materia.notas.length > pos) {
                soma += materia.notas[pos];
                pos ++;
            } 
            
            m += soma;
        }

        m /= materias.size();
        return m;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", Media=" + getMedia() +
                ", Aprovado='" + setAprovado() + '\'' +
                ", materias=" + materias +
                '}';
    }
}