class Person implements Comparable<Person>{
   private String navn;
   private int fodselsaar;
   private Person mor;
   private Person far;
   
   Person(int f, String n, Person m, Person fa){
       this.navn = n;
       this.fodselsaar = f;
       this.mor = m;
       this.far = fa;
   }
   public String hentNavn(){
       return navn;
   }
   public int hentAlder(){
       return fodselsaar;
   }
   public Person hentMor(){
       return mor;
   }
   public Person hentFar(){
       return far;
   }

   public Person finnEldsteKjenteForfader(){
       if (mor == null){
           if (far == null){
               return this;
           }
           else{
               return far.finnEldsteKjenteForfader();
           }
         }
        if (far == null){
            return mor.finnEldsteKjenteForfader();
        }

        Person morside = mor.finnEldsteKjenteForfader();
        Person farside = far.finnEldsteKjenteForfader();

        if (morside.compareTo(farside) < 0){
            return morside;
        }else{
            return farside;
        }
       
   }
   @Override
   public String toString(){
       return "Navn: " + hentNavn() + " Fodselsaar: " + hentAlder() + 
       " \nMor: " + hentMor() + " Far: " + hentFar();
   }
   @Override
   public int compareTo(Person annen){
       return fodselsaar - annen.hentAlder();
   }
}

