class UgyldigVerdi extends RuntimeException{
    UgyldigVerdi(int indeks){
        super("Ugyldig indeks: " + indeks);
    }
}
