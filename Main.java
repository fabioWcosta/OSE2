

public class Main {
    public static void main(String[] args){

        //OBJETO
        Opponent Op1 = new Opponent();

        System.out.println("Os dois oponentes se encontram...");
        System.out.println(" que comece o combate.");


        System.out.println("Atributos :");
        System.out.println("For: " + dicesStr);
        System.out.println("Int: " + dicesInt);
        System.out.println("Wis: " + dicesWis);
        System.out.println("Des: " + dicesDex);
        System.out.println("Con: " + dicesCon);
        System.out.println("Car: " + dicesCha);
        System.out.println();

        //VERIFICAÇÃO DE SURPRESA!
        double randomNumber = Math.random();
        int surpresa = (int) (1 + randomNumber * (18));
        System.out.println("Resultado do encontro:" + surpresa);
        if(surpresa <= 4){
            System.out.println("Os monstros são supreendidos!!!");
        }else{
            System.out.println("Não houve surpresa.");
            System.out.println("O combate começa normalmente.");
        }

        //VERIFICAÇÃO DE MORAL 
            System.out.println();

            double random = Math.random();
            int moralRes = (int) ( 1 + random *(12 - 2));

            System.out.println("Resultado do teste de Moral: " + moralRes);
            if(moralRes <= 6){
                System.out.println("Falha no teste! Saiu correndo!!!!");
            }else{
                System.out.println("Sucesso no teste!");
            }
            System.out.println();
         
        // Definição de classe por atributo
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
    //Ataque de um personagem a outro:
    public static int attack(int AB, int CA) {
        double attackDice = Math.random();
        int diceResult = (int) attackDice *(20-1);

        System.out.println("Fulaninho ataca Cicrano!");
        
        if(diceResult >= CA){
            System.out.println("ACERTO!!!");
        }else{
            System.out.println("ERROU!");
        }
        return diceResult;
    }

    //Lembrar: inserir a seguir um programa que gere resultados randômicos para encontros!
    //Criar lista com resultados randômicos para tesouros pós-combate

    //Também não deixar de gerar uma lista com resultados para testes de MORAL para monstros e adversários
}
