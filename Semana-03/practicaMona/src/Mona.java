public class Mona {
    private String nombre_apariencia;
    private int numero;
    private String objetos;
    private String skin;
    private String descripción;

    public Mona(String nombre, int numero, String objetos, String skin, String descripción) {
        this.nombre_apariencia = nombre;
        this.numero = numero;
        this.objetos = objetos;
        this.skin = skin;
        this.descripción = descripción;
    }

    public String getNombre() { return nombre_apariencia; }
    public int getNumero() { return numero; }
    public String getObjetos() { return objetos; }
    public String getVestimenta() { return skin; }
    public String getActividad() { return descripción; }

    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre_apariencia = nombre;
            return true;
        }else
            return false;
    }

    public boolean setNumero(int numero) {
        if(numero > 0) {
            this.numero = numero;
            return true;
        }else
            return false;
    }

    public boolean setObjeto(String objetos) {
        if (!objetos.isEmpty()) {
            this.objetos = objetos;
            return true;
        }else
            return false;
    }

    public boolean setVestimenta(String skin) {
        if(!skin.isEmpty()) {
            this.skin = skin;
            return true;
        }else
            return false;
    }

    public boolean setActividad(String descripción) {
        if(!descripción.isEmpty()) {
            this.descripción = descripción;
            return true;
        }else
            return false;
    }

    public String showMessage() {
        return "Nombre de la apariencia: " + nombre_apariencia +
                "\nNúmero en el octodex: #" + numero +
                "\nArma especial/objeto que carga:" +objetos +
                "\nVestimenta: " + skin +
                "\nActividad: " + descripción+ "\n";
    }
}
