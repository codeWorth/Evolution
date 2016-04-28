package Evolution;
public class Main {
	public static void main(String[] args) {		
		Population pop = new Population(10, 10, new TestChromosome());
		
		for (int i = 0; i < 50; i++){
			System.out.println("----------"+i+"-----------");
			pop.newGen();
			pop.print();
		}
	}
}