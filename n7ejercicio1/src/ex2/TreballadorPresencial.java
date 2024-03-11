package ex2;

public class TreballadorPresencial extends Treballador {
    private static int benzina;

    public TreballadorPresencial(String nom, String cognom, int preuHora,int benzina) {
        super(nom, cognom, preuHora);
        this.benzina=benzina;
    }

    @Override

    public int calcularSou(int horestreballades) {


        return (horestreballades * getPreuHora()) + benzina;
    }
    @Deprecated
    public static void metObs(){
            System.out.println("Obsoleto");
        }

}
