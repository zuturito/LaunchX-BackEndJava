public class CerdoArania extends Modelo implements Interface{

    @Override
    public void sentidoAracnido(int sentidoaracnido) {
            setSentidoAracnido(20);
    }

    @Override
    public int golpeDebil(int fuerza) {
        if (fuerza>=25 && fuerza<= 40){
            setDañoOponente(100);
            return getDañoOponente();
        }else if (fuerza>=35 && fuerza<= 50){
            setDañoOponente(170);
            return getDañoOponente();
        }else if (fuerza>=60 && fuerza<= 100){
            setDañoOponente(270);
            return getDañoOponente();
        }else if (fuerza >=90 && fuerza <= 100){
            setDañoOponente(290);
            return getDañoOponente();
        }else{
            setDañoOponente(0);
        }
        return getDañoOponente();
    }

    @Override
    public int patadaDebil(int fuerza) {
        if (fuerza>=25 && fuerza<= 40){
            setDañoOponente(100);
            return getDañoOponente();
        }else if (fuerza>=35 && fuerza<= 50){
            setDañoOponente(170);
            return getDañoOponente();
        }else if (fuerza>=60 && fuerza<= 100){
            setDañoOponente(270);
            return getDañoOponente();
        }else if (fuerza >=90 && fuerza <= 100){
            setDañoOponente(290);
            return getDañoOponente();
        }else{
            setDañoOponente(0);
        }
        return getDañoOponente();
    }

    @Override
    public int golpeFuerte(int fuerza) {
        return 0;
    }

    @Override
    public int patadaFuerte(int fuerza) {
        return 0;
    }

    @Override
    public int lanzaTelaraña(int fuerza) {
        if (fuerza==0) {
            setDañoOponente(0);
        }
        return getDañoOponente();
    }

    @Override
    public int patadaGiratoria(int fuerza) {
        if (fuerza>=150 && fuerza<= 400){
            setDañoOponente(150);
        }
        return getDañoOponente();    }
}
