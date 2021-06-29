package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity //veritabanı öğesi demektir.
@Table  (name = "jobPosition")   //veri tabanında job_positions

public class Jobs {
	
	@Id
	@GeneratedValue
	
	@Column(name="job_id")
	private int id;
	
	@Column(name="job_name")
	private String name;
	
	
	@Column(name = "category_name")
	private String category;
	
	
	public Jobs()
	{
		
	}

	public Jobs(int id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}
	
	
	
	
	

}
