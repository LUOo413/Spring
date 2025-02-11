package tw.demospringmvcproject.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
//@AllArgsConstructor
@Data
//@NoArgsConstructor
public class Person {

	@Value("${name}")
	private String name;

	@Value("${age}")
	private int age;

}
