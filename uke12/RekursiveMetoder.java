import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RekursiveMetoder{

    RekursiveMetoder(){
    }

    public static String hentStringRiktigVei(List<String> ord){
        if(ord.isEmpty()){
            return "";
        }
        String forste = ord.remove(0);
        return forste + hentStringRiktigVei(ord);
    }
  /**
  *konkantinerer alle stringen i en liste, i feil rekkefolge
  *@param ord: alle stringen som skal konkantineres
  *@return en string av alle ordene i lista i feil rekkefolge
  */
  public static String hentStringFeilVei(List<String> ord){
    if( ord.isEmpty()){
        return "";
    }
    String forste = ord.remove(ord.size()-1);
    return forste + hentStringFeilVei(ord);
  }
}

class Main{
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("hei");
        liste.add("paa");
        liste.add("deg");

        if(RekursiveMetoder.hentStringRiktigVei(liste).equals("heipaadeg")){
            System.out.println("Test 1 kjorte");
        }

        liste.add("hei");
        liste.add("paa");
        liste.add("deg");

        if(RekursiveMetoder.hentStringFeilVei(liste).equals("degpaahei")){
            System.out.println("Test 2 kjorte");
        }

    }
}