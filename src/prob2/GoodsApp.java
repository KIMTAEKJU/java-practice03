package prob2;

import java.util.Scanner;

public class GoodsApp 
{
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		Goods goods[] = new Goods[COUNT_GOODS];
		
		for (int i = 0; i < COUNT_GOODS; i++)
			goods[i] = new Goods(scan.next(), 
					Integer.parseInt(scan.next()),
					Integer.parseInt(scan.next()));
		
		for (int i = 0; i < COUNT_GOODS; i++)
			System.out.println(goods[i].getName() + "(가격:" +
								goods[i].getPrice() + "원)이 " +
								goods[i].getCount() + "개 입고 되었습니다");
	}
}
