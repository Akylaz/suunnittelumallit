package teht09Strategy;

import java.util.List;

public class Converter {
	private ListConverter converter;

	public Converter(ListConverter converter) {
		this.converter = converter;
	}

	public void setStrategy(ListConverter converter) {
		this.converter = converter;
	}

	public void convert(List<String> list) {
		String result = converter.listToString(list);
		System.out.println(result);
	}

}
