package P2_클래스심화_level3_2_영화예매;

public class SeatDAO {
	Seat[] seatList = new Seat[8];
	void init() {
		for(int i = 0; i < seatList.length; i++) {
			seatList[i] = new Seat();
			seatList[i].number = i + 1;
			seatList[i].userID = "";
			seatList[i].check = false;
		}
	}
	
	void printSeat() {
		for (int i = 0; i < seatList.length; i++) {
			System.out.print("[" + seatList[i].number + "]");
		}
		System.out.println();

		for (int i = 0; i < seatList.length; i++) {
			if (seatList[i].check == false) {
				System.out.print("[x]");
			} else {
				System.out.print("[o]");
			}
		}
		System.out.println();
	}
	
	int getMaxSize() {
		return seatList.length;
	}
	
	boolean checkTicketing(int index) {
		return seatList[index].check;
	}
	
	void setTicketing(int index  , String id , boolean check) {
		seatList[index].userID = id;
		seatList[index].check =check;
	}
	
}
