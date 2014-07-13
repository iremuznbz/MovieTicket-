package cinema.model;

import java.util.ArrayList;

public class Hall {

	private int id;
	private int rows, cols;
	private String name;
	private Hour session;
	private int array[][];

	public Hall(int rows, int cols, String name) {
		super();
		this.rows = rows;
		this.cols = cols;
		this.name = name;
		array = new int[rows][cols];
	}

	public Hall(int id, int rows, int cols, String name) {
		super();
		this.id = id;
		this.rows = rows;
		this.cols = cols;
		this.name = name;
	}

	public int[][] getArray() {
		return array;
	}

	@Override
	public String toString() {
		return "----Hall---- \nrows=" + rows + "\ncols=" + cols + "\nname="
				+ name + "\n------------";
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

	public void reserveChair(int row, int coloumn) {
		this.array[row - 1][coloumn - 1] = 1;
	}

	public static Hall findHall(ArrayList<Hall> hallList, String hallName) {

		for (int i = 0; i < hallList.size(); i++) {
			if (hallList.get(i).name.equals(hallName))
				return hallList.get(i);

		}
		return null;

	}
}
