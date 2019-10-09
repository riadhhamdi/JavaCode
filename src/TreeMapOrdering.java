import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapOrdering {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> t = new TreeMap<Integer, Integer>();
		t.put(3, 3);
		t.put(2, 1);
		t.put(1, 2);
		for (Entry<Integer, Integer> entry : t.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}

}
