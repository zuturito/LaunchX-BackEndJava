public class MainComic extends Thread{
    public static void main(String[] args) {
        Comic h = new Comic();
        h.setNombreComic("Flashpoint");
        h.setNumComic(1);
        h.setHistoria("Flashpoint recoge justo después de que el Profesor Zoom desata una " +
                "gigante explosión alteración acumulada de Fuerza de la Velocidad que " +
                "cambia la línea de tiempo completo. Barry Allen despierta para " +
                "encontrar todo lo relacionado con su vida diferente, su madre está " +
                "viva, que no está casado con su esposa, él no es Flash, y eso es " +
                "sólo el comienzo de sus problemas. Mujer Maravilla y las Amazonas " +
                "están en guerra con Aquaman y los atlantes, Cyborg es el héroe más " +
                "grande de los Estados Unidos, No se sabe donde esta Superman y el " +
                "mundo está al borde de la guerra. ");
        Thread t = new Thread(h);
        t.start();
    }
}