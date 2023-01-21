
public class Terrestre extends Terrestre_Astratto{
    public Terrestre(String nome, int vita, int velocita, int armamento) {
        super(nome, vita, velocita, armamento);
    }

    public void Terrestre(String n, int[]param){
        this.Nome=n;
        this.Vita=param[0];
        this.Velocita=param[1];
        this.Armamento=param[2];
    }

    public void attaccaMarziano(){
        if(Vita<=0){
            System.out.println("Non posso attaccare, vita insufficente");
        }
        else{
            Vita=Vita-20+2*(Velocita+Armamento);
            System.out.println("La vita residua è: "+Vita);
        }
    }

    public boolean Vivente(){
        if(Vita>0){
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "Nome= " + Nome + '\'' + ", Vita= " + Vita;
    }

    public boolean Equals(Terrestre x){
        if(x.Vita==Vita && x.Velocita==Velocita && x.Armamento==Armamento){
            return true;
        }
        else{
            return false;
        }
    }
}
