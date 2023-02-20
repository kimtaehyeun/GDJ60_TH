package com.iu.s2.notice;

import java.util.Calendar;

public class NoticeDTO {

	
	private Long noticeNum;
	private String noticeTitle;
	private String noticeContents;
	private String noticeWriter;
	private Calendar noticeRegDate;
	private Long noticeHit;
	
	private NoticeImgDTO noticeImgDTO;
	
	public NoticeImgDTO getNoticeImgDTO() {
		return noticeImgDTO;
	}
	public void setNoticeImgDTO(NoticeImgDTO noticeImgDTO) {
		this.noticeImgDTO = noticeImgDTO;
	}
	public Long getNoticeNum() {
		return noticeNum;
	}
	public void setNoticeNum(Long noticeNum) {
		this.noticeNum = noticeNum;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContents() {
		return noticeContents;
	}
	public void setNoticeContents(String noticeContents) {
		this.noticeContents = noticeContents;
	}
	public String getNoticeWriter() {
		return noticeWriter;
	}
	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}
	public Calendar getNoticeRegDate() {
		return noticeRegDate;
	}
	public void setNoticeRegDate(Calendar noticeRegDate) {
		
		this.noticeRegDate = noticeRegDate;
	}
	public Long getNoticeHit() {
		return noticeHit;
	}
	public void setNoticeHit(Long noticeHit) {
		
		this.noticeHit = noticeHit;
	}
	
}
