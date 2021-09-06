package market;


import java.util.ArrayList;

public class BoardDAO {
	private BoardDAO() {}
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() {return instance;}
	
	
	private ArrayList<BoardDTO> boardList;
	private int boardNumber;	
	public void init() {
		boardNumber = 0;
		boardList = new ArrayList<BoardDTO>();
	}
		
	public int getNextNumber() {
		return ++boardNumber;
	}
	public int getAllCount() {
		
		
		return boardList.size();
	}
	public ArrayList<BoardDTO>getAllBoardListReverse(){
		ArrayList<BoardDTO>sampleList = new ArrayList<BoardDTO>();
		int lastIndex = boardList.size() - 1 ;
		for(int i = 0; i <boardList.size(); i++ ) {
			sampleList.add(boardList.get(lastIndex));
			lastIndex -= 1;
		}
			
		return sampleList;
	}
	
	public ArrayList<BoardDTO>getAllBoardList(int start, int end){
		ArrayList<BoardDTO> reverseList = getAllBoardListReverse();
		ArrayList<BoardDTO> sampleList =new ArrayList<BoardDTO>();
		System.out.println(start + " " + end);
		for(int i = start; i < end; i++) {
			sampleList.add(reverseList.get(i));
		}
		return sampleList;
	}
	
	public BoardDTO getOneBoard(int num) {
		BoardDTO board = null;
		for(int i = 0; i <boardList.size(); i++ ) {
			if(boardList.get(i).getNum() == num) {
				boardList.get(i).setReadcount(boardList.get(i).getReadcount() + 1);	
				board = boardList.get(i);
				break;
			}
		}
		return board;
	}
	public void insertBoard(BoardDTO dto) {
		dto.setNum(getNextNumber());
		boardList.add(dto);
	}
	
}
