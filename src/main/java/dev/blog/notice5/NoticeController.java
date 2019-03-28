package dev.blog.notice5;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class NoticeController {
	
	@Autowired
	private NoticeDAO dao;
	
	public NoticeController() {
		System.out.println("Start NoticeController");
	}
	
	
	/*
	@RequestMapping(value="[요청명령어]", method=RequestMethod.[GET|POST], produces="text/plain; charset='UTF-8'")
	 */

	@RequestMapping(value="notice/list.do", method=RequestMethod.GET)
	public ModelAndView list(NoticeDTO dto) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("notice/list");
		
		mav.addObject("list", dao.list(dto));	// list 전달
		
		return mav;
	} // list() end

	
	@RequestMapping(value="/notice/read.do", method=RequestMethod.GET)
	public ModelAndView read(NoticeDTO dto) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("notice/read");
		System.out.println(dto.getNoticeno());
		
		dto=dao.read(dto);
		
		mav.addObject("article", dto);	// list 전달
		
		return mav;
	} // list() end
	

	@RequestMapping(value="/notice/create.do", method=RequestMethod.GET)
	public ModelAndView create(NoticeDTO dto) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("notice/createForm");
		return mav;
	} // create() end
	

	@RequestMapping(value="/notice/create.do", method=RequestMethod.POST)
	public ModelAndView createProc(NoticeDTO dto, HttpServletRequest req) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:/notice/list.do");

		int count=dao.create(dto);
		
		
		if(count==0) {
			mav.addObject("msg1", "등록이 실패하였습니다. ");
			mav.addObject("img", "<img src='../images/original_17.gif'>");
			mav.addObject("link1", "<input type='button' value='다시시도' onclick='javascript:history.back()'>");
			mav.addObject("link2", "<input type='button' value='목록' onclick='location.href=\"./list.do\"'>");
		}else {
			mav.addObject("title", dto.getTitle());
			mav.addObject("msg1", "등록되었습니다. ");
			mav.addObject("img", "<img src='../images/muzi2.gif'>");
			mav.addObject("link1", "<input type='button' value='계속 등록' onclick='location.href=\"./create.do?noticeno="+dto.getNoticeno()+"\"'>");
			mav.addObject("link2", "<input type='button' value='목록' onclick='location.href=\"./list.do\"'>");
		}
		
		mav.addObject("count", count);
		
		return mav;
	} // createProc() end
	

	@RequestMapping(value="notice/update.do", method=RequestMethod.GET)
	public ModelAndView update(NoticeDTO dto) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("notice/updateForm");

		dto=dao.read(dto);
		mav.addObject("article", dto);
		
		return mav;
	} // update() end
	

	@RequestMapping(value="notice/update.do", method=RequestMethod.POST)
	public ModelAndView updateProc(NoticeDTO dto, HttpServletRequest req) {
		ModelAndView mav=new ModelAndView();
		
		mav.setViewName("notice/msgView");
		
		// DB 수정 및 기존 파일 삭제 수행
		int result;
		result=dao.update(dto);
		
		if(result==0) {
			mav.addObject("msg1", "수정 실패하였습니다. ");
			mav.addObject("img", "<img src='../images/original_17.gif'>");
			mav.addObject("link1", "<input type='button' value='다시시도' onclick='javascript:history.back()'>");
			mav.addObject("link2", "<input type='button' value='목록' onclick='location.href=\"./list.do\"'>");
		}else {
			mav.addObject("msg1", "수정되었습니다. ");
			mav.addObject("img", "<img src='../images/muzi2.gif'>");
			mav.addObject("link2", "<input type='button' value='목록' onclick='location.href=\"./list.do\"'>");
		}
		
		return mav;
	} // updateProc() end
	

	@RequestMapping(value="notice/delete.do", method=RequestMethod.GET)
	public ModelAndView delete(NoticeDTO dto) {
		ModelAndView mav=new ModelAndView();
		
		mav.setViewName("notice/delete");
		
		mav.addObject("article", dto);
		
		return mav;
	} // delete() end
	

	@RequestMapping(value="notice/delete.do", method=RequestMethod.POST)
	public ModelAndView deleteProc(NoticeDTO dto, HttpServletRequest req) {
		ModelAndView mav=new ModelAndView();
		
		mav.setViewName("notice/msgView");
		
		int result=dao.delete(dto);
		
		if(result==0) {
			mav.addObject("msg1", "삭제 실패하였습니다. ");
			mav.addObject("img", "<img src='../images/original_17.gif'>");
			mav.addObject("link1", "<input type='button' value='다시시도' onclick='javascript:history.back()'>");
			mav.addObject("link2", "<input type='button' value='목록' onclick='location.href=\"./list.do\"'>");
		}else {
			mav.addObject("msg1", "삭제되었습니다. ");
			mav.addObject("img", "<img src='../images/muzi2.gif'>");
			mav.addObject("link2", "<input type='button' value='목록' onclick='location.href=\"./list.do\"'>");
		}
		
		return mav;
	} // deleteProc() end
	
	
}
