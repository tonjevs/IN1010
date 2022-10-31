class Person{
    private String navn;
    private String gjenstand;
    private Person neste = null;

    Person(String navn, String gjenstand){
        this.navn = navn;
        this.gjenstand = gjenstand;
    }
    public void sett(Person nyPerson){
        neste = nyPerson;
    }
    public String hentNavn(){
        return navn;
    }
    public Person hentNeste(){
        return neste;
    }
    public String toString(){
        return hentNavn() + " kjoeper " + gjenstand;
    }
}