public class Hk5 {
	public static void main(String[] args) {
		int[] account = new int[4];
		Scanner sc = new Scanner(System.in);
		
		int price = 0;
		int withdraw = 0;
		int balance = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("---------------------------------------");
			System.out.println("     1.예금 | 2.출금 | 3.잔고 | 4.종료      ");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			i = sc.nextInt(); // 번호선택 입력대기
			 
			if (i == 1) {
				System.out.print("예금액>");
				balance += price;
				price = sc.nextInt(); // 금액 입력대기
				 
			} else if (i == 2) {
				System.out.print("출금액>");
				balance += price;
				withdraw = sc.nextInt(); // 입력대기
				
			balance = price - withdraw; 
			} else if (i == 3) {
				
				System.out.print("잔고액>" + balance);
				balance = sc.nextInt(); // 입력대기
				
			} else if (i == 4) {
				System.out.print("프로그램 종료");
				

			} else {
				System.out.print("다시 입력해주세요.");
				i = sc.nextInt(); // 번호 선택 입력대기
				
			}
		}

	}

}
