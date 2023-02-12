package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class AvaregeofFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Float>a=new ArrayList<>();
    a.add(12.5f);
    a.add(45.5f);
    a.add(47.5f);
    a.add(5.5f);
    a.add(12.5f);
    a.add(1.5f);
    int count=0;
    float sum=0;
    double average;
    Iterator<Float>it=a.iterator();
    while(it.hasNext()) {
    	sum=sum+it.next();
    	//count++;
    }
    //System.out.println(count);
     average=sum/a.size();
    
     System.out.println(average);
	}

}
