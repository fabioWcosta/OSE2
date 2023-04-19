public class Actions {

        //VARIÁVEIS
        public String nome;
        public int AB;
        public int CA;
        public int HP;
        public int ini;
        public int moral;

        public Opponent(String nome, int AB, int CA, int HP, int moral){
            this.nome = nome;
            this.AB = AB;
            this.CA = CA;
            this.HP = HP;
            this.ini = ini;
            this.moral = moral;
        }

        public String presentation(){
            System.out.println("Os oponentes se encontram. E se observam.");
            System.out.println("O "+Op1+" se prepara para o combate.");
            System.out.println("O "+Op2+" parece tenso..");
            return presentation();
        }

        //Os oponentes comparam suas iniciativas:
        public int initiative(){
            System.out.println();
            System.out.println("Os oponentes se movem e o combate começa!");
            double randIni = Math.random();
            int iniResult = (int) 1 + random * (6 - 1);
            System.out.println(iniResult);
        }
}
