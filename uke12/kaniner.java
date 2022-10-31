
class KaninOreTeller {
        
        public static void main(String[] args) {
            System.out.println(tellKaninOrer(0)); //Forventet resultat 0
            System.out.println(tellKaninOrer(1)); //Forventet resultat 2
            System.out.println(tellKaninOrer(2)); //Forventet resultat 4
            System.out.println(tellKaninOrer(12)); //Forventet resultat 24
            System.out.println(tellKaninOrer(234)); //Forventet resultat 468
    }

    public static int tellKaninOrer(int antallKaniner){

        if(antallKaniner != 0){
            antallKaniner = antallKaniner*2;
            tellKaninOrer(antallKaniner);
            return antallKaniner;
        }
        return antallKaniner;
    }
}
