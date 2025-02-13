package tw.demospringmvcproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "picture")
@Data
public class Picture {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "FILENAME")
	private String filename;

	@Column(name = "PICTURE")
	private byte[] picture;

	public Picture(String filename, byte[] picture) {
		super();
		this.filename = filename;
		this.picture = picture;
	}

}
