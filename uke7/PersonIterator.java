import java.util.Iterator;

import java.util.Iterator;

public class PersonIterator implements Iterator<Person>{
    private Person denne;

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

