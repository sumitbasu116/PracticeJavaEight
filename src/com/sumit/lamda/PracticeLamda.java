package com.sumit.lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PracticeLamda {

	public static void main(String[] args) {
		MultiOpsClass opsClass=new MultiOpsClass();
		Consumer<String> msgConsumer=opsClass::print;
		msgConsumer.accept("Sumit");
		
		Function<Integer, String> fName = opsClass::fetchName;
		System.out.println(fName.apply(1));
		
		Supplier<String> supplyGreet = opsClass::fetchGreetingMsg;
		System.out.println(supplyGreet.get());
		
		Predicate<Integer> predictMale = opsClass::isMale;
		System.out.println(predictMale.test(1));
	}
}