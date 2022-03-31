package day05_oo_combination_stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class _06_CheeseStore {

	public static void main(String[] args) {
		_03_Cheese cheese1 = new _03_Cheese("帕瑪森", 30);
		_03_Cheese cheese2 = new _03_Cheese("巧達", 5);
		_03_Cheese cheese3 = new _03_Cheese("馬茲瑞拉", 20);
		_03_Cheese cheese4 = new _03_Cheese("費塔", 25);
		_03_Cheese cheese5 = new _03_Cheese("藍紋", 35);
		_03_Cheese[] cheeses = {cheese1, cheese2, cheese3, cheese4, cheese5};
        // 總金額
        // Java 7
        int sum = 0;
        for(_03_Cheese cheese : cheeses) {
            System.out.println(cheese);
            sum += cheese.getPrice();
        }
        System.out.println(sum);
        // 總金額
        // Java 8
        int sum2 = Arrays.stream(cheeses).mapToInt(cheese -> cheese.getPrice()).sum();
        System.out.println(sum2);
        // 統計數據
        IntSummaryStatistics stat = Arrays.stream(cheeses)
                                          .mapToInt(cheese -> cheese.getPrice())
                                          .summaryStatistics();
        // 藉由統計資料得到最高價
        int max = stat.getMax();
        System.out.println("最高價:" + max);
        
        // 印出最高價的起司名稱 = ?
        // Java 7
        for(_03_Cheese cheese : cheeses) {
            if(cheese.getPrice() == max) {
                System.out.printf("最高價的起司名稱 = %s\n", cheese.getName());
            }
        }
        // Java 8
        Arrays.stream(cheeses)
              .filter(cheese -> cheese.getPrice() == max)
              .forEach(cheese -> System.out.printf("最高價的起司名稱 = %s\n", cheese.getName()));
	}

}
