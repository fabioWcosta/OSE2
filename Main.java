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
        double strRandom = Math.random();
        double strRandom = Math.random();
        double strRandom = Math.random();

        int dicesStr = (int) (1 + random * (18-3));
        int dicesDex = (int) (1 + random * (18-3));
        int dicesCon = (int) (1 + random * (18-3));
        int dicesInt = (int) (1 + random * (18-3));
        int dicesWis = (int) (1 + random * (18-3));
        int dicesCha = (int) (1 + random * (18-3));

        
        System.out.println("Habilidades do Personagem:");
        System.out.println("For: " + dicesStr);
        System.out.println("Des: " + dicesDex);
        System.out.println("Con: " + dicesCon);
        System.out.println("Int: " + dicesInt);
        System.out.println("Wis: " + dicesWis);
        System.out.println("Car: " + dicesCha);

        System.out.println("")
    }
}
