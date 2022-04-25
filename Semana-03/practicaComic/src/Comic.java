public class Comic extends Modelo implements InterfaceComic, Runnable {

    @Override
    public String nombreComic(String nombreComic) {
        return getNombreComic();
    }

    @Override
    public String historia(String historia) {
        return getHistoria();
    }

    @Override
    public int numeroComic(int numero) {
        return getNumComic();
    }

    @Override
    public void run() {
        System.out.println("El hilo está corriendo");
        String s = "El nombre de comic es: "+ getNombreComic() + "\n" +
                "El número de la publicación es: " + getNumComic() + "\n" +
                "La historia del comic habla de lo siguiente: " + getHistoria() + "\n";
        System.out.println(s);
    }
}
