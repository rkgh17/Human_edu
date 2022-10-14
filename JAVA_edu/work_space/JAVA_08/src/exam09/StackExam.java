package exam09;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		Stack<Coin> st = new Stack<Coin>();
		
		Coin c1 = new Coin(10);
		Coin c2 = new Coin(20);
		Coin c3 = new Coin(30);
		Coin c4 = new Coin(40);

		st.push(c1); // add도 됨
		st.push(c2);
		st.push(c3);
		st.push(c4);

		// 10원 코인이 가장 밑에, 40원 코인이 가장 위에
		// 40원 코인부터 빠져나감.
		System.out.println(st);
		
		while(!st.empty()) { // ! = not / st.empty는 비어있으면 true
			Coin rmCoin = st.pop();
			// pop을 통해서 제거된 맨 위의 코인
			System.out.println("제거된 코인 : " + rmCoin.getCoin());
			// 지금은 getCoin 메서드를 해줬지만, rmCoin.value도 가능
		}
		System.out.println("Stack에 Coin이 없습니다.");
		

	}

}
