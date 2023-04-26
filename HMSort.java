package Assignment7;
import java.lang.*;
import java.util.*;
public class HMSort {
		public static HashMap<String, Integer>
		sortByValue(HashMap<String, Integer> hm)
		{
			List<Map.Entry<String, Integer> > list
				= new LinkedList<Map.Entry<String, Integer> >(
					hm.entrySet());
			// using Comparator
			Collections.sort(
				list,
				new Comparator<Map.Entry<String, Integer> >() {
					public int compare(
						Map.Entry<String, Integer> object1,
						Map.Entry<String, Integer> object2)
					{
						return (object1.getValue())
							.compareTo(object2.getValue());
					}
				});
			HashMap<String, Integer> result
				= new LinkedHashMap<String, Integer>();
			for (Map.Entry<String, Integer> me : list) {
				result.put(me.getKey(), me.getValue());
			}
			return result;
		}
		public static void main(String[] args)
		{
			HashMap<String, Integer> hashmap
				= new HashMap<String, Integer>();
			hashmap.put("lime", 5);
			hashmap.put("seven", 7);
			hashmap.put("two", 2);
			hashmap.put("zero", 0);
			Map<String, Integer> map = sortByValue(hashmap);
			for (Map.Entry<String, Integer> entry :
				map.entrySet()) {
				System.out.println("Key : " + entry.getKey()
								+ ", Value : "
								+ entry.getValue());
			}
		}
	}


