package com.iu.s2.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s2.util.Pager;

@Service
public class NoticeService {
	@Autowired
	private NoticeDAO noticeDAO;

	public List<NoticeDTO> getNoticeList(Pager pager){
		Long totalCount =noticeDAO.getNoticeCount(pager);
		pager.makeRow();
		pager.makeNum(totalCount);
		List<NoticeDTO> ar= noticeDAO.getNoticeList(pager);
		return ar;
	}
	public int setNoticeAdd(NoticeDTO noticeDTO) {
		return noticeDAO.setNoticeAdd(noticeDTO);
		
	}
	public NoticeDTO getNoticeDetail(NoticeDTO noticeDTO) {
		return noticeDAO.getNoticeDetail(noticeDTO);
		
	}
	public int setNoticeDelete(NoticeDTO noticeDTO) {
		return noticeDAO.setNoticeDelete(noticeDTO);
		
		
	}
	public int setNoticeUpdate(NoticeDTO noticeDTO) {
		return noticeDAO.setNoticeUpdate(noticeDTO);
	}
}
