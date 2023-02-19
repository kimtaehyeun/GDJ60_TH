package com.iu.s2.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s2.util.Pager;

@Repository
public class NoticeDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s2.notice.NoticeDAO.";
	
	
	public Long getNoticeCount(Pager pager) {
		return sqlSession.selectOne(NAMESPACE+"getNoticeCount",pager);
	}
	public List<NoticeDTO> getNoticeList(Pager pager) {
		return sqlSession.selectList(NAMESPACE+"getNoticeList",pager);
	}
	public int setNoticeAdd(NoticeDTO noticeDTO){
		return sqlSession.insert(NAMESPACE+"setNoticeAdd",noticeDTO);

	}
	public NoticeDTO getNoticeDetail(NoticeDTO noticeDTO) {
		return sqlSession.selectOne(NAMESPACE+"getNoticeDetail",noticeDTO);
	}
	public int setNoticeDelete(NoticeDTO noticeDTO) {
		return sqlSession.delete(NAMESPACE+"setNoticeDelete",noticeDTO);
	}
	public int setNoticeUpdate(NoticeDTO noticeDTO) {
		return sqlSession.update(NAMESPACE+"setNoticeUpdate",noticeDTO);
	}
	public int setNoticeImgAdd(NoticeImgDTO noticeImgDTO) {
		return sqlSession.insert(NAMESPACE+"setNoticeImgAdd",noticeImgDTO);
	}
}
