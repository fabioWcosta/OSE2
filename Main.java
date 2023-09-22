

public class Main {
    public static void main(String[] args){

        //OBJETO
        Opponent Op1 = new Opponent();

        System.out.println("Os dois oponentes se encontram...");
        System.out.println(" e que comece o combate.");

        double strRandom = Math.random();
        double intRandom = Math.random();
        double wisRandom = Math.random();
        double dexRandom = Math.random();
        double conRandom = Math.random();
        double chaRandom = Math.random();
        double moralRandom = Math.random();

        int dicesStr = (int) (3 + strRandom * (15));
        int dicesInt = (int) (3 + intRandom * (15));
        int dicesWis = (int) (3 + wisRandom * (15));
        int dicesDex = (int) (3 + dexRandom * (15));
        int dicesCon = (int) (3 + conRandom * (15));
        int dicesCha = (int) (3 + chaRandom * (15));

        System.out.println("Atributos :");
        System.out.println("For: " + dicesStr);
        System.out.println("Int: " + dicesInt);
        System.out.println("Wis: " + dicesWis);
        System.out.println("Des: " + dicesDex);
        System.out.println("Con: " + dicesCon);
        System.out.println("Car: " + dicesCha);
        System.out.println();

        //VERIFICAÇÃO DE SURPRESA!
        // um resultado de 1 ou 2 em 1d6 significa que o lado está surpreso
        double randomNumber = Math.random();
        int surpresa = (int) (randomNumber * (6-1));
        System.out.println("Resultado do encontro: " + surpresa +" (em 1d6)");
        if(surpresa <= 2){
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
                System.out.println("Falhou no teste! Está batendo em retirada!!!!");
            }else{
                System.out.println("Sucesso no teste!");
                System.out.println("Vai haver combate!");
            }
            System.out.println();

        //OPERADOR TERNÁRIO (IF ELSE REVIEW)
        String nome1 = "Gustav";
        String nome2 = "Gustav";
        String nome3 = new String("Gustav");
        String res; 
        res = (nome1==nome2)? "igual":"São diferente";
        res = (nome1.equals(nome2))? "É igual!":"Não, é diferente";
        System.out.println(res);

    }
    //Ataque de um personagem a outro:
    public static int attack(int AB, int CA) {
        double attackDice = Math.random();
        int diceResult = (int) attackDice *(20-1);

        System.out.println("Fulano ataca Cicrano!");
        
        if(diceResult >= CA){
            System.out.println("ACERTOu!!!");
        }else{
            System.out.println("ERROU!");
        }
        return diceResult;
    }

    //Lembrar: inserir a seguir um programa que gere resultados randômicos para encontros!
    //Criar lista com resultados randômicos para tesouros pós-combate

    //Também não deixar de gerar uma lista com resultados para testes de MORAL para monstros e adversários
}
