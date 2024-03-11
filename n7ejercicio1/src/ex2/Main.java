package ex2;


public class Main {
    @SuppressWarnings("deprecated")
    public static void main(String[] args){
        Treballador pers1 = new Treballador("Miki", "Forro", 10);
        TreballadorOnline pers2 = new TreballadorOnline("Toni", "Mateo", 10);
        TreballadorPresencial pers3 = new TreballadorPresencial("Pili", "Matarin", 10, 100);


        System.out.println("El sou de "+ pers1.getNom() + " es de "+pers1.calcularSou(40));
        System.out.println("El sou de "+ pers2.getNom()+ " es de "+pers2.calcularSou(40));
        System.out.println("El sou de "+ pers3.getNom()+ " es de "+pers3.calcularSou(40));

       TreballadorOnline.metObs();
       TreballadorPresencial.metObs();
    }
}