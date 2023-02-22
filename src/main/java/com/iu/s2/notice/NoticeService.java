package com.iu.s2.notice;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.s2.util.FileManager;
import com.iu.s2.util.Pager;

@Service
public class NoticeService {
	@Autowired
	private NoticeDAO noticeDAO;
	@Autowired 
	private FileManager fileManager;
	@Autowired
	private ServletContext servletContext;
	
	
	public List<NoticeDTO> getNoticeList(Pager pager){
		Long totalCount =noticeDAO.getNoticeCount(pager);
		pager.makeRow();
		pager.makeNum(totalCount);
		List<NoticeDTO> ar= noticeDAO.getNoticeList(pager);
		return ar;
	}
	public int setNoticeAdd(NoticeDTO noticeDTO, MultipartFile pic) throws Exception {
		int result = noticeDAO.setNoticeAdd(noticeDTO);
		if(!pic.isEmpty()) {
			String realPath = servletContext.getRealPath("resources/upload/notice");
			String fileName= fileManager.fileSave(pic, realPath);
			
			NoticeImgDTO noticeImgDTO = new NoticeImgDTO();
			noticeImgDTO.setFileName(fileName);
			noticeImgDTO.setOriName(pic.getOriginalFilename());
			noticeImgDTO.setNoticeNum(noticeDTO.getNum());
			result =noticeDAO.setNoticeImgAdd(noticeImgDTO);
		}
		return result ;
		
		
		
	}
	public NoticeDTO getNoticeDetail(NoticeDTO noticeDTO) {
		noticeDTO=noticeDAO.getNoticeDetail(noticeDTO);
		noticeDAO.setNoticeHit(noticeDTO);
		return noticeDTO;
		
	}
	public int setNoticeDelete(NoticeDTO noticeDTO) {
		return noticeDAO.setNoticeDelete(noticeDTO);
		
		
	}
	public int setNoticeUpdate(NoticeDTO noticeDTO) {
		return noticeDAO.setNoticeUpdate(noticeDTO);
	}
}
