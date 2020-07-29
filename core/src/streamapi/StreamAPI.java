package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=Arrays.asList("1","5","3","4","B","a","A");
		
		List<String> list2 = list.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(list2);
		
		
	
	}

}
