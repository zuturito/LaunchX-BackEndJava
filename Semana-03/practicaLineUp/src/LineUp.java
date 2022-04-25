public class LineUp extends Modelo implements Interface, Runnable{

    @Override
    public String nombreBanda(String nombreBanda) {
        return nombreBanda;
    }

    @Override
    public int numeroPresentacion(int numeroPresentacion) {
        return numeroPresentacion;
    }

    @Override
    public String canciones(String canciones) {
        return canciones;
    }

    @Override
    public String pathImagen(String imagen) {
        return imagen;
    }

    @Override
    public String video(String video) {
        return video;
    }

    @Override
    public void run() {
        String s = "La banda que viene es: "+ nombreBanda + "\n" +
                "Orden en el lineUp: " + numeroPresentacion + "\n" +
                "El Setlist será: " + canciones + "\n" +
                "Imagen de la banda: " + pathImagen + "\n" +
                "Video de la banda: " + video + "\n";
        System.out.println(s);
    }
}
