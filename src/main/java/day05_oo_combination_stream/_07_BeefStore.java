package day05_oo_combination_stream;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

import org.w3c.dom.ls.LSOutput;

public class _07_BeefStore {

	public static void main(String[] args) {
		_02_Beef beef1 = new _02_Beef("碎牛肉", 15);
		_02_Beef beef2 = new _02_Beef("菲力牛排", 45);
		_02_Beef beef3 = new _02_Beef("沙朗牛排", 30);
		_02_Beef beef4 = new _02_Beef("組合牛", 10);
		_02_Beef beef5 = new _02_Beef("牛小排", 35);
        
		_02_Beef[] beefs = {beef1, beef2, beef3, beef4, beef5};
        
        // 請求出是"牛排"的平均價格 = ?
        // Java 7
        int sum = 0;
        int count = 0;
        for(_02_Beef beef : beefs) {
            if(beef.getName().contains("排")) {
                count++;
                sum += beef.getPrice();
            }
        }
        double avg = sum / (double)count;
        System.out.printf("牛排的平均價格 = %.2f\n", avg);
        
        // 請求出是"牛排"的平均價格 = ?
        // Java 8
        double avg2 = Arrays.stream(beefs)
                            .filter(beef -> beef.getName().contains("排"))
                            .mapToInt(beef -> beef.getPrice())
                            .average()
                            .getAsDouble();
        System.out.printf("牛排的平均價格(1) = %.2f\n", avg2);
        
        // 改良上述寫法
        OptionalDouble optBeefAvg = Arrays.stream(beefs)
                            .filter(beef -> beef.getName().contains("排"))
                            .mapToInt(beef -> beef.getPrice())
                            .average();
        if(optBeefAvg.isPresent()) {
            System.out.printf("牛排的平均價格(2) = %.2f\n", optBeefAvg.getAsDouble());
        } else {
            System.err.println("本店不提供牛排");
        }
        
        
        // 請求出是"豬"排的平均價格 = ?        
        OptionalDouble optAvg = Arrays.stream(beefs)
                            .filter(beef -> beef.getName().contains("豬"))
                            .mapToInt(beef -> beef.getPrice())
                            .average();
        if(optAvg.isPresent()) {
            System.out.printf("豬排的平均價格 = %.2f\n", optAvg.getAsDouble());
        } else {
            System.err.println("本店不提供豬排");
        }
	}

}
