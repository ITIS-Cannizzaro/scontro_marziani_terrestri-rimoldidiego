
public abstract class Terrestre_Astratto {
    protected String Nome;
    protected int Vita;
    protected int Velocita;
    protected int Armamento;

    public Terrestre_Astratto() {
        Nome = "";
        Vita = 50;
        Velocita = 5;
        Armamento = 5;
    }
    public Terrestre_Astratto(String nome, int vita, int velocita, int armamento) {
    }
}
