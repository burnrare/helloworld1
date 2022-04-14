package co.edu;

public class Board {
	// 게시글 번호, 제목, 내용, 작성자
	
	private int boardNo;
	private String title;
	private String contant;
	private String writer;
	private int searchCnt = 0;
	
	public Board(int boardNo, String title, String contant, String writer) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.contant = contant;
		this.writer = writer;
		
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContant() {
		return contant;
	}
	public void setContant(String contant) {
		this.contant = contant;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getSearchCnt() {
		return searchCnt;
	}
	public void setSearchCnt(int searchCnt) {
		this.searchCnt = searchCnt;
	}
	public void getInfo() {
		//게시글 번호 제목 내용 작성자 조회수
		System.out.printf("%4d | %-8s | %-9s | %-3s | %2d\n", //
				this.boardNo, this.title, this.contant, //
				this.writer, this.searchCnt);
		
	}
	public void getDetail() {
		// 게시글 번호          작성자
		// 제목               조회수
		// 내용
		
		String info = "==================================\n"
				+ "게시글 번호 : %2s               작성자 : %-5s\n"
				+ "제목 : %-10s                  조회수 : %2d\n"
				+ "내용 : %-20s\n"
				+ "==================================\n";
		
		System.out.printf(info, this.boardNo, this.writer, this.title, this.searchCnt, this.contant //
				);
	}

	
}
