public class Skuinkle {
    protected String presentacion = "";
    protected boolean relleno = false;
    protected String sabor = "";

    public void describir_skuinkle() {
        System.out.println("Este skuinkle es de presentación: "+presentacion+" ¿tiene relleno?: "+ relleno+" y es de sabor "+sabor);
    }
}


class Clasicos extends Skuinkle {
    static Clasicos skuinclasico = new Clasicos();
    public static void main(String[] args) {
        skuinclasico.presentacion = "clásicos";
        skuinclasico.relleno = false;
        skuinclasico.describir_skuinkle();
    }
}

class Rellenos extends Skuinkle {
    static Rellenos skuinrellenos = new Rellenos();
    public static void main(String[] args) {
        skuinrellenos.presentacion = "rellenos";
        skuinrellenos.relleno = true;
        skuinrellenos.describir_skuinkle();
    }
}

class Mini extends Skuinkle {
    static Mini skuinMini = new Mini();
    public static void main(String[] args) {
        skuinMini.presentacion = "mini";
        skuinMini.relleno = false;
        skuinMini.describir_skuinkle();
    }
}

class Aciditos extends Skuinkle {
    static Aciditos skuinacidito = new Aciditos();
    public static void main(String[] args) {
        skuinacidito.sabor = "manzana verde";
        skuinacidito.presentacion = "mini";
        skuinacidito.relleno = false;
        skuinacidito.describir_skuinkle();
    }
}