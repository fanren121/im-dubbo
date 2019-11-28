package com.im.pojo;

import java.io.Serializable;
import java.util.List;


/**
 * @author Administrator
 *	每页展示
 */
public class PagePo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 数据条数
	 */
	private int count;
	/**
	 * 当前页码
	 */
	private Integer page;
	private Integer upPage;
	private Integer downPage;
	/**
	 * 每页数据条数
	 */
	private int pageSize;
	/**
	 * 页数
	 */
	private int endPage;
	/**
	 * 展示的集合
	 */
	private List<Invitation> listPage;
	public PagePo(int count, Integer page, Integer upPage, Integer downPage, int pageSize, int endPage,
			List<Invitation> listPage) {
		super();
		this.count = count;
		this.page = page;
		this.upPage = upPage;
		this.downPage = downPage;
		this.pageSize = pageSize;
		this.endPage = endPage;
		this.listPage = listPage;
	}
	public PagePo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getUpPage() {
		return upPage;
	}
	public void setUpPage(Integer upPage) {
		this.upPage = upPage;
	}
	public Integer getDownPage() {
		return downPage;
	}
	public void setDownPage(Integer downPage) {
		this.downPage = downPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public List<Invitation> getListPage() {
		return listPage;
	}
	public void setListPage(List<Invitation> listPage) {
		this.listPage = listPage;
	}
	
	
	
}
