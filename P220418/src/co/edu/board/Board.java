package co.edu.board;

public class Board {
	private int bNo;
	private String bTitle;
	private String bText;
	private String bWriter;
	private String bDay;

	public Board(int bNo, String bTitle, String bText, String bWriter, String bDay) {
		super();
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bText = bText;
		this.bWriter = bWriter;
		this.bDay = bDay;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbText() {
		return bText;
	}

	public void setbText(String bText) {
		this.bText = bText;
	}

	public String getbWriter() {
		return bWriter;
	}

	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}

	public String getbDay() {
		return bDay;
	}

	public void setbDay(String bDay) {
		this.bDay = bDay;
	}

	@Override
	public String toString() {
		return "[게시글 번호 = " + bNo + ", 제목 = " + bTitle + ", 작성자 = " + bWriter + ", 작성일자 = "
				+ bDay + "]";
	}
	
	public String toString2() {
		return "------------------\n" + "[내용] " + bText;
		
	}
}
