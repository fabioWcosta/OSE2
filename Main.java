public class Main {
    public static void main(String[] args){

        int Str;
        int Dex;
        int Con;
        int Int;
        int Wis;
        int Cha;

        double strRandom = Math.random();
        double dexRandom = Math.random();
        double conRandom = Math.random();
        double intRandom = Math.random();
        double wisRandom = Math.random();
        double chaRandom = Math.random();

        int dicesStr = (int) (1 + strRandom * (18-3));
        int dicesDex = (int) (1 + dexRandom * (18-3));
        int dicesCon = (int) (1 + conRandom * (18-3));
        int dicesInt = (int) (1 + intRandom * (18-3));
        int dicesWis = (int) (1 + wisRandom * (18-3));
        int dicesCha = (int) (1 + chaRandom * (18-3));

        System.out.println("");

        System.out.println("Atributos :");
        System.out.println("For: " + dicesStr);
        System.out.println("Des: " + dicesDex);
        System.out.println("Con: " + dicesCon);
        System.out.println("Int: " + dicesInt);
        System.out.println("Wis: " + dicesWis);
        System.out.println("Car: " + dicesCha);

        System.out.println("Ele pode ser um: ");
        if(dicesStr >= 9){
            System.out.println("Guerreiro");
        }else if(dicesDex >= 9){
            System.out.println("Ladrão");
        }else if(dicesWis >= 9){
            System.out.println("Clérigo");
        }else if(dicesInt >= 9){
            System.out.println("Mago");
        }else{
        System.out.println("Tente de novo.");
        }
    }
}
