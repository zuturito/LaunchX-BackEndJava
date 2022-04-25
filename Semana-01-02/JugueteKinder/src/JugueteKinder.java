public class JugueteKinder {
    private boolean vegetariano;
    private boolean mamifero;
    private String alimento;
    private int numPatas;
    private String color;
    private int cuernos;
    private String ecosistema;

    public JugueteKinder(boolean veg, boolean mam, String alim, int patas, String color, int cuernos, String eco){
        this.vegetariano = veg;
        this.mamifero = mam;
        this.alimento = alim;
        this.numPatas = patas;
        this.color = color;
        this.cuernos = cuernos;
        this.ecosistema = eco;
    }

    public JugueteKinder() {

    }

    public boolean getVegetariano(){ return vegetariano; }
    public boolean getMamifero(){ return mamifero; }
    public String getAlimento(){ return alimento; }
    public int getNumPatas(){ return numPatas; }
    public String getColor(){ return color; }
    public int getCuernos(){ return cuernos; }
    public String getEcosistema(){ return ecosistema; }
    public boolean isVegetariano(boolean veg) {
        this.vegetariano = veg;
        return true;
    }
    public boolean isMamifero(boolean mami) {
        this.mamifero = mami;
        return true;
    }
    public boolean setAlimento(String alim) {
        if (!alim.isEmpty()) {
            this.alimento = alim;
            return true;
        } else
            return false;
    }
    public boolean setnumPatas(int patas){
        if(patas > 0){
            this.numPatas = patas;
            return true;
        }else
            return false;
    }
    public boolean setColor(String color) {
        if (!color.isEmpty()) {
            this.color = color;
            return true;
        } else
            return false;
    }
    public boolean setCuernos(int cuernos){
        if(cuernos > 0){
            this.cuernos = cuernos;
            return true;
        }else
            return false;
    }
    public boolean setEcosistema(String ecosistema){
        if(!ecosistema.isEmpty()){
            this.ecosistema = ecosistema;
            return true;
        }else
            return false;
    }
}
