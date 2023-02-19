package com.iu.s2.util;

public class Pager {
	
	//�˻� ����(����� column)
	private String kind;
	//�˻���
	private String search;
	
	
	////////////////////////////////////////////////////////////
	
	

	private Long perPage;
	private Long perBlock;
	private Long totalPage;
	private Long page;
	private Long startRow;
	private Long lastRow;
	private Long startNum;
	private Long lastNum;
	private boolean before;
	private boolean after;
	private Long MaxPage;
	
	public void makeRow() {
		this.startRow = (this.getPage()-1)*getPerPage()+1;
		this.lastRow = this.getPage()*this.getPerPage();
	}
	//startnum , lastnum
	public void makeNum(Long totalCount) {

		//1. ��ü row�� ���� ���ϱ�
		//2. �� page�� ����
		this.totalPage = totalCount/this.getPerPage();
		
		if(totalCount%this.getPerPage()!=0) {
			totalPage=totalPage+1;
		}
		if(this.getPage()>totalPage) {
			this.setPage(totalPage);
		}

		//3. �� block�� ����� ����
		//		Long perBlock=5L;

		//4. �� block�� ��
		Long totalBlock= totalPage/this.getPerBlock();
		if(totalPage%this.getPerBlock()!=0) {
			totalBlock++;
		}
		//5. page ��ȣ�� ���� block ��ȣ ���ϱ�
		//page 1-5 curBlock 1
		//page 6-10curBlock 2
		//page 11-15 curBlock 3
		Long curBlock=this.getPage()/this.getPerBlock();
		if(this.page%this.getPerBlock()!=0) {
			curBlock++;
		}
		//6. curBlock�� ���۹�ȣ�� ����ȣ�� ���
		//		curBlock 	StartNum	LastNum
		//		1						1					5
		//		2						6					10	
		//		3						11					15
		//		
		this.startNum=(curBlock-1)*this.getPerBlock()+1;
		this.lastNum=curBlock*this.getPerBlock();
		this.before=false;
		this.after=true;
		if(curBlock==totalBlock) {
			lastNum=totalPage;
			this.after=false;
		}
		if(curBlock==1) {
			this.before=true;
		}


	}
	public Long getPerPage() {
		if(this.perPage==null||this.perPage==0) {
			this.perPage=10L;
		}
		return perPage;
	}
	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	public Long getPage() {
		if(this.page==null||this.page<=0) {
			this.page=1L;
		}
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}

	public Long getStartNum() {
		return startNum;
	}
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}
	public Long getLastNum() {
		return lastNum;
	}
	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	public boolean isAfter() {
		return after;
	}
	public void setAfter(boolean after) {
		this.after = after;
	}
	public boolean isBefore() {
		return before;
	}
	public void setBefore(boolean before) {
		this.before = before;
	}
	public Long getMaxPage() {
		return MaxPage;
	}
	public void setMaxPage(Long maxPage) {
		MaxPage = maxPage;
	}
	public Long getPerBlock() {
		if(this.perBlock==null||this.perBlock<1) {
			this.perBlock=5L;
		}
		return perBlock;
	}
	public void setPerBlock(Long perBlock) {
		this.perBlock = perBlock;
	}
	public Long getTotalPage() {
		return totalPage;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSearch() {
		if(search==null) {
			search="";
		}
		return search;	//"%"+search+"%"
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
}
