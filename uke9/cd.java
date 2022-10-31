class CDAlbum implements Comparable<CDAlbum>{
    String artistnavn;
    String albumnavn;
    int utgivelsesaar;

    CDAlbum(String artistnavn, String albumnavn, int utgivelsesaar){
        this.artistnavn = artistnavn;
        this.albumnavn = albumnavn;
        this.utgivelsesaar = utgivelsesaar;
    }

    public String hentArtist(){
        return artistnavn;
    }

    public String hentAlbum(){
        return albumnavn;
    }

    public int hentAar(){
        return utgivelsesaar;
    }

    public String toString(){
        return "Artist: " + hentArtist() + " Album: " + hentAlbum() +
         " Utgivelsesaar: " + hentAar();
    }

    public int compareTo(CDAlbum cd){
        return this.hentArtist().compareTo(cd.hentArtist());
    }

}