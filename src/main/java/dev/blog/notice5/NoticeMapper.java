package dev.blog.notice5;

import java.util.ArrayList;
import java.util.HashMap;

public interface NoticeMapper {
	/*
		Mapper(notice.xml)에 등록되어있는 id를 interface의 메소드에 다시 한번 등록함으로써
		myBatis3에서 호출하기 편리하도록 지원
	 */
	public int create(NoticeDTO dto);
	public ArrayList<NoticeDTO> list();
	public ArrayList<NoticeDTO> search(HashMap<String, String> searchMap);
	public NoticeDTO read(NoticeDTO dto);
	public int update(NoticeDTO dto);
	public int delete(NoticeDTO dto);
	public int count();
	
}
