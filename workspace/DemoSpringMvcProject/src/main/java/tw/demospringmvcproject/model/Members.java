package tw.demospringmvcproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Members {

	private String memberName;
	private String gender;
	private int age;

}
