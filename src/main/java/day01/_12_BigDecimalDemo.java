package day01;

import java.math.BigDecimal;

public class _12_BigDecimalDemo {

	public static void main(String[] args) {
		System.out.println(0.1 + 0.1 == 0.2);	//true
        System.out.println(0.1 + 0.1 + 0.1 == 0.3);	//false
        System.out.println(0.1 + 0.1);	//0.2
        System.out.println(0.1 + 0.1 + 0.1);	//0.30000000000000004
        
        //以上問題是由於IEEE754算術標準造成的，這時需要藉由BigDecimal去處理
        
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal c = new BigDecimal("0.1");
        System.out.println(a.add(b).add(c).doubleValue());
        System.out.println(a.add(b).add(c).doubleValue() == 0.3);
	}

}
