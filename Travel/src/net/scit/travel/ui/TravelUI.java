package net.scit.travel.ui;

import java.util.Scanner;

public class TravelUI {
	Scanner sc = new Scanner(System.in);


	public TravelUI() {
		
		MainMenu();
	}
	
//	CustomerDAO customerDAO = new CustomerDAO();
//	Goods_ListDAO goods_listDAO = new Goods_ListDAO();
//	BookingDAO bookingDAO = new BookingDAO();
//	ReviewDAO reviewDAO = new ReviewDAO();
	


	public void MainMenu() {
		System.out.println("[===== SCIT 여행사입니다~:) =====]");
		System.out.println("    ==> 1. 로그인");
		System.out.println("    ==> 2. 회원가입");
		System.out.println("    ==> 3. 상품보기");
		System.out.println("    ==> 4. 상품찾기");
		System.out.println();
	}
	
	public void GoodsList() {
		// 상품 목록 전체 출력 호출코드
		System.out.println("정렬>> ㄱ.가나다순   ㄴ.조회순   ㄷ.평점순");
		
	}
	
	public void GoodsSearch() {
		System.out.println("찾고자 하는 상품을 검색해주세요>>");
		System.out.println("1. 지역으로 검색하기    2. 상품명으로 검색하기    3. 글내용으로 검색하기    4. 이전 화면으로");
	}
	
	public TravelUI() {
		String choice;
		while(true) {
			mainMenu();
			choice = sc.nextLine();
		}
	}


}
