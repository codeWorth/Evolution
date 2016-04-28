package Evolution;
import java.util.ArrayList;

public class Species {
	private ArrayList<Chromosome<?>> chromes = new ArrayList<Chromosome<?>>();
	private int pop = 1;

	private Chromosome<?> currentWanted;
	
	public Species (Chromosome<?> _initial, int _pop){
		pop = _pop;
		fillChromes(_initial);
	}

	private void fillChromes(Chromosome<?> example){
		int needFill = pop - chromes.size();
		
		for (int i = 0; i < needFill; i++){
			chromes.add(example.clone());
		}
	}

	private void mutateAll(){
		for (Chromosome<?> thisChrome : chromes){
			thisChrome.mutate();
		}
	}

	private Chromosome<?> topChrome(){
		if (chromes.size() == 0){
			throw new IndexOutOfBoundsException();
		}
		
		Chromosome<?> wanted = chromes.get(0);
		double minFit = wanted.getFitness();

		for (Chromosome<?> thisChrome : chromes){
			double thisFit = thisChrome.getFitness();
			if (thisFit < minFit){
				minFit = thisFit;
				wanted = thisChrome;
			}
		}
		
		currentWanted = wanted;

		return wanted;
	}

	public void evolveSpecies(){
		Chromosome<?> topChrome = topChrome();

		chromes.clear();
		fillChromes(topChrome);
		mutateAll();
	}
	
	public void print(){
		System.out.println(currentWanted.print());
	}
}