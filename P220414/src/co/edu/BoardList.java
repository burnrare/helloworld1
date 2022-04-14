package co.edu;

public class BoardList {

	private Board[] boards;

	public void init(int size) {
		boards = new Board[size];
	}

	// 게시글 작성 배열에 한 건 입력
	public int addBoard(Board board) { // 매개 변수는 클래스도 받아올 수 있다
		// 더 이상 저장 공간이 없을 때
//		boolean check = false;
		int errorCase = -1; // 저장 공간 없음
		for (int i = 0; i < boards.length; i++) {
			if(boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
				errorCase = 1; // 동일한 값이 있을 경우의 에러
				break;
			}
			if (boards[i] == null) {
				boards[i] = board;
				errorCase = 0;
				break;
			} 
		}
		return errorCase;
	}

	// 수정 게시글 번호로 한 건을 찾아와서 내용과 제목 변경 가능
	public boolean modify(Board board) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContant(board.getContant());
				boards[i].setTitle(board.getTitle());
				check = true;
				break;
			}
		}
		return check;
	}

	public boolean delete(int bNo) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if(boards[i].getBoardNo() == bNo) {
				boards[i] = null;
				check = true;
				break;
			}
		}
		return check;
	}
	
	public Board search(int bNo) {
		for (int i = 0; i < boards.length; i++) {
			if(boards[i].getBoardNo() == bNo) {
				int currentCnt = boards[i].getSearchCnt();
				boards[i].setSearchCnt(currentCnt + 1);
				return boards[i];
			}
		}
		return null;
	}
	

	// 게시글 목록
	public Board[] boardList() {
		return boards;
	}

}
