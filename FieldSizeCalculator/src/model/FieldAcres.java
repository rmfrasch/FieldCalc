package model;

public class FieldAcres {
	private int length;
	private int width;
	private int squareFeet;
	private double acres;
	private final int SQUARE_FEET_PER_ACRE = 43560;
	
	public FieldAcres(int length, int width) {
		super();
		this.length = length;
		this.width = width;
		this.squareFeet = length * width;
		this.acres = (double)squareFeet/SQUARE_FEET_PER_ACRE;
	}
	public FieldAcres() {
		
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getSquareFeet() {
		return squareFeet;
	}
	
	public double getAcres() {
		return acres;
	}
	
	public int getSQAURE_FEET_PER_ACRE() {
		return SQUARE_FEET_PER_ACRE;
	}
	@Override
	public String toString() {
		return "FieldAcres [length=" + getLength() + ", width=" + getWidth() + ", squareFeet=" + getSquareFeet() + ", acres=" + getAcres();
	}
	
	
}
