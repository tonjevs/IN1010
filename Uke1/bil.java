class Bil{

  private String eier;
  private String merke;

    public void Biltest(String e, String m){
        eier = e;
        merke = m;
    }

    public void infoombil(){
        System.out.println("Eier: " + eier + "Merke: " + merke);

    }
}
