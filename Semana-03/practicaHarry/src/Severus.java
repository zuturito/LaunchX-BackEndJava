public class Severus {
    public static void main(String[] args) {
        showSnape();
    }

    public static void showSnape(){
        Hechicero snape = new Hechicero("Severus Snape", "Masculino","Lord Voldermort","Cierva","Slytherin");
        System.out.println("Nombre: "+snape.getNombre()+
                "\nGénero: "+snape.getGenero()+
                "\nBoggart: "+ snape.getBoggart()+
                "\nPatronus: "+snape.getPatronus()+
                "\nPertenece a la casa de: "+ snape.getCasa());
    }
}
