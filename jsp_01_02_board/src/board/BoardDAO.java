package board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class BoardDAO {
	private BoardDAO() {
	}

	private static BoardDAO instance = new BoardDAO();

	public static BoardDAO getInstance() {
		return instance;
	}

	private int boardNumber; // 게시글 고유 번호
	private int boardRef;
	private ArrayList<Board> boardList;

	public void init() {
		boardList = new ArrayList<Board>();
		boardNumber = 1000;
		boardRef = 0;
	}

	public int getNextNumber() {
		boardNumber += 1;
		return boardNumber;
	}

	public int getNextRef() {
		boardRef += 1;
		return boardRef;
	}

	public Board getBoard(int num) {
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getNum() == num) {
				return boardList.get(i);
			}
		}
		return null;
	}

	public void insertBoard(Board board) {
		boardList.add(board);
	}

	public void insertReWriteBoard(Board board) {
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getRef() == board.getRef()) {
				if (boardList.get(i).getReLevel() >= board.getReLevel()) {
					boardList.get(i).setReLevel(boardList.get(i).getReLevel() + 1);
				}
			}
		}

		boardList.add(board);
	}

	public void setSampleDummy(int count) {
		for (int i = 0; i < count; i++) {
			Board board = new Board();
			int num = getNextNumber();
			board.setNum(num);
			board.setWriter("[작가]" + num);
			board.setTitle("[제목]" + num);
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String regDate = sdf.format(date);
			board.setRegDate(regDate);
			board.setReadCount(0);
			board.setRef(getNextRef());
			board.setReStep(1);
			board.setReLevel(1);
			board.setContent("[내용]" + num);
			insertBoard(board);
		}
	}

	public ArrayList<Board> getBoardList() {
		return boardList;
	}

	public ArrayList<Board> getBoardListReverse() {
		ArrayList<Board> sampleList = new ArrayList<Board>();
		for (int i = 0; i < boardList.size(); i++) {
			sampleList.add(boardList.get(i));
		}
		Collections.reverse(sampleList);
		return sampleList;
	}

	public ArrayList<Board> getBoardListLimit(int start, int last) {

		ArrayList<Board> list = getBoardListReverse();

		ArrayList<Board> sampleList = new ArrayList<Board>();

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getRef() > list.get(j).getRef()) {
					Board temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getRef() == list.get(j).getRef()) {
					if (list.get(i).getReLevel() < list.get(j).getReLevel()) {
						Board temp = list.get(i);
						list.set(i, list.get(j));
						list.set(j, temp);
					}
				}
			}
		}

		for (int i = start; i < last; i++) {
			sampleList.add(list.get(i));
		}

		return sampleList;
	}

	public void clearAll() {
		boardList.clear();
	}

	public int getSize() {
		return boardList.size();
	}

	public void printBoardList() {
		System.out.println("----------------------------------------------");
		for (int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
		System.out.println("----------------------------------------------");
	}

	public int getBoardIndex(int num) {
		int index = 0;
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getNum() == num) {
				index = i;
				break;
			}
		}

		return index;
	}

	public Board getBoardOfInfo(int num) {

		int index = getBoardIndex(num);

		Board board = boardList.get(index);
		// 게시글을 선택했기 때문에 조회수를 1증가 시킨다.
		board.setReadCount(board.getReadCount() + 1);

		return board;
	}

	public Board getBoardOfUpdate(int num) {

		int index = getBoardIndex(num);

		return boardList.get(index);
	}

	public void boardUpdate(Board board) {
		System.out.println("board.getNum():"+board.getNum());
		int index = getBoardIndex(board.getNum());

		boardList.get(index).setTitle(board.getTitle());
		boardList.get(index).setContent(board.getContent());

	}

	public void boardDelete(int num) {

		int index = getBoardIndex(num);
		boardList.remove(index);

	}
	public void boardRemoveCheck(int num) {
		int index = getBoardIndex(num);
		boardList.get(index).setRemoveCheck(true);
	}
	
	
}
