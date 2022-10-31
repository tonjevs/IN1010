class Hoved{

    public static void main(String[] args){

      try{
          String filnavn = "abel.txt";
          Dataklynge abel = new Dataklynge(filnavn);

			  System.out.println("Abel har " + abel.antRacks() + " racks");
        System.out.println("Abel har " + abel.antProsessorer() + " prosessorer");
        System.out.println("");
			  System.out.println("Noder med minst 32GB:" + abel.noderMedNokMinne(32));
			  System.out.println("Noder med minst 64GB:" + abel.noderMedNokMinne(64));
			  System.out.println("Noder med minst 128GB:"+ abel.noderMedNokMinne(128));

      }catch (Exception e) { //om filen ikke blir funnet så "catcher" vi exceptionen
          e.printStackTrace();
        }
    }
}
