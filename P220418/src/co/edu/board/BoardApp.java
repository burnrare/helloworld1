package co.edu.board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {

	static Scanner scn = new Scanner(System.in);
	static ArrayList<Board> boards = new ArrayList<Board>();

	interface BoardService {
		public int ADD = 1;
		public int MOD = 2;
		public int DEL = 3;
		public int NUM_SEARCH = 4;
		public int SEARCH = 5;
		public int DOWN = 6;

		void insert();

		void modify();

		void delete();

		void numlist();

		void list();

	}

	static class BoardAppPlay implements BoardService {

		@Override
		public void insert() {

			System.out.print("게시글 번호 > ");
			int no = scn.nextInt();
			System.out.print("제목 > ");
			String title = scn.next();
			System.out.print("내용 > ");
			String text = scn.next();
			System.out.print("작성자 > ");
			String writer = scn.next();
			System.out.print("작성 일시 > ");
			String day = scn.next();

			Board board = new Board(no, title, text, writer, day);

			boards.add(board);
			// if boards == null 은 사용하지 말자 그리고 board.size() for문은 이미 없는 배열에 넣지 않아도 된다
		}

		@Override
		public void modify() {

			if (boards != null) {
				System.out.println("수정할 게시글의 번호를 입력하세요.");
				int no = scn.nextInt();
				System.out.print("수정 제목 > ");
				String title = scn.next();
				System.out.print("수정 내용 > ");
				String text = scn.next();

				for (int i = 0; i < boards.size(); i++) {
					Board findBoard = (Board) boards.get(i);
					if (findBoard.getbNo() == no) {
						findBoard.setbTitle(title);
						findBoard.setbText(text);
						break;
					}
				}
			} else {
				System.out.println("작성된 글이 없습니다.");
			}

		}

		@Override
		public void delete() {

			if (boards != null) {
				System.out.println("삭제할 게시글의 번호를 입력하세요.");
				int no = scn.nextInt();

				for (int i = 0; i < boards.size(); i++) {
					Board deleteBoard = (Board) boards.get(i);
					if (deleteBoard.getbNo() == no) {
						boards.remove(i);
					}
				}
			} else {
				System.out.println("작성된 글이 없습니다.");
			}

		}

		@Override
		public void numlist() {

			System.out.println("조회할 게시글의 번호를 입력하세요.");
			int no = scn.nextInt();

			for (int i = 0; i < boards.size(); i++) {
				Board findBoard = (Board) boards.get(i);
				if (findBoard.getbNo() == no && findBoard != null) {
					System.out.println(findBoard.toString());
				}
			}

			if (boards != null) {
				System.out.println("상세히 보고 싶은 게시글을 선택해 주세요.");
				no = scn.nextInt();
				for (int i = 0; i < boards.size(); i++) {
					Board detailBoard = (Board) boards.get(i);
					if (detailBoard.getbNo() == no && detailBoard != null) {
						System.out.println(detailBoard.toString2());
					}
				}
			}
		}

		@Override
		public void list() {
			
			if (boards != null) {
				for (Board board : boards) {
					if (board != null) {
						System.out.println(board.toString());
					}
				}
			} else {
				System.out.println("작성된 글이 없습니다.");
			}
			
			if (boards != null) {
				System.out.println("상세히 보고 싶은 게시글을 선택해 주세요.");
				int no = scn.nextInt();
				for (int i = 0; i < boards.size(); i++) {
					Board detailBoard = (Board) boards.get(i);
					if (detailBoard.getbNo() == no && detailBoard != null) {
						System.out.println(detailBoard.toString2());
					}
				}
			}

		}

	}

}
