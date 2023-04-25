
public class Opponent {
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
}
