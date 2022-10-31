class Yass{
  public static void main(String[] args){
    Skyskraper ny = new Skyskraper(5,5);
  }
}
class Bygning{
  protected double bruttoAreal;
  
  Bygning(double bruttoAreal){
    this.bruttoAreal = bruttoAreal;
    System.out.println("Dette er en bygning");
  }
}

class Skyskraper extends Bygning{
  Skyskraper(double bruttoAreal, int antallEtasjer){
    super(bruttoAreal);
    this.antallEtasjer = antallEtasjer;
    System.out.println("Dette er en skyskraper");
  }
}
//a) det blir opprettet ett nytt objekt og kaller på superklassen så begge
//   vil bli skrevet ut
//b) det vil skje det samme som forrige siden de to kodene er like
//c) vi må kalle på super med bruttoareal som parameter
