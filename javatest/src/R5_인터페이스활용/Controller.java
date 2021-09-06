package R5_인터페이스활용;

import java.util.HashMap;
import java.util.Map;

public class Controller {
	
	private Controller () {}
	
	public static Controller getInstance() {
		return instance;
	}
	private static Controller instance= new Controller();
	
	private Map <String , Action> mapList = new HashMap<>();
	
	public void init() {		
		mapList.put("insert", new ActionInsert());
		mapList.put("delete", new ActionDelete());
	}
	
	public Action getAction(String key) {
		return mapList.get(key);
	}
	
}
