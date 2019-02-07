package model;

public class SeedPopulation {
	private int numberOfSeedPerRow;
	private double populationPerAcre;
	private final int NUMBER_OF_ROW_PER_ACRE = 2178;
	
	public SeedPopulation(int numberOfSeedPerRow) {
		super();
		this.numberOfSeedPerRow = numberOfSeedPerRow;
		this.populationPerAcre = (double)numberOfSeedPerRow*NUMBER_OF_ROW_PER_ACRE;
	}
	
	public SeedPopulation() {
		
	}

	public int getNumberOfSeedPerRow() {
		return numberOfSeedPerRow;
	}

	public void setNumberOfSeedPerRow(int numberOfSeedPerRow) {
		this.numberOfSeedPerRow = numberOfSeedPerRow;
		this.populationPerAcre = (double)numberOfSeedPerRow*NUMBER_OF_ROW_PER_ACRE;
	}
	
	public double getPopulationPerAcre() {
		return populationPerAcre;
	}
	
	
	
}
