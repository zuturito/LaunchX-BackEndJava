public class Ron {
    public static void main(String[] args) {
        showRon();
    }

    public static void showRon(){
        Hechicero ron = new Hechicero("Ronald Wesley", "Masculino","Araña gigante","Jack Russell Terrier","Gryffindor");
        System.out.println("Nombre: "+ron.getNombre()+
                "\nGénero: "+ron.getGenero()+
                "\nBoggart: "+ ron.getBoggart()+
                "\nPatronus: "+ron.getPatronus()+
                "\nPertenece a la casa de: "+ ron.getCasa());
    }
}
