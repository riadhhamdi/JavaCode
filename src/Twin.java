import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Twin {

	public static boolean isTwin(String a, String b) {
		if (a.length() != b.length())
			return false;
		a = a.toLowerCase();
		b = b.toLowerCase();
		Map<Character, Integer> mapA = new HashMap<Character, Integer>();
		Map<Character, Integer> mapB = new HashMap<Character, Integer>();
		Character aCharacter, bCharacter;
		for (int i = 0; i < a.length(); i++) {
			aCharacter = a.charAt(i);
			bCharacter = b.charAt(i);
			if (mapA.get(aCharacter) == null) {
				mapA.put(aCharacter, 1);
			} else {
				mapA.put(aCharacter, mapA.get(aCharacter) + 1);
			}
			if (mapB.get(bCharacter) == null) {
				mapB.put(bCharacter, 1);
			} else {
				mapB.put(bCharacter, mapB.get(bCharacter) + 1);
			}
		}
		Boolean twins = true;
		if (mapA.size() != mapB.size())
			twins = false;
		else {
			Iterator itA = mapA.entrySet().iterator();

			while (twins && itA.hasNext()) {
				Map.Entry pair = (Map.Entry) itA.next();
				if (pair.getValue() != mapB.get(pair.getKey())) {
					twins = false;
				}
			}
		}

		return twins;
	}
	public static void main(String[] args) {
		String a = "Mariom";
		String b = "ROMAIn";
		System.out.println(isTwin(a, b));

	}

}
