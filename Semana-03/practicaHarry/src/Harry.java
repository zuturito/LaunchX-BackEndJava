public class Harry {
    public static void main(String[] args) {
        showHarry();
    }

    public static void showHarry(){
        Hechicero harry = new Hechicero("Harry Potter", "Masculino","Dementor","Ciervo","Gryffindor");
        System.out.println("Nombre: "+harry.getNombre()+
                "\nGénero: "+harry.getGenero()+
                "\nBoggart: "+ harry.getBoggart()+
                "\nPatronus: "+harry.getPatronus()+
                "\nPertenece a la casa de: "+ harry.getCasa());
    }
}
