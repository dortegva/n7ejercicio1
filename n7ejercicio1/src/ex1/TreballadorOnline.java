package ex1;

public class TreballadorOnline extends Treballador{

    private final int tarifaInternet=40;

    public TreballadorOnline(String nom, String cognom, int preuHora) {
        super(nom, cognom, preuHora);

    }

    @Override

    public int calcularSou(int horestreballades){


        return (horestreballades*getPreuHora())+tarifaInternet;
}}
