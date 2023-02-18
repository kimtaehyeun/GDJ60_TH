package com.iu.s2.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	@Autowired
	private NoticeDAO noticeDAO;

	public List<NoticeDTO> getNoticeList(){
		return noticeDAO.getNoticeList();
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
}
