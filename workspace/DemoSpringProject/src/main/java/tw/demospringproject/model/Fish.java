package tw.demospringproject.model;

public class Fish {

	private int id;
	private String name;
	private String size;

	public Fish() {
	}

	public Fish(int id, String name, String size) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
