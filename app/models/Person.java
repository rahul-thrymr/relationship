package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;


@Entity
public class Person extends Model{
	
	@Id
	@GeneratedValue
	public Long pId;
	public String name;
	public String lname;
	public String password;
	
	
	@OneToOne(cascade =CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="detail_fk")
	public Detail detail;
	
	
	 public static Find<Long,Person> find = new Model.Find<Long,Person>(){};

	

}
