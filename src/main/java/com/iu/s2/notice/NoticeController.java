package com.iu.s2.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s2.util.Pager;

@Controller
@RequestMapping(value = "/board/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;

	@RequestMapping(value = "list")
	public ModelAndView getNoticeList(ModelAndView mv,Pager pager) throws Exception{
		List<NoticeDTO> ar = noticeService.getNoticeList(pager);
		mv.addObject("list",ar);
		mv.addObject("pager",pager);
		mv.setViewName("board/list");
		return mv;
	}
	@RequestMapping(value = "detail",method = RequestMethod.GET)
	public ModelAndView getNoticeDetail(ModelAndView mv, NoticeDTO noticeDTO) throws Exception {
		noticeDTO=noticeService.getNoticeDetail(noticeDTO);
		mv.addObject("detail", noticeDTO);
		mv.setViewName("board/detail");
		return mv;
	}
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView setNoticeAdd(ModelAndView mv) throws Exception{
		mv.setViewName("board/add");
		return mv;
	}
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView setNoticeAdd(ModelAndView mv, NoticeDTO noticeDTO,MultipartFile pic, HttpSession session)throws Exception{
		
		
		
		int result = noticeService.setNoticeAdd(noticeDTO, pic);
		mv.setViewName("redirect:./list");
		return mv;
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public ModelAndView setNoticeDelete(ModelAndView mv,NoticeDTO noticeDTO)throws Exception{
		int result = noticeService.setNoticeDelete(noticeDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public ModelAndView setNoticeUpdate(ModelAndView mv,NoticeDTO noticeDTO)throws Exception{
		noticeDTO=noticeService.getNoticeDetail(noticeDTO);
		mv.addObject("dto", noticeDTO);
		mv.setViewName("board/update");
		return mv;
	}
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView setNoticeUpdate(NoticeDTO noticeDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result=noticeService.setNoticeUpdate(noticeDTO);
		
		mv.setViewName("redirect:./list");
		return mv;
	}
}
