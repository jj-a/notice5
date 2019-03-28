package dev.blog.notice5;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class NoticeDAO {
	
	// @Autowired : @Component annotation으로 자동생성된 객체를 사용하기 위해 객체간 연결시켜줌
	@Autowired
	SqlSession sqlSession;
	
	// Constructor
	
	public NoticeDAO() {
		System.out.println("Start NoticeDAO");
		
	}
	
	
	// Method
	
	public int create(NoticeDTO dto) {

		NoticeMapper mapper=sqlSession.getMapper(NoticeMapper.class);
		int result=mapper.create(dto);

		return result;
		
	} // create() end
	
	
	public ArrayList<NoticeDTO> list(NoticeDTO dto) {

		NoticeMapper mapper=sqlSession.getMapper(NoticeMapper.class);
		ArrayList<NoticeDTO> list=mapper.list();

		return list;
		
	} // list() end
	
	
	public NoticeDTO read(NoticeDTO dto) {

		NoticeMapper mapper=sqlSession.getMapper(NoticeMapper.class);
		dto=mapper.read(dto);

		return dto;
		
	} // read() end
	
	
	public int update(NoticeDTO dto) {

		NoticeMapper mapper=sqlSession.getMapper(NoticeMapper.class);
		int result=mapper.update(dto);

		return result;
		
	} // update() end
	

	public int delete(NoticeDTO dto) {

		NoticeMapper mapper=sqlSession.getMapper(NoticeMapper.class);
		int result=mapper.delete(dto);

		return result;
		
	} // delete() end
	

	public int count() {

		NoticeMapper mapper=sqlSession.getMapper(NoticeMapper.class);
		int count=mapper.count();

		return count;
		
	} // count() end
	
	
}
