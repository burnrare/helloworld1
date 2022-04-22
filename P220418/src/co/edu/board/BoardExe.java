package co.edu.board;

import java.util.Scanner;

import co.edu.board.BoardApp.BoardAppPlay;
import co.edu.board.BoardApp.BoardService;

public class BoardExe {
	public static void main(String[] args) {
		BoardAppPlay app = new BoardAppPlay();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("1. 글 등록 | 2. 글 수정 | 3. 글 삭제 | 4. 글 조회(글 번호) | 5. 전체 목록 | 6. 종료");
			int menu = scn.nextInt();

			if (menu == BoardService.ADD) {
				app.insert();
			} else if (menu == BoardService.MOD) {
				app.modify();
			} else if (menu == BoardService.DEL) {
				app.delete();
			} else if (menu == BoardService.NUM_SEARCH) {
				app.numlist();
			} else if (menu == BoardService.SEARCH) {
				app.list();
			} else if (menu == BoardService.DOWN) {
				System.out.println("프로그램이 종료됩니다");
				break;
			}

		}
	}
}
