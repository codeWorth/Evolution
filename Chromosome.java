package Evolution;
import java.util.ArrayList;

public abstract class Chromosome<E extends Gene<?>> {
	protected ArrayList<E> genes = new ArrayList<E>();
	protected double wantedFitness = 1;

	public void mutate(){
		double amount = getFitness();

		for (Gene<?> gene : genes){ 
			gene.mutate(amount); //lower amount should mean less mutation
		}
		
		setVals();
	}
	
	public double getFitness(){
		return Math.abs(getRawFitness() - wantedFitness); //lower the better
	}

	public abstract Chromosome<?> clone();
	protected abstract double getRawFitness(); //higher means is a better chromosome
	public abstract String print();
	protected abstract void setVals();
	public abstract Chromosome<?> random();
}