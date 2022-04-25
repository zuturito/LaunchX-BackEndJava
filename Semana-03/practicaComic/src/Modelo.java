public abstract class Modelo {
    private String nombreComic;
    private int numComic;
    private String historia;

    public Modelo() {}
    public Modelo(String nombreComic, int numeroComic, String historia) {
        this.nombreComic = nombreComic;
        this.numComic = numeroComic;
        this.historia = historia;
    }

    public void setNombreComic(String nombreComic){ this.nombreComic = nombreComic; };
    public void setNumComic(int numeroComic){ this.numComic = numeroComic; }
    public void setHistoria(String historia){ this.historia = historia; }

    public String getNombreComic(){ return nombreComic; }
    public int getNumComic(){ return numComic; }
    public String getHistoria(){ return historia; }

    @Override
    public String toString() {
        return "Nombre del cómic: " + nombreComic + "\n" +
                "Número de cómic: " + numComic + "\n" +
                "Historia: " + historia + "\n";
    }

    public abstract String nombreComic(String nombreComic);
}
