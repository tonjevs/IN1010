import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

class Dataklynge{

    ArrayList<Rack> datasenter = new ArrayList();
    public int noderPerRack;

    Dataklynge(String filnavn){
      File fil = new File(filnavn);
        Scanner in;
        try{
            in = new Scanner(fil);
        }catch(FileNotFoundException exception){
            System.out.println("Fant ikke filen");
            in = new Scanner("");
			}

      while (in.hasNextLine()){

        if ((in.nextLine()).length() == 1){
          String tall = in.nextLine();
          int noderPerRack = Integer.parseInt(tall);

        }else{
          String biter[] = in.nextLine().split(" ");

          int totAntallNoder = Integer.parseInt(biter[0]);
          int minnePerNode = Integer.parseInt(biter[1]);
          int antProsessorerPerNode = Integer.parseInt(biter[2]);
          Rack rack = new Rack(noderPerRack);
          datasenter.add(rack);

          for (int i = 0; i < totAntallNoder; i++){
            Node node = new Node(minnePerNode,antProsessorerPerNode);
            settInnNoder(node);
          }
        }
      }
    }

      public void settInnNoder(Node node){

        Rack ledigRack = null;
        int i = 0;
        int antall = datasenter.get(i).getAntNoder();

        while(ledigRack == null && i < antall){
            ledigRack = datasenter.get(i);
            i++;
        }

        if (ledigRack == null){
            Rack nyttRack = new Rack(maxNoder);
            ledigRack = nyttRack;
            datasenter.add(ledigRack);
        }
        ledigRack.settInn(node);

    }

    public int antProsessorer(){
        int total = 0;
        for (int i = 0; i < datasenter.size(); i++){
            total += datasenter.get(i).antPros();
          }
        return total;
    }

    public int noderMedNokMinne(int paakrevdMinne){
      int total = 0;
      for (int i = 0; i < datasenter.size(); i++){
          total += datasenter.get(i).medNokMinne(paakrevdMinne);
        }
      return total;
    }

    public int antRacks(){
      return datasenter.size();
    }
  }
