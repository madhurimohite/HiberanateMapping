package com.scp.Inheritance;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class TestParentChild {
public static void main(String[] args) {
	Parent p1=new Parent(1, "Parent-1", "Parent-2");
	Child c1=new Child(11, "Child1-Parent-1", "Child1-Parent-2", "child1-1", "child1-2", "child1-3");
	Child2 c2=new Child2(23, "Chil2-Parent-1", "Child2-Parent-2", "child2-1", "child2-2");
	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=sf.openSession();
	Transaction tranc=session.beginTransaction();
	session.save(p1);
	session.save(c1);
	session.save(c2);
	tranc.commit();
	session.close();
}
}
