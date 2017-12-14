package teht09Strategy;

import java.util.List;

public class JokainenAlkio implements ListConverter {

	@Override
	public String listToString(List list) {
		String result = "";
		for(int i=0;i<list.size();i++) {
			result += list.get(i) + "\n";
		}
		return result;
	}

}
