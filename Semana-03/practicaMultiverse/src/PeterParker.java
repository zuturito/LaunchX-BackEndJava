public class PeterParker extends Modelo implements Interface{

    @Override
    public void sentidoAracnido(int sentidoaracnido) {
            setSentidoAracnido(100);
    }

    @Override
    public int golpeDebil(int fuerza) {
        if (fuerza>=15 && fuerza<= 40){
            setDañoOponente(100);
            return getDañoOponente();
        }else if (fuerza>=25 && fuerza<= 50){
            setDañoOponente(150);
            return getDañoOponente();
        }else if (fuerza>=50 && fuerza<= 100){
            setDañoOponente(70);
            return getDañoOponente();
        }else if (fuerza >=80 && fuerza <= 100){
            setDañoOponente(90);
            return getDañoOponente();
        }else{
            setDañoOponente(0);
        }
        return getDañoOponente();
    }

    @Override
    public int patadaDebil(int fuerza) {
        if (fuerza>=15 && fuerza<= 40){
            setDañoOponente(100);
            return getDañoOponente();
        }else if (fuerza>=25 && fuerza<= 50){
            setDañoOponente(150);
            return getDañoOponente();
        }else if (fuerza>=50 && fuerza<= 100){
            setDañoOponente(70);
            return getDañoOponente();
        }else if (fuerza >=80 && fuerza <= 100){
            setDañoOponente(90);
            return getDañoOponente();
        }else{
            setDañoOponente(0);
        }
        return getDañoOponente();
    }

    @Override
    public int golpeFuerte(int fuerza) {
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
    public int patadaFuerte(int fuerza) {
        if (fuerza>=25 && fuerza<= 40){
            setDañoOponente(150);
            return getDañoOponente();
        }else if (fuerza>=35 && fuerza<= 50){
            setDañoOponente(170);
            return getDañoOponente();
        }else if (fuerza>=60 && fuerza<= 100){
            setDañoOponente(190);
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
    public int lanzaTelaraña(int fuerza) {
        if (fuerza==0) {
            setDañoOponente(0);
        }
        return getDañoOponente();
    }

    @Override
    public int patadaGiratoria(int fuerza) {
        if (fuerza>=200) {
            setDañoOponente(300);
        }
        return getDañoOponente();
    }
}
