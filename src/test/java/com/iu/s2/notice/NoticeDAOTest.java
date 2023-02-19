package com.iu.s2.notice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s2.MyTestCase;

public class NoticeDAOTest extends MyTestCase{
	@Autowired
	private NoticeService noticeService;
//	@Test
//	public void getNoticeListTest() {
//		List<NoticeDTO> ar =  noticeService.getNoticeList();
//		assertEquals(0, ar.size());
//	}

//	@Test
//	public void setNoticeAddTest() {
//		NoticeDTO noticeDTO = new NoticeDTO();
//		noticeDTO.setNoticeTitle("a");
//		noticeDTO.setNoticeContents("a");
//		noticeDTO.setNoticeWriter("a");
//		noticeDTO.setNoticeHit(1L);
//		int result = noticeDAO.setNoticeAdd(noticeDTO);
//		assertEquals(1, result);
//	}
//	@Test
//	public void getNoticeDetail() {
//		NoticeDTO noticeDTO = new NoticeDTO();
//		noticeDTO.setNoticeNum(1L);
//		noticeDTO=noticeDAO.getNoticeDetail(noticeDTO);
//		assertNotNull(noticeDTO);
//	}
}
