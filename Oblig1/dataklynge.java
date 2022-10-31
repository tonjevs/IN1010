import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

class Dataklynge{
		ArrayList<Rack> datasenter = new ArrayList<>();
		public int noderPerRack;

		public Dataklynge(String filnavn){
			File fil = new File(filnavn);
        Scanner in;
        try{
            in = new Scanner(fil);
        }catch(FileNotFoundException exception){
            System.out.println("Fant ikke filen");
            in = new Scanner("");
			}
			String max = in.nextLine(); //gjør slik at denne alltid blir definert utenfor while løkken
			int noderPerRack = Integer.parseInt(max);//gjør den om til en int

			while (in.hasNextLine()){
				int arr[] = new int[100];
				String alleData[] = in.nextLine().split(" ");
				try{
					for (int i = 0; i < alleData.length;i++){
							arr[i] = Integer.parseInt(alleData[i]);
					}
				}catch(NumberFormatException ex){ //catcher eventuelle numberformatexceptions
						System.err.println("Invalid input...");
				}
				Rack rack = new Rack(noderPerRack);
				datasenter.add(rack);

				int antallNoder = arr[0];
				try{
						for (int i = 0; i < antallNoder;i++){
								Node node = new Node(arr[1],arr[2]);
								settInnNode(node,noderPerRack); //går gjennom for hver node og bruker settInnNode metoden
					}
				}catch(NumberFormatException ex){
						System.err.println("Invaild input...");
				}
		}
}
		public void settInnNode(Node node,int noderPerRack){

				Rack ledigRack = null; //gjør at ledigRack i utgansgpunktet er null
				int i = 0;

				while(ledigRack == null && i < antRacks()){
					if (datasenter.get(i).getAntNoder() < noderPerRack){
						ledigRack = datasenter.get(i); //deretter om det indexen er mindre enn antall rack i datasenter
					}// så blir det da den nye ledig rack
					i++;
				}

				if (ledigRack == null){
						Rack nyttRack = new Rack(noderPerRack);//lager en ny rack når de andre er fulle
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
