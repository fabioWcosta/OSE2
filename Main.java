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

        int dicesStr = (int) (1 + strRandom * (3-18));
        int dicesDex = (int) (1 + dexRandom * (3-18));
        int dicesCon = (int) (1 + conRandom * (3-18));
        int dicesInt = (int) (1 + intRandom * (3-18));
        int dicesWis = (int) (1 + wisRandom * (3-18));
        int dicesCha = (int) (1 + chaRandom * (3-18));

        
        System.out.println("Habilidades do Personagem:");
        System.out.println("For: " + dicesStr);
        System.out.println("Des: " + dicesDex);
        System.out.println("Con: " + dicesCon);
        System.out.println("Int: " + dicesInt);
        System.out.println("Wis: " + dicesWis);
        System.out.println("Car: " + dicesCha);

        System.out.println("Ele pode ser um: Guerreiro, Clérigo, Ladrão, Mago");
    }
}
