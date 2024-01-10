package com.seed.binding;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class CustomerEvent {
	
	
	public CustomerEvent(String string, Date date) {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}


	private String name;
	private Date  createdate;

}



