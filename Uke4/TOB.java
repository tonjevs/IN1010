class TOB{
  public static void main(String[] args){

    Ordbeholder ord = new Ordbeholder();
    if (ord.pop() == null){
    System.out.println("Riktig");
    }else{
      System.out.println("Feil");
    }//Riktig

    if (ord.settInn("hei") == true){
      System.out.println("Riktig");
      }else{
        System.out.println("Feil");
      }//Riktig

    if (ord.settInn("hei") == false){
      System.out.println("Riktig");
      }else{
        System.out.println("Feil");
      }//Riktig

    ord.settInn("yo");
    ord.settInn("Tonje");
    ord.settInn("wii");

    if (ord.antallOrd() != 4){
      System.out.println("Riktig");
      }else{
        System.out.println("Feil");
      }//Feil

    if(ord.pop() == "wii"){
      System.out.println("Riktig");
      }else{
        System.out.println("Feil");
      }//Riktig

      if(ord.antallOrd() == 3){
        System.out.println("Riktig");
        }else{
          System.out.println("Feil");
        }//Riktig
  }
}
