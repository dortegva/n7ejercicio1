package ex1;

public class Treballador {

    private String nom;
    private String cognom;
    private int preuHora;

    public Treballador(String nom, String cognom, int preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getPreuHora() {
        return preuHora;
    }

    public void setPreuHora(int preuHora) {
        this.preuHora = preuHora;
    }
    public int calcularSou(int horestreballades){
        int sou=horestreballades*preuHora;
        return sou;
    }
}

