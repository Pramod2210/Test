package WrapperClass;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer it=new Integer(10);
         int i=it;
         
        Character ch=new Character('s');
         char c=ch;
         
         
         int i1=10;
         Integer it1=i1;   // autoboxing
         //Integer it2=new Integer(it1);//manual boxing
         Integer it2=i1;
         System.out.println(it1==it);
         System.out.println(it1.equals(it2));
	}

}
