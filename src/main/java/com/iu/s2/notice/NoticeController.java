package com.iu.s2.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;

	@RequestMapping(value = "list")
	public ModelAndView getNoticeList(ModelAndView mv) throws Exception{
		List<NoticeDTO> ar = noticeService.getNoticeList();
		mv.addObject("list",ar);
		mv.setViewName("notice/list");
		return mv;
	}
	@RequestMapping(value = "detail",method = RequestMethod.GET)
	public ModelAndView getNoticeDetail(ModelAndView mv, NoticeDTO noticeDTO) throws Exception {
		noticeDTO=noticeService.getNoticeDetail(noticeDTO);
		mv.addObject("detail", noticeDTO);
		mv.setViewName("notice/detail");
		return mv;
	}
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView setNoticeAdd(ModelAndView mv) throws Exception{
		mv.setViewName("notice/add");
		return mv;
	}
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView setNoticeAdd(ModelAndView mv, NoticeDTO noticeDTO)throws Exception{
		int result = noticeService.setNoticeAdd(noticeDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}
	@RequestMapping(value = "delete",method = RequestMethod.GET)
	public ModelAndView setNoticeDelte(ModelAndView mv)throws Exception{
		mv.setViewName("notice/delete");
		return mv;
	}
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public ModelAndView setNoticeDelte(ModelAndView mv,NoticeDTO noticeDTO)throws Exception{
		int result = noticeService.setNoticeDelete(noticeDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}
}
