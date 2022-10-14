package exam09;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {

	public static void main(String[] args) {
		Queue<Coin> que = new LinkedList<Coin>();
		Coin c1 = new Coin(10);
		Coin c2 = new Coin(20);
		Coin c3 = new Coin(30);
		Coin c4 = new Coin(40);
		
		que.offer(c1); // add도됨
		que.offer(c2);
		que.offer(c3);
		que.offer(c4);
		// 40원 코인이 가장 앞에, 10원 코인이 가장 뒤에
		// 10원 코인부터 빠져나감.
		System.out.println(que);
		
		while(!que.isEmpty()) { // ! = not / st.empty는 비어있으면 true
			Coin rmCoin = que.poll();
			// pop을 통해서 제거된 맨 위의 코인
			System.out.println("제거된 코인 : " + rmCoin.getCoin());
			// 지금은 getCoin 메서드를 해줬지만, rmCoin.value도 가능
		}
		System.out.println("Queue에 Coin이 없습니다.");
		
		
	}

}
