package spring.beans;

import org.springframework.stereotype.Component;

@Component("dml")
public class DMLImple implements DML{
	public void insert(){
		System.out.println("inserting");
	}
	public void delete(){
		System.out.println("deleting");
	}
	public void update(){
		System.out.println("updating");
	}
}
