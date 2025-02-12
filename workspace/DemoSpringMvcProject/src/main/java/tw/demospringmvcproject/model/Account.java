package tw.demospringmvcproject.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")
@Component
@Data
@NoArgsConstructor //不帶參數建構子
@AllArgsConstructor //所以參數建構子
//若只要兩個要另外創建構子
public class Account {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "USERPWD")
	private String userpwd;

//	public Account() {
//	}
//
	public Account(String username, String userpwd) {

		this.username = username;
		this.userpwd = userpwd;
	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getUserpwd() {
//		return userpwd;
//	}
//
//	public void setUserpwd(String userpwd) {
//		this.userpwd = userpwd;
//	}

}
