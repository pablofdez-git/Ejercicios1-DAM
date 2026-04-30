package resuelta9_10;

import java.util.Comparator;

public class ComparaEnteros implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
//		return (Integer)o2 - (Integer)o1;
		return (-1)*(Integer)o1 - (Integer)o2;
		
	}
	
	/*
	@Override
	public int compare(Object o1, Object o2){
		Integer n1 = (Integer) o1;
		Integer n2 = (Integer) o2;
		return n2.compareTo(n1);				//1ª Forma
		return (-1)*(n1.compareTo(n2));			//2ª Forma
	}
	 */

}
