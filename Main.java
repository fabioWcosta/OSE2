
public class Main {
    public static void main(String[] args){

        int Str;
        int Int;
        int Wis;
        int Dex;
        int Con;
        int Cha;

        int moral;

        double strRandom = Math.random();
        double dexRandom = Math.random();
        double conRandom = Math.random();
        double intRandom = Math.random();
        double wisRandom = Math.random();
        double chaRandom = Math.random();
        double moralRandom = Math.random();

        int dicesStr = (int) (1 + strRandom * (-3+18));
        int dicesDex = (int) (1 + dexRandom * (-3+18));
        int dicesCon = (int) (1 + conRandom * (-3+18));
        int dicesInt = (int) (1 + intRandom * (-3+18));
        int dicesWis = (int) (1 + wisRandom * (-3+18));
        int dicesCha = (int) (1 + chaRandom * (-3+18));

        int moralResult = (int) (1 + moralRandom * (12 - 2));

        System.out.println("MORAL DO MONSTRO: "+ moralResult);

        System.out.println("Atributos :");
        System.out.println("For: " + dicesStr);
        System.out.println("Des: " + dicesDex);
        System.out.println("Con: " + dicesCon);
        System.out.println("Int: " + dicesInt);
        System.out.println("Wis: " + dicesWis);
        System.out.println("Car: " + dicesCha);
        System.out.println();

            double random = Math.random();
            int moralRes = (int) ( 1 + random *(12 - 2));

            System.out.println("Resultado do teste de Moral: " + moralRes);
            if(moralRes <= 6){
                System.out.println("Falha no teste!");
            }else{
                System.out.println("Sucesso no teste!");
            }
            System.out.println();
 

        System.out.println("Ele pode ser um: ");
        if(dicesStr >= 6){
            System.out.println("Guerreiro");
            if(dicesStr == 1 || dicesStr == 2){
            }
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
    //Lembrar: inserir a seguir um programa que gere resultados randômicos para encontros!
    //Criar lista com resultados randômicos para tesouros pós-combate

    //Também não deixar de gerar uma lista com resultados para testes de MORAL para monstros e adversários
}
