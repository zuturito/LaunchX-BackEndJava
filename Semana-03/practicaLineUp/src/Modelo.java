public class Modelo {
    String nombreBanda;
    int numeroPresentacion;
    String canciones;
    String pathImagen;
    String video;

    public Modelo() {}
    public Modelo(String nombreBanda, int numeroPresentacion, String canciones, String pathImagen, String video) {
        this.nombreBanda = nombreBanda;
        this.numeroPresentacion = numeroPresentacion;
        this.canciones = canciones;
        this.pathImagen = pathImagen;
        this.video = video;
    }

    public void setNombreBanda(String nombreBanda){ this.nombreBanda = nombreBanda; };
    public void setNumeroPresentacion(int numeroPresentacion){ this.numeroPresentacion = numeroPresentacion; }
    public void setCanciones(String canciones){ this.canciones = canciones; }
    public void setPathImagen(String pathImagen){ this.pathImagen = pathImagen; }
    public void setVideo(String video){ this.video = video; }

    public String getNombreBanda(){ return nombreBanda; }
    public int getNumeroPresentacion(){ return numeroPresentacion; }
    public String getCanciones(){ return canciones; }
    public String getPathImagen(){ return pathImagen; }
    public String getVideo(){ return video; }
}
