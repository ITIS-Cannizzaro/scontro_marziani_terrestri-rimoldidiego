
public class Main_Gioco_Esercitazione_20_01_2023 {
	public static void main(String[]args){
        System.out.println("Il gioco ha inizio");

        System.out.println(" ");

        //Classe Marziano:

        Marziano m1=new Marziano("",0,0,0);
        Marziano x102=new Marziano("", 0, 0, 0);

        int param[]=new int [3];
        String m="x102";
        param[0]=50;
        param[1]=5;
        param[2]=5;
        x102.Marziano(m,param);
        System.out.println(x102.Equals(m1));
        System.out.println("Il marziano è vivo? "+x102.Attivo());
        System.out.println("Primo attacco: ");
        x102.attaccaTerrestri();
        System.out.println("Secondo attacco: ");
        x102.attaccaTerrestri();

        //Classe Terrestre:

        System.out.println(" ");
        Terrestre t1=new Terrestre("",0,0,0);
        Terrestre Ken=new Terrestre("", 0, 0, 0);

        int param1[]=new int [3];
        String n="Ken";
        param1[0]=75;
        param1[1]=10;
        param1[2]=6;
        Ken.Terrestre(n,param1);
        System.out.println(Ken.Equals(t1));
        System.out.println("Il terrestre è vivo? "+Ken.Vivente());
        System.out.println("Primo attacco: ");
        Ken.attaccaMarziano();
        System.out.println("Secondo attacco: ");
        Ken.attaccaMarziano();

        System.out.println(" ");

        System.out.println("Il gioco è terminato");

    }

}
