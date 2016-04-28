package Evolution;

import java.util.ArrayList;

public class Population {
	private ArrayList<Species> species = new ArrayList<Species>();
	
	public Population (int numSpecies, int popEach, Chromosome<?> type){
		for (int i  = 0; i < numSpecies; i++){
			species.add(new Species(type.random(), popEach));
		}
	}
	
	public void newGen(){
		for (Species aSpecies : species){
			aSpecies.evolveSpecies();
		}
	}
	
	public void print(){
		int size = species.size();
		Species aSpecies;
		
		for (int i = 0; i < size; i++){
			aSpecies = species.get(i);
			System.out.print("Species number " + i + ": ");
			aSpecies.print();
		}
	}
}
