public class Apariencias extends Mona {
    public Apariencias(String nombre, int numero, String objetos, String vestimenta, String descripción) {
        super(nombre, numero, objetos, vestimenta, descripción);
    }

    public static void main(String[] args) {
        Mona skin1 = new Mona("Mona Lovelace", 129, "Libro y pluma", "Traje haciendo referencia a Ada Lovelace", "Escribiendo un libro con pluma");
        Mona skin2 = new Mona("Umbrellatocat", 140, "Paragüas", "Forma origen", "Saltando un charco de agua con paragüas");
        Mona skin3 = new Mona("Saint Nictocat", 130, "Campana cencerro", "Santa Claus", "Reparte regalos vestido de santa");
        Mona skin4 = new Mona("Private Investocat ", 119, "Maletín y pipa", "Gabardina espía", "Parece ser un agente espía en los 50's");
        Mona skin5 = new Mona("Luchadortocat", 113, "Máscara de lucha", "Luchar de AAA", "Gato ejecutando un movimiento de lucha libre");
        Mona skin6 = new Mona("Mummytocat", 105, "Un Ankh", "Momia", "Momia caminando por la noche");
        //mostramos las variantes
        System.out.println(skin1.showMessage());
        System.out.println(skin2.showMessage());
        System.out.println(skin3.showMessage());
        System.out.println(skin4.showMessage());
        System.out.println(skin5.showMessage());
        System.out.println(skin6.showMessage());
    }
}
