package hw02;

import java.sql.Timestamp;

public class CelebBean {
	int id;
	String celeName;
	String gender;
	String filename;
	long size;
	Timestamp timeSave;
	byte[] picture;
	
	public CelebBean(int id, String celeName, String gender, String filename, long size, Timestamp timeSave,
			byte[] picture) {
		super();
		this.id = id;
		this.celeName = celeName;
		this.gender = gender;
		this.filename = filename;
		this.size = size;
		this.timeSave = timeSave;
		this.picture = picture;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCeleName() {
		return celeName;
	}
	public void setCeleName(String celeName) {
		this.celeName = celeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public Timestamp getTimeSave() {
		return timeSave;
	}
	public void setTimeSave(Timestamp timeSave) {
		this.timeSave = timeSave;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
}
