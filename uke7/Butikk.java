import java.util.Iterator;

class Butikk implements Iterable<Person>{

    private Person forste;

    public void entreButikk(Person p){
        Person neste = forste;

        if (forste == null){
            forste = p;
            return;
        }

        while(neste.hentNeste() != null){
            neste = neste.hentNeste();
        }
        neste.sett(p);
    }

    public Iterator<Person> iterator(){
        return new PersonIterator();
        
    }
}
class PersonIterator implements Iterator<Person>{
    private Person denne;
    private Person forste;

    PersonIterator(){
        denne = forste;
    }
    @Override
    public boolean hasNext(){
        return denne != null;
    }

    @Override
    public Person next(){
        Person temp = denne;
        denne = denne.hentNeste();
        return temp;
    }
}
