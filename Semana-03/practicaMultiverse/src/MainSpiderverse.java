public class MainSpiderverse {

    public static void main(String[] args) {

        PeterParker peter = new PeterParker();
        Spiderman2099 peter2099 = new Spiderman2099();
        CerdoArania cerdo = new CerdoArania();

        peter.setFuerza(100);
        peter.setExperiencia(20);
        peter.golpeDebil(peter.getFuerza());

        peter2099.setFuerza(75);
        peter2099.setExperiencia(1);
        peter2099.golpeFuerte(peter2099.getFuerza());

        cerdo.setFuerza(180);
        cerdo.setExperiencia(5);
        cerdo.patadaGiratoria(cerdo.getFuerza());

        System.out.println("Peter Parker hizo el siguiente daño : "+peter.getDañoOponente());
        System.out.println("Spiderman 2099 hizo el siguiente daño : "+peter2099.getDañoOponente());
        System.out.println("Cerdo araña hizo el siguiente daño : "+cerdo.getDañoOponente());

    }
}
