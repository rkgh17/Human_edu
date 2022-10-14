package exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("황지훈", 27);
		map.put("황인성", 63);
		map.put("김경옥", 59);
		map.put("김경옥", 17);
		
		System.out.println("map.size() : "+map.size());
		System.out.println("황지훈의 나이 : "+map.get("황지훈"));
		System.out.println(map);
		
		// Key와 Value를 전체적으로 정리하여 검색하는 방법
		// Key는 중복되지 않으므로 set의 형태로 추출 가능.
		
		Set<String> keyset = map.keySet(); // key값을 Set으로 설정
		System.out.println("KeySet : "+keyset);
		Iterator<String> iter = keyset.iterator();
		
		// 검색의 첫번째 방법
		while(iter.hasNext()) {
			String k = iter.next();
			Integer v = map.get(k);
			System.out.println(k + " - " + v);
		}
		
		// map 삭제 기능
		map.remove("황지훈");
		System.out.println("map.size() : "+map.size());
		
		map.put("황지훈", 27);
		
		// 검색의 두번째 방법
		Set <Map.Entry<String, Integer>> mEntry = map.entrySet();
		Iterator<Map.Entry<String, Integer>> mEntryIter = mEntry.iterator();
		System.out.println("Map.Entry() : "+ mEntry);
		
		while(mEntryIter.hasNext()) {
			Map.Entry<String, Integer> nextEntry = mEntryIter.next();
			// nextEntry = [김경옥 =59]
			String k = nextEntry.getKey(); // map.entry 상의 key를 추출
			Integer v = nextEntry.getValue();
			System.out.println(k + " - " + v);
		}
		
		// map 전체 삭제
		map.clear();
		System.out.println(map);

	}

}
