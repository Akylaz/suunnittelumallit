package teht09Strategy;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l");

		Converter converter = new Converter(new JokainenAlkio());
		converter.convert(list);

		converter.setStrategy(new JokaToinenAlkio());
		converter.convert(list);

		converter.setStrategy(new JokaKolmasAlkio());
		converter.convert(list);


	}

}
