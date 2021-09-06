package X1_03_베스트앨범;


//https://programmers.co.kr/learn/courses/30/lessons/42579?language=java

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

class Song {
	int num;
	int play;

	Song(int n, int p) {
		num = n;
		play = p;
	}
}

class SongManager {
	Vector<Song> songlist = new Vector<Song>();
	int sum;
}

class Solution {

	public int[] solution(String[] genres, int[] plays) {
		int[] answer = {};

		Map<String, SongManager> map = new HashMap<String, SongManager>();

		for (int i = 0; i < genres.length; i++) {
			SongManager songManager = new SongManager();
			map.put(genres[i], songManager);
		}

		for (int i = 0; i < genres.length; i++) {
			Song song = new Song(i, plays[i]);
			SongManager songManager = map.get(genres[i]);
			songManager.songlist.add(song);
			songManager.sum += song.play;
		}

		// 정렬
		List<Map.Entry<String, SongManager>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, SongManager>>() {
			@Override
			public int compare(Map.Entry<String, SongManager> o1, Map.Entry<String, SongManager> o2) {
				int comparision = (o1.getValue().sum - o2.getValue().sum) * -1;
				return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
			}
		});

		// 순서유지를 위해 LinkedHashMap을 사용
		map = new LinkedHashMap<>();
		for (Iterator<Map.Entry<String, SongManager>> iter = list.iterator(); iter.hasNext();) {
			Map.Entry<String, SongManager> entry = iter.next();
			map.put(entry.getKey(), entry.getValue());
		}
		for (String key : map.keySet()) {
			SongManager songManager = map.get(key);
			Vector<Song> vec = songManager.songlist;
			
			vec.sort(new Comparator<Song>() {
				@Override
				public int compare(Song arg0, Song arg1) {
					// TODO Auto-generated method stub
					int age0 = arg0.play;
					int age1 = arg1.play;
					if (age0 == age1)
						return 0;
					else if (age0 < age1)
						return 1;
					else
						return -1;
				}
			});

		}
		
		Vector<Integer> last = new Vector<Integer>();

		for (String key : map.keySet()) {
		//	System.out.print(key + " ");
			SongManager songManager = map.get(key);
			Vector<Song> vec = songManager.songlist;
		//	System.out.print(songManager.sum + " ");
			int time = 0;
			for (int j = 0; j < vec.size(); j++) {
				Song song = vec.get(j);
				last.add(song.num);
				time += 1;
				if(time == 2) break;
				//System.out.print("[" + song.num + " , " + song.play + "]");
			}
		//	System.out.println();
		}
		
	//	System.out.println(last);
		
		answer =new int[last.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = last.get(i);
		}

		return answer;
	}
}

public class Test01 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String genres[] = { "classic", "pop", "classic", "classic", "pop" };

		int[] plays = { 500, 600, 150, 800, 1 };

		int re[] = sol.solution(genres, plays);
		System.out.println(Arrays.toString(re));
	}
}