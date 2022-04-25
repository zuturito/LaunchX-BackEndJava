public class Hermione {
    public static void main(String[] args) {
        showHermione();
    }

    public static void showHermione(){
        Hechicero hermione = new Hechicero("Granger Hermione", "Femenino","Desaprobar exámenes","Nutria","Gryffindor");
        System.out.println("Nombre: "+hermione.getNombre()+
                "\nGénero: "+hermione.getGenero()+
                "\nBoggart: "+ hermione.getBoggart()+
                "\nPatronus: "+hermione.getPatronus()+
                "\nPertenece a la casa de: "+ hermione.getCasa());
    }
}
