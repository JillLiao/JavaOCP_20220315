package day04_multiarray;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class _07_StatisticsArray {

	public static void main(String[] args) {
		int[] scores = {90, 100, 80};
        // 最小, 最大, 平均, 總和, 個數
        // 將 scores 串流化
        Arrays.stream(scores).forEach(x -> System.out.println(x));
        
        int sum = IntStream.of(scores).sum();
        System.out.println(sum);
        
        double avg = IntStream.of(scores).average().getAsDouble();
        System.out.println(avg);
        
        int max = IntStream.of(scores).max().getAsInt();
        System.out.println(max);
        
        IntSummaryStatistics stat = IntStream.of(scores).summaryStatistics();
        System.out.println(stat);
        System.out.println(stat.getAverage());
        System.out.println(stat.getSum());
        System.out.println(stat.getMax());
        System.out.println(stat.getMin());
        System.out.println(stat.getCount());
	}

}