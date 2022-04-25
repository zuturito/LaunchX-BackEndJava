public class Antilope {
    public static void main(String[] args) {
        definicion();
    }
    public static void definicion(){
        JugueteKinder antilope = new JugueteKinder();
        antilope.isVegetariano(true);
        antilope.isMamifero(true);
        antilope.setAlimento("Pasto");
        antilope.setnumPatas(4);
        antilope.setColor("Café");
        antilope.setCuernos(2);
        antilope.setEcosistema("Sabana");
        String msg = "El juguete kinder es un antílope con estas características" + "\n";
               msg += "Es vegetariano: "+ antilope.getVegetariano()+"\n";
               msg += "Es mamífero: "+ antilope.getMamifero()+"\n";
               msg += "Come: "+ antilope.getAlimento()+"\n";
               msg += "Tiene "+ antilope.getNumPatas()+" patas"+"\n";
               msg += "Es de color: "+ antilope.getColor()+"\n";
               msg += "Tiene "+ antilope.getCuernos()+" cuernos"+"\n";
               msg += "Vive en la: "+ antilope.getEcosistema();
        System.out.println(msg);
    }

}
