public class Modelo {
    private String nombre;
    private int fuerza;
    private int experiencia;
    private int sentidoaracnido;
    private int danioOP;
    private String trajeColor;

    public Modelo() {}
    public Modelo(String nombre, int fuerza, int experiencia, int sentidoaracnido, int danioOP, String trajeColor) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.experiencia = experiencia;
        this.sentidoaracnido = sentidoaracnido;
        this.danioOP = danioOP;
        this.trajeColor = trajeColor;
    }

    public void setNombre(String nombre){ this.nombre = nombre; };
    public void setFuerza(int fuerza){ this.fuerza = fuerza; }
    public void setExperiencia(int experiencia){ this.experiencia = experiencia; }
    public void setSentidoAracnido(int sentidoaracnido){ this.sentidoaracnido = sentidoaracnido; }
    public void setDañoOponente(int dañoOponente) { this.danioOP = dañoOponente; }
    public void setTrajeColor(String trajeColor){ this.trajeColor = trajeColor; }

    public String getNombre(){ return nombre; }
    public int getFuerza(){ return fuerza; }
    public int getExperiencia(){ return experiencia; }
    public int getSentidoaracnido(){ return  sentidoaracnido; }
    public int getDañoOponente() { return danioOP; }
    public String getTrajeColor(){ return trajeColor;}

    @Override
    public String toString() {
        return "SpidermanModelo{" +
                "Nombre de spidy: " + nombre + "\n" +
                "Fuerza: " + fuerza + "\n" +
                "Daño: " + experiencia + "\n" +
                "Su sentido arácnido tiene una sensibilidad del: " + sentidoaracnido + "\n" +
                "Su traje tiene colores: " + trajeColor + "\n";
    }
}
