package market;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ItemDAO {
	private ItemDAO() {
	}

	private static ItemDAO instance = new ItemDAO();

	public static ItemDAO getInstance() {
		return instance;
	}

	private ArrayList<ItemDTO> itemList;
	int itemNumber;
	
	public void init() {
		itemList = new ArrayList<ItemDTO>();
		itemNumber = 0;
	}

	public ArrayList<ItemDTO> getAllItem() {
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		for (int i = 0; i < itemList.size(); i++) {
			list.add(itemList.get(i));
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getItem_number() > list.get(j).getItem_number()) {
					ItemDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}

		return list;
	}

	public ArrayList<ItemDTO> getOneCategory(String category) {
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getItem_category().equals(category)) {
				list.add(itemList.get(i));
			}

		}
		return list;
	}

	public ItemDTO getOneItem(int item_number) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getItem_number() == item_number) {
				return itemList.get(i);
			}

		}
		return null;
	}

	public void updateSold(String item_name, int buy_count) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getItem_name().equals(item_name)) {
				int sold = itemList.get(i).getSold();
				itemList.get(i).setSold(sold + 1);
				break;
			}

		}
	}

	public void itemUpdate(ItemDTO dto, int item_number) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getItem_number() == item_number) {
				itemList.set(i, dto);
				break;
			}

		}
	}

	public ArrayList<ItemDTO> getNewItem() {
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		for (int i = 0; i < itemList.size(); i++) {
			list.add(itemList.get(i));
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getReg_date().compareTo(list.get(j).getReg_date()) > 0) {
					ItemDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		ArrayList<ItemDTO> list2 = new ArrayList<ItemDTO>();
		for (int i = 0; i < 3; i++) {
			list2.add(itemList.get(i));
		}

		return list2;
	}

	public ArrayList<ItemDTO> getBestItem() {
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		for (int i = 0; i < itemList.size(); i++) {
			list.add(itemList.get(i));
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getSold() > list.get(j).getSold()) {
					ItemDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		ArrayList<ItemDTO> list2 = new ArrayList<ItemDTO>();
		for (int i = 0; i < 3; i++) {
			list2.add(itemList.get(i));
		}
		return list2;
	}

	public void deleteItem(int item_number) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getItem_number() == item_number) {
				itemList.remove(i);
				return;
			}
		}
	}

	public ArrayList<ItemDTO> getDiscountedItem() {
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getDiscount_rate() >= 20) {
				list.add(itemList.get(i));
			}
		}
		return list;
	}

	public void insertNewItem(ItemDTO dto) {
		dto.setItem_number(getNextNumber());
		itemList.add(dto);
	}
	
	public  int getNextNumber() {
		return  ++itemNumber;
	}
	
	public void insertSampleList() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss");
		String regDate = sdf.format(date);
		itemList.add(new ItemDTO(1, "채소", "대파", 1200, 3, "1.jpg", "대파입니다", 0, regDate, 10));
		itemList.add(new ItemDTO(2, "채소", "상추", 2000, 4, "2.jpg", "상추입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(3, "채소", "당근", 2500, 8, "3.jpg", "당근입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(4, "채소", "깻잎", 1200, 0, "4.jpg", "깻잎입니다", 0, regDate, 0));
		itemList.add(new ItemDTO(5, "채소", "애호박", 1000, 5, "5.jpg", "애호박입니다", 0, regDate, 0));
		itemList.add(new ItemDTO(6, "채소", "버섯", 1500, 4, "6.jpg", "버섯입니다", 20, regDate, 0));
		itemList.add(new ItemDTO(7, "채소", "단호박", 3000, 7, "7.jpg", "단호박입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(8, "채소", "파프리카", 3000, 6, "8.jpg", "파프리카입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(9, "채소", "아스파라거스", 3000, 10, "9.jpg", "아스파라거스입니다", 0, regDate, 0));
		itemList.add(new ItemDTO(10, "채소", "양파", 2000, 11, "10.jpg", "양파입니다", 0, regDate, 0));
		itemList.add(new ItemDTO(11, "해산물", "자반고등어", 5000, 20, "11.jpg", "고등어입니다", 0, regDate, 4));
		itemList.add(new ItemDTO(12, "해산물", "연어", 14000, 40, "12.jpg", "노르웨이산 연어입니다", 0, regDate, 0));
		itemList.add(new ItemDTO(13, "해산물", "오징어", 5000, 10, "13.jpg", "오징어입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(14, "해산물", "바지락", 7000, 0, "14.jpg", "바지락입니다", 0, regDate, 0));
		itemList.add(new ItemDTO(15, "해산물", "새우", 10000, 1, "15.jpg", "새우입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(16, "해산물", "전복", 20000, 5, "16.jpg", "전복입니다", 0, regDate, 0));
		itemList.add(new ItemDTO(17, "육류", "막창", 20000, 5, "17.jpg", "막창입니다", 0, regDate, 0));
		itemList.add(new ItemDTO(18, "육류", "안심스테이크", 18000, 0, "18.jpg", "안심스테이크입니다", 0, regDate, 0));
		itemList.add(new ItemDTO(19, "육류", "닭", 12000, 4, "19.jpg", "닭입니다", 20, regDate, 0));
		itemList.add(new ItemDTO(20, "육류", "닭다리", 10000, 7, "20.jpg", "닭다리입니다", 0, regDate, 8));
		itemList.add(new ItemDTO(21, "육류", "폭립", 20000, 10, "21.jpg", "폭립니다", 10, regDate, 0));
		itemList.add(new ItemDTO(22, "육류", "양념갈비", 25000, 20, "22.jpg", "양념갈비입니다", 30, regDate, 0));
		itemList.add(new ItemDTO(23, "육류", "등갈비구이", 20000, 0, "23.jpg", "등갈비구이입니다", 0, regDate, 5));
		itemList.add(new ItemDTO(24, "육류", "치즈돈가스", 13000, 1, "24.jpg", "치즈돈가스입니다", 0, regDate, 50));
		itemList.add(new ItemDTO(25, "육류", "닭가슴살", 5000, 4, "25.jpg", "닭가슴살입니다", 0, regDate, 0));
		itemList.add(new ItemDTO(26, "육류", "차돌박이", 20000, 3, "26.jpg", "차돌박이입니다", 10, regDate, 10));
		itemList.add(new ItemDTO(27, "전자제품", "그라인더", 28000, 3, "27.jpg", "그라인더입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(28, "전자제품", "스팀다리미", 30000, 3, "28.jpg", "스팀다리미입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(29, "전자제품", "헤어드라이기", 25000, 3, "29.jpg", "헤어드라이기입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(30, "전자제품", "체중계", 19000, 3, "30.jpg", "체중계입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(31, "전자제품", "전자체중계", 22000, 3, "31.jpg", "전자체중계입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(32, "전자제품", "미니선풍기", 16000, 0, "32.jpg", "미니선풍기입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(33, "전자제품", "청소기", 40000, 3, "33.jpg", "청소기입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(34, "전자제품", "카메라", 50000, 3, "34.jpg", "카메라입니다", 10, regDate, 0));
		itemList.add(new ItemDTO(35, "전자제품", "믹서기", 3800, 3, "35.jpg", "믹서기입니다", 10, regDate, 7));
		itemNumber = 35;
		
	}

}
