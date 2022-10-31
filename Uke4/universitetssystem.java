//**class Universitetssystem{
    //public static void main(String[] args){
      //  pass
  //  }
//}

abstract class Person{
  Person(String navn, int alder){
    this.navn = navn;
    this.alder = alder;
  }
  public abstract void skrivInfo();
}

abstract class Student extends Person{
  String navn;
  int alder;
  Student(String navn, int alder, String kurs, String læringsSted){
    super(navn,alder);
    this.kurs = kurs;
    this.læringsSted = læringsSted;
  }
  public abstract boolean harTilgang();
}

abstract class Bachelorstudent extends Student{
   Bachelorstudent(String navn, int alder, String kurs, String læringsSted){
   super(navn,alder,kurs,læringsSted);
   }
   public boolean harTilgang(){
     return false;
   }
   public void skrivInfo(){
     System.out.println("Bachelorstudent: " + navn + "Alder: " + alder + "\nKurs: "
     + kurs + "Lærested: " + læringsSted);
   }
}

abstract class Masterstudent extends Student{
  Masterstudent(String navn, int alder, String kurs, String læringsSted){
    super(navn,alder,kurs,læringsSted);
  }
  public boolean harTilgang(){
    return true;
  }
  public void skrivInfo(){
      System.out.println("Masterstudent: " + navn + "Alder: " + alder + "\nKurs: "
      + kurs + "Lærested: " + læringsSted);
  }
}

abstract class Ansatt extends Person{
  Ansatt(String navn, int alder, int timeslønn){
    super(navn,alder);
    this.timeslønn = timeslønn;
  }
  public int skrivTimeLønn(){
    return timeslønn;
  }
}

abstract class Professorer extends Ansatt{
  Professorer(String navn, int alder, String undervisning, String fagområde, int timeslønn){
    super(navn,alder,timeslønn);
    this.undervisning = undervisning;
    this.fagområde = fagområde;
  }
  public void skrivInfo(){
    System.out.println("Professor: " + navn + "Alder: " + alder + "\nKurs: "
    + undervisning + "Fagområde: " + fagområde);
  }
}
abstract class Forsker extends Ansatt{
  Forsker(String navn, int alder, String fagområde, int timeslønn){
    super(navn,alder,timeslønn);
    this.fagområde = fagområde;
  }
  public void skrivInfo(){
    System.out.println("Forsker: " + navn + "Alder: " + alder + "\nFagområde: " + fagområde);
  }
}
