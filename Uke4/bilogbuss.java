abstract class Kjoretoy{
  Kjøretøy(int regNr, String fabrikkMerke, String navn){
    this.regNr = regNr;
    this.fabrikkMerke = fabrikkMerke;
    this.navn = navn;
  }
  public abstract void skrivInfo(){
    System.out.println("Navn: " + navn + "Registreringsnummer: " + regNr);
    System.out.println("Fabrikkmerke: " + fabrikkMerke);
  }
  int hentRegNummer(){
    return regNr;
  }
  String hentNavn(){
    return navn;
  }
  String hentFabrikkmerke(){
    return fabrikkMerke;
  }
}

class Buss extends Kjoretoy{
  int antPlasser;

  Buss(int regNr, String fabrikkMerke, String navn, int antPlasser){
    super(regNr,fabrikkMerke,navn);
    this.antPlasser = antPlasser;
  }
  @Override
  skrivInfo(){
    System.out.println("Navn: " + navn + "Registreringsnummer: " + regNr);
    System.out.println("Fabrikkmerke: " + fabrikkMerke + "Antall plasser: " + antPlasser);
  }
}

class Personbil extends Kjoretoy{
  int antPlasser;
  Personbil(int regNr, String fabrikkMerke, String navn, int antPlasser){
    super(regNr,fabrikkMerke,navn)
    this.antPlasser = antPlasser;
  }
  int aarsAvgift(){
    return 3000;
  }
  @Override
  skrivInfo(){
    System.out.println("Navn: " + navn + "Registreringsnummer: " + regNr);
    System.out.println("Fabrikkmerke: " + fabrikkMerke + "Antall plasser: " + antPlasser);
    System.out.println("Årsavgift: " + aarsAvgift());
  }
}

class Varebil extends Kjoretoy{
  int maxVekt;
  Varebil(int regNr, String fabrikkMerke, String navn, int maxVekt){
    super(regNr,fabrikkMerke,navn)
    this.maxVekt = maxVekt;
  }
  int aarsAvgift(){
    return 4*maxVekt;
  }
  @Override
  skrivInfo(){
    System.out.println("Navn: " + navn + "Registreringsnummer: " + regNr);
    System.out.println("Fabrikkmerke: " + fabrikkMerke + "Maks vekt: " + maxVekt);
    System.out.println("Årsavgift: " + aarsAvgift());
  }
}
