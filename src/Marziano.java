
public class Marziano extends Marziano_Astratto{

    public Marziano(String matricola, int autonomia, int AI, int tecnologia) {
        super(matricola, autonomia, AI, tecnologia);
    }

    public void Marziano(String m, int[]param){
        this.Matricola=m;
        this.Autonomia=param[0];
        this.AI=param[1];
        this.Tecnologia=param[2];
    }

    public void attaccaTerrestri(){
        if(Autonomia<=0){
            System.out.println("Non posso attaccare, autonomia insufficente");
        }
        else{
            Autonomia=Autonomia-20+2*(AI+Tecnologia);
            System.out.println("L'autonomia residua è: "+Autonomia);
        }
    }

    public boolean Attivo(){
        if(Autonomia>0){
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "Matricola= " + Matricola + '\'' +", Autonomia= " + Autonomia;
    }

    public boolean Equals(Marziano x){
        if(x.Autonomia==Autonomia && x.AI==AI && x.Tecnologia==Tecnologia){
            return true;
        }
        else{
            return false;
        }
    }

}
