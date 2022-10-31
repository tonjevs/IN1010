import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

class Hoved{

    public static void main(String[] args)throws Exception{

    		Scanner fil = new Scanner(new File("abel.txt"));
    		fil.nextInt();

    					while (fil.hasNextLine()){
    							String linjeAvTall = fil.nextLine();
    							String[] allData = linjeAvTall.split(" ");
    							int size = allData.length;
    	      			int [] array = new int [size];

    							try{
    	      			for(int i=0; i<size; i++) {
    	         			array[i] = Integer.parseInt(allData[i]);
    							}
    							}
    							catch (Exception e) {
    		          	e.printStackTrace();
    		        	}

    							int totAntallNoder = array[0];
    							int minnePerNode = array[1];
    							int antallProssesorerPerNode = array[2];


        Dataklynge abel = new Dataklynge(totAntallNoder, minnePerNode, antallProssesorerPerNode);

        try{

			  System.out.println("Abel har" + abel.antRacks() + "racks");
			  System.out.println("Noder med minst 32GB:" + abel.noderMedNokMinne(32));
			  System.out.println("Noder med minst 64GB:" + abel.noderMedNokMinne(64));
			  System.out.println("Noder med minst 128GB:"+ abel.noderMedNokMinne(128));
        }catch (Exception e) {
          e.printStackTrace();

        }
    }
}

class Dataklynge{

	ArrayList<Rack> datasenter = new ArrayList<>();
	final int noderPerRack;
	public Dataklynge(int minnePerNode, int antallProssesorerPerNode, int totAntallNoder){
		this.noderPerRack = 0;

	}

		public void settInnNode(Node node){
			for (int i = 0; i < datasenter.size(); i++){

				Rack objekt = datasenter.get(i);
				int size = objekt.getAntNoder();
				if (noderPerRack < size){
						objekt.settInn(node);
						}
				else{
						Rack rack = new Rack(noderPerRack);
						datasenter.add(rack);
						rack.settInn(node);

				}
			}
	}

	public int antProsessorer(){
			int total = 0;
			for (int i = 0; i < datasenter.size(); i++){
					total += datasenter.get(i).antProsessorer();
				}
			return total;
	}

	public int noderMedNokMinne(int paakrevdMinne){
		int total = 0;
		for (int i = 0; i < datasenter.size(); i++){
				total += datasenter.get(i).noderMedNokMinne(paakrevdMinne);
			}
		return total;
	}

	public int antRacks(){
		return datasenter.size();
	}
}

class Rack{


		private int antallProssesorerPerNode;

		private int minnePerNode;

		Node node = new Node(minnePerNode,antallProssesorerPerNode);

		private int antNoderiRack;
		ArrayList<Node> rack = new ArrayList<>(antNoderiRack);

		Rack(int antNoderiRack){
				this.antNoderiRack = antNoderiRack;
		}

		public void settInn(Node node){
				  rack.add(node);
	  }

		public int getAntNoder(){
					return rack.size();
		}

		public int antProsessorer(){
				int totPros = 0;
				for (int i = 0; i < getAntNoder(); i++){
						Node noder = rack.get(i);
						totPros += noder.antProsessorer();
				}
				return totPros;
		}

		public int noderMedNokMinne(int paakrevdMinne){
			int totnoder = 0;
			for (int i = 0; i < getAntNoder(); i++){
					Node noder = rack.get(i);

					if (noder.nokMinne(paakrevdMinne)){
							totnoder += 1;
			  	}
			}
			return totnoder;
		}
}

class Node{
	private int minne;
	private int antPros;

	public Node(int minne, int antPros){
			this.minne = minne;
			this.antPros = antPros;
	}

	public int antProsessorer(){
			return antPros;
	}

	public boolean nokMinne(int paakrevdMinne){
			boolean svar = false;
			if (paakrevdMinne >= minne){
					svar = true;
			}
			return svar;
	}
}
}
