package contaniment;

public class Institutemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Institute i=new Institute();
     Branch b=new Branch();
     Subject s=new Subject();
     Topic t=new Topic();
     Subtopic sub=new Subtopic();
     Question q=new Question();
     
     i.setIid(1245);
     i.setIname("jspm");
     i.setB(b);
     i.setS(s);
     i.setT(t);
     i.setSub(sub);
     i.setQ(q);
     b.setBid(1);
     b.setBname("mechanical");
     s.setSid(14);
     s.setSname("dom");
     t.setTid(5);
     t.setTname("Theory of machine");
     sub.setSubid(51);
     sub.setSubname("links");
     q.setQid(10);
     q.setQname("what is motion");
     
    System.out.println(i);
     
     
	}

}
