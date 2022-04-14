package co.edu;

import java.util.Scanner;

public class BoardExe {

	public static void main(String[] args) {

		BoardList boardList = new BoardList();
		boardList.init(3);

		while (true) {
			System.out.println(
					"\n------------------------------------------------------------------------------------------");
			System.out.println("1. 게시글 작성 | 2. 게시글 수정 | 3. 게시글 목록 | 4. 게시글 삭제 | 5. 게시글 조회 | 6. 작성자 조회 | 9. 종료");
			System.out.println(
					"------------------------------------------------------------------------------------------\n");

			Scanner scn = new Scanner(System.in);
			System.out.println("선택 >> ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {

				System.out.println("글 번호를 입력해 주세요.");
				int bNo = scn.nextInt();
				System.out.println("제목을 입력해 주세요.");
				String bTitle = scn.next();
				System.out.println("내용을 입력해 주세요.");
				String bContent = scn.next();
				System.out.println("작성자를 입력해 주세요.");
				String bWriter = scn.next();

				Board newBod = new Board(bNo, bTitle, bContent, bWriter);
				boardList.addBoard(newBod);

				int chk = boardList.addBoard(newBod);
				if (chk == 0) {
					System.out.println("정상 입력");
				} else if (chk == -1) {
					System.out.println("저장 공간이 없습니다.");
				}

			} else if (menu == 2) {
				System.out.println("수정할 글 번호 입력 >> ");
				int bNo = Integer.parseInt(scn.nextLine());
				System.out.println("변경할 제목 입력 >> ");
				String title = scn.nextLine();
				System.out.println("변경할 내용 입력 >>");
				String content = scn.nextLine();

				Board cBoard = new Board(bNo, title, content, null);
				boardList.modify(cBoard);

				if (boardList.modify(cBoard)) {
					System.out.println("수정 완료");
				} else {
					System.out.println("수정 실패");
				}

			} else if (menu == 3) {
				Board[] boards = boardList.boardList();
				System.out.println(" 번호 | 제목        | 내용        | 작성자 | 조회수");
				System.out.println("============================================");
				for (Board board : boards) {
					if (board != null) {
						board.getInfo();
					}
				}
			} else if (menu == 4) {

				System.out.println("삭제할 글 번호를 입력해 주세요.");
				int bNo = Integer.parseInt(scn.nextLine());
				boardList.delete(bNo);

			} else if (menu == 5) {
				System.out.println("조회할 글 번호를 입력해 주세요.");
				int bNo = Integer.parseInt(scn.nextLine());

				Board getBoard = boardList.search(bNo);
				if (getBoard == null) {
					System.out.println("조회 결과가 없습니다.");
				} else {
					getBoard.getDetail();
				}

			} else if (menu == 6) {
				System.out.println("작성자를 입력해 주세요.");
				String bWriter = scn.nextLine();

				Board[] multiBoard = boardList.multiSearch(bWriter);		
				for (Board board : multiBoard) {
					if (board.getWriter().equals(bWriter)) {
						board.getInfo();
					}
				}

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해 주세요.");
				continue;
			}

		}

		System.out.println("end of prog");

	}

}
