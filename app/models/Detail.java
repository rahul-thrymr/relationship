package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;

@Entity
public class Detail extends Model{

	@Id
	@GeneratedValue
	@Column(name="detail_pk")
	public Long dId;
	public Long income;
	public String city;
	
	
	
	public static Find<Long,Detail> find = new Model.Find<Long,Detail>(){};
}
