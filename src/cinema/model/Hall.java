package cinema.model;

import java.util.ArrayList;

public class Hall {

	private int id;
	private int rows, cols;
	private String name;

	public Hall(int rows, int cols, String name) {
		super();
		this.rows = rows;
		this.cols = cols;
		this.name = name;
	}

	public Hall(int id, int rows, int cols, String name) {
		super();
		this.id = id;
		this.rows = rows;
		this.cols = cols;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hall [rows=" + rows + ", cols=" + cols + ", name=" + name + "]";
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	public String getName() {
		return name;
	}

	public boolean[][] getEmptySeats(ArrayList<Hall> hallseats) {
		return null;

	}

	public Hall findHall(ArrayList<Hall> hallList, String hallName) {

		for (int i = 0; i < hallList.size(); i++) {
			if (hallList.get(i).name.equals(hallName))
				return hallList.get(i);
		
	}
		return null;

}
}
