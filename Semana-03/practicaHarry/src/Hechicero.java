public class Hechicero {
        private String nombre;
        private String genero;
        private String boggart;
        private String patronus;
        private String casa;


    public Hechicero(String nombre, String genero, String boggart, String patronus, String casa) {
        this.nombre = nombre;
        this.genero = genero;
        this.boggart = boggart;
        this.patronus = patronus;
        this.casa = casa;
    }

    public String getNombre(){ return nombre; }
    public String getGenero(){ return genero; }
    public String getBoggart(){ return boggart; }
    public String getPatronus(){ return patronus; }
    public String getCasa(){ return casa; }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        } else
            return false;
    }
}
