public class Actions {

        //VARIÁVEIS
        public String nome;
        public int AB;
        public int CA;
        public int HP;
        public int moral;

        public Opponent(String nome, int AB, int CA, int HP, int moral){
            this.nome = nome;
            this.AB = AB;
            this.CA = CA;
            this.HP = HP;
            this.moral = moral;
        }

        public String presentation(){
            System.out.println("Os oponentes se encontram. E se observam.");
            System.out.println("O "+Op1+" se prepara para o combate.");
            System.out.println("O "+Op2+" parece tenso..");
            return presentation();
        }
}
