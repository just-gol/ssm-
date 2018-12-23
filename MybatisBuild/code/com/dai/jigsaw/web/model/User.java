package com.dai.jigsaw.web.model;

import org.springframework.stereotype.Component;

@Component("USER_MODEL")
public class User {

		private java.lang.Long id;
		private java.lang.String name;
		private java.lang.String age;
		private java.lang.String createDate;
		private java.lang.String updateDate;
		private java.lang.String isDelete;
		private java.lang.Long creator;
		private java.lang.Long updater;
		public java.lang.Long getId() {
	        return id;
	    }
	
	    public void setId(java.lang.Long id) {
	        this.id = id;
	    }
		public java.lang.String getName() {
	        return name;
	    }
	
	    public void setName(java.lang.String name) {
	        this.name = name;
	    }
		public java.lang.String getAge() {
	        return age;
	    }
	
	    public void setAge(java.lang.String age) {
	        this.age = age;
	    }
		public java.lang.String getCreate_date() {
	        return createDate;
	    }
	
	    public void setCreate_date(java.lang.String createDate) {
	        this.createDate = createDate;
	    }
		public java.lang.String getUpdate_date() {
	        return updateDate;
	    }
	
	    public void setUpdate_date(java.lang.String updateDate) {
	        this.updateDate = updateDate;
	    }
		public java.lang.String getIs_delete() {
	        return isDelete;
	    }
	
	    public void setIs_delete(java.lang.String isDelete) {
	        this.isDelete = isDelete;
	    }
		public java.lang.Long getCreator() {
	        return creator;
	    }
	
	    public void setCreator(java.lang.Long creator) {
	        this.creator = creator;
	    }
		public java.lang.Long getUpdater() {
	        return updater;
	    }
	
	    public void setUpdater(java.lang.Long updater) {
	        this.updater = updater;
	    }
}