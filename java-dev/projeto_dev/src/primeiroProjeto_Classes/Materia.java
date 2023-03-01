package primeiroProjeto_Classes;


import java.util.Arrays;

public class Materia {

    String Materia;
    Float[] notas;
    Float[] maisEmenos;


    public void setNotas(Float[] notas) {
        this.notas = notas;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }
  
    public Float[] getMaisEmenos() {
        return maisEmenos;
    }

    public void setMaisEmenos(Float[] maisEmenos) {
        this.maisEmenos = maisEmenos;
    }

    @Override
    public String toString() {
        return "Materia [Materia=" + Materia + ", notas=" + Arrays.toString(notas) + "]";
    }
}