package tw.demospringproject.action;

import java.util.ArrayList;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import tw.demospringproject.model.Fish;

public class DemoSpelAction {

	public static void main(String[] args) {

		SpelExpressionParser parser = new SpelExpressionParser();
		Expression express1 = parser.parseExpression("'hola,'+'Amigo !!'");
		String result1 = express1.getValue(String.class);
		System.out.println("result1:" + result1);

		Expression express2 = parser.parseExpression("2*3+1");
		Integer result2 = express2.getValue(Integer.class);
		System.out.println("result2:" + result2);

		StandardEvaluationContext ectx = new StandardEvaluationContext();

		Fish fish1 = new Fish(101, "swordfish", "large");
		Fish fish2 = new Fish(102, "goldfish", "small");

		ArrayList<Fish> fishes = new ArrayList<Fish>();
		fishes.add(fish1);
		fishes.add(fish2);

		ectx.setVariable("fish", fishes);

		Integer id = parser.parseExpression("#fish[0].id").getValue(ectx, Integer.class);
		String name = parser.parseExpression("#fish[0].name").getValue(ectx, String.class);
		String size = parser.parseExpression("#fish[0].size").getValue(ectx, String.class);

		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("size:" + size);
	}

}
