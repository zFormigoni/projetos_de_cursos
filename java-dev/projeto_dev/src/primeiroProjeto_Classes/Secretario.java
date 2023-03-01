package primeiroProjeto_Classes;

public class Secretario extends pessoa implements PermitirAcesso{

    String registro;
    String nivelCargo;
    String experiencia;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }


    @Override
    public boolean autenticar(String l, String s) {
        return l.equals("login") && s.equals("senha");
    }



}