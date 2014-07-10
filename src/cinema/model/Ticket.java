package cinema.model;

public class Ticket {

	private int id;
	private Hall hall;
	private Hour hour;
	private int row, coloumn;

	public Ticket(Hall hall, Hour hour, int row, int coloumn) {
		super();
		this.hall = hall;
		this.hour = hour;
		this.row = row;
		this.coloumn = coloumn;
	}

	public Ticket(int id, Hall hall, Hour hour, int row, int coloumn) {
		super();
		this.id = id;
		this.hall = hall;
		this.hour = hour;
		this.row = row;
		this.coloumn = coloumn;
	}

	public int getId() {
		return id;
	}

	public Hall getHall() {
		return hall;
	}

	public Hour getHour() {
		return hour;
	}

	public int getRow() {
		return row;
	}

	public int getColoumn() {
		return coloumn;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", hall=" + hall + ", hour=" + hour
				+ ", row=" + row + ", coloumn=" + coloumn + "]";
	}

}
