package my.edu.utem.ftmk.dad.restorderapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
@Table(name="ordertype")

public class OrderType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="orderTypeId")
	private int orderTypeId;
	
	@Column (name="code")
	private String code;
	
	@Column (name="name")
	private String name;
	
	public int getOrderTypeId() {
		return orderTypeId;
	}
	public void setOrderTypeId(int orderTypeId) {
		this.orderTypeId = orderTypeId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
