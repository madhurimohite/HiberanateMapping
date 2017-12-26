package com.scp.Inheritance;


import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;



@Entity

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
  name="Parent_TYPE", 
  discriminatorType=DiscriminatorType.STRING
  )
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
	//@Inheritance(strategy=InheritanceType.JOINED)
public class Parent {
    @Id
  //  @GeneratedValue(strategy=GenerationType.TABLE)
    int id;
    @Column
	String p1;
    @Column
    String p2;
    
	@Override
	public String toString() {
		return "Parent [id=" + id + ", p1=" + p1 + ", p2=" + p2 + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getP1() {
		return p1;
	}
	public void setP1(String p1) {
		this.p1 = p1;
	}
	public String getP2() {
		return p2;
	}
	public void setP2(String p2) {
		this.p2 = p2;
	}
	public Parent(int id, String p1, String p2) {
		super();
		this.id = id;
		this.p1 = p1;
		this.p2 = p2;
	}
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

}

@Entity
class Child extends Parent{
	
	@Column
	String c11;
	@Column
	String c12;
	@Column
	String c13;
	public String getC11() {
		return c11;
	}
	public void setC11(String c11) {
		this.c11 = c11;
	}
	public String getC12() {
		return c12;
	}
	public void setC12(String c12) {
		this.c12 = c12;
	}
	public String getC13() {
		return c13;
	}
	public void setC13(String c13) {
		this.c13 = c13;
	}
	@Override
	public String toString() {
		return "Child [c11=" + c11 + ", c12=" + c12 + ", c13=" + c13 + "]";
	}
	public Child(int id, String p1, String p2, String c11, String c12, String c13) {
		super(id, p1, p2);
		this.c11 = c11;
		this.c12 = c12;
		this.c13 = c13;
	}
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

@Entity
class Child2 extends Parent{
	@Column
	String c21;
	@Column
	String c22;
	public String getC21() {
		return c21;
	}
	public void setC21(String c21) {
		this.c21 = c21;
	}
	public String getC22() {
		return c22;
	}
	public void setC22(String c22) {
		this.c22 = c22;
	}
	@Override
	public String toString() {
		return "Child2 [c21=" + c21 + ", c22=" + c22 + "]";
	}
	public Child2(int id, String p1, String p2, String c21, String c22) {
		super(id, p1, p2);
		this.c21 = c21;
		this.c22 = c22;
	}
	public Child2() {
		super();
		// TODO Auto-generated constructor stub
	}

}