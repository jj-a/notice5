package dev.blog.notice5;

public class NoticeDTO {
	
	private int noticeno;
	private String title, rname, rdate;
	
	
	// Constructor
	
	public NoticeDTO() {
		System.out.println("Start NoticeDTO");
	}
	
	
	// Getter&Setter
	
	public int getNoticeno() {
		return noticeno;
	}

	public void setNoticeno(int noticeno) {
		this.noticeno = noticeno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRdate() {
		return rdate;
	}
	
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	
}
