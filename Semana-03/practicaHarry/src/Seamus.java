public class Seamus {
    public static void main(String[] args) {
        showSeamus();
    }

    public static void showSeamus(){
        Hechicero seamus = new Hechicero("Seamus Finnigan ", "Masculino","Banshee","Raposa","Gryffindor");
        System.out.println("Nombre: "+seamus.getNombre()+
                "\nGénero: "+seamus.getGenero()+
                "\nBoggart: "+ seamus.getBoggart()+
                "\nPatronus: "+seamus.getPatronus()+
                "\nPertenece a la casa de: "+ seamus.getCasa());
    }
}
