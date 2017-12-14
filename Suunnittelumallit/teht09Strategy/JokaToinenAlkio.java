package teht09Strategy;

import java.util.List;

public class JokaToinenAlkio implements ListConverter {

	@Override
	public String listToString(List list) {
		String result = "";
		for(int i=1;i<=list.size();i++) {
			result += list.get(i-1);
			if(i % 2 == 0) {
				result += "\n";
			}
		}
		return result;
	}

}
