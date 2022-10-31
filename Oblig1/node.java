class Node{
			private int minne;
			private int antPros;

			public Node(int minne, int antPros){
					this.minne = minne;
					this.antPros = antPros;
			}

			public int antProsess(){
					return antPros;
			}

			public boolean nokMinne(int paakrevdMinne){
					boolean svar = false;
					if (paakrevdMinne <= minne){
							svar = true;
					}
					return svar;
			}
}
