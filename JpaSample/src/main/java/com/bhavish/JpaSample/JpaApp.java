package com.bhavish.JpaSample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JpaApp {
	@Id
	private int eid;
	private String Name;
	private String tech;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "JpaApp [eid=" + eid + ", Name=" + Name + ", tech=" + tech
				+ "]";
	}
}
