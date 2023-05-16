package Praveen15thMay;

import java.util.stream.Stream;

//iterated Stream

public class Collection$stream02 {
	
	public static void main(String[] args) {
		
		Stream<Integer> values = Stream.of(3,4,5,6,7);
		
		//iterating once 
		values.forEach(System.out::print);
		
		//iterating twice--- ERROR
		values.forEach(System.out::print);
				
	}

}

/*
 * 34567Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
	at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
	at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762)
	at Praveen15thMay.Collection$stream02.main(Collection$stream02.java:17)
 *
 * */
 