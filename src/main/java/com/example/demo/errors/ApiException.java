package com.example.demo.errors;


public class ApiException {
	
	private String type;
	private String title;
	private Integer status;
	private String detail;
	private String instance;
	
	public ApiException(String type, String title, Integer status, String detail, String instance) {
		super();
		this.type = type;
		this.title = title;
		this.status = status;
		this.detail = detail;
		this.instance = instance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}
	
	

	
}
