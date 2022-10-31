import java.util.ArrayList;

class Rack{

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

		public int antPros(){
				int totPros = 0;
				for (int i = 0; i < getAntNoder(); i++){
						Node noder = rack.get(i);
						totPros += noder.antProsess();
				}
				return totPros;
		}

		public int medNokMinne(int paakrevdMinne){
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
