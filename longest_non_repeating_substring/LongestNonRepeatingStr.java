import java.util.HashMap;

public class LongestNonRepeatingStr {
	
	public String findLNRS(String str) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		int max=0;
		int startIdx = 0;
		int endIdx = -1;
		boolean mapClearedAtleastOnce = false;
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), i);
				
			}else{
				if(max < map.size()) {
					max = map.size();
					if(mapClearedAtleastOnce)
						startIdx = map.get(str.charAt(i));
					endIdx = i-1;
				}
				i = map.get(str.charAt(i));
				map.clear();
				mapClearedAtleastOnce = true;
			}
		}
		return str.substring(startIdx, endIdx+1);
	}
	public static void main(String[] args) {
		String str = "ABDEFGABEF";
		System.out.println(new LongestNonRepeatingStr().findLNRS(str));
	}
}
