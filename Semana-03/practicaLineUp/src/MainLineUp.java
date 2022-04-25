public class MainLineUp extends Thread {
    public static void main(String[] args) throws InterruptedException {
        LineUp task1 = new LineUp();
        LineUp task2 = new LineUp();
        LineUp task3 = new LineUp();
        LineUp task4 = new LineUp();
        LineUp task5 = new LineUp();
        LineUp task6 = new LineUp();

        task1.setNombreBanda("Radiohead");
        task1.setNumeroPresentacion(1);
        task1.setCanciones("Karma Police, Paranoid Android, Creep");
        task1.setPathImagen("https://www.todomusica.org/imagenes/680x380/radiohead.jpg");
        task1.setVideo("https://www.youtube.com/watch?v=1uYWYWPc9HU");
        Thread t1 = new Thread(task1);

        task2.setNombreBanda("Daft Punk");
        task2.setNumeroPresentacion(2);
        task2.setCanciones("Around the world, Get Lucky, Instant Crush");
        task2.setPathImagen("https://indiehoy.com/wp-content/uploads/2021/09/daft-punk.jpg");
        task2.setVideo("https://www.youtube.com/watch?v=K0HSD_i2DvA");
        Thread t2 = new Thread(task2);

        task3.setNombreBanda("Imagine Dragons");
        task3.setNumeroPresentacion(3);
        task3.setCanciones("Thunder, Radioactive, Enemy");
        task3.setPathImagen("https://www.todomusica.org/imagenes/_notb/imagine-dragons-actuaran-final-champions-league-wanda-metropolitano.jpg");
        task3.setVideo("https://www.youtube.com/watch?v=fKopy74weus");
        Thread t3 = new Thread(task3);

        task4.setNombreBanda("Coldplay");
        task4.setNumeroPresentacion(4);
        task4.setCanciones("My universe, Clocks, Yellow");
        task4.setPathImagen("https://www.alohacriticon.com/wp-content/uploads/2015/01/coldplay-foto-biografia.jpg");
        task4.setVideo("https://www.youtube.com/watch?v=3YqPKLZF_WU");
        Thread t4 = new Thread(task4);

        task5.setNombreBanda("LP");
        task5.setNumeroPresentacion(5);
        task5.setCanciones("Lost on You, When we're high, Tighrope");
        task5.setPathImagen("https://images.squarespace-cdn.com/content/v1/56e834ebd51cd466c99178e5/1592430931709-13QF7PN51A7E3QKJ3EJ7/LP.jpg");
        task5.setVideo("https://www.youtube.com/watch?v=wDjeBNv6ip0");
        Thread t5 = new Thread(task5);

        task6.setNombreBanda("Twenty one pilots");
        task6.setNumeroPresentacion(6);
        task6.setCanciones("Stressed out, Ride, Heavydirtysoul");
        task6.setPathImagen("http://www.thebackstage.net/wp-content/uploads/2021/06/twenty-one-pilots-Junio-2021.jpg");
        task6.setVideo("https://www.youtube.com/watch?v=pXRviuL6vMY");
        Thread t6 = new Thread(task6);

        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(1000);
        t3.start();
        Thread.sleep(1000);
        t4.start();
        Thread.sleep(1000);
        t5.start();
        Thread.sleep(1000);
        t6.start();

    }
}
