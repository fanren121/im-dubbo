package com.im.untile;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.im.dao.InvitationDao;
import com.im.pojo.Invitation;
import com.im.pojo.PagePo;
import com.im.service.InvitationService;

@Component
public class PageUtil {

	
	private static  InvitationDao invitationDao;


	@Autowired
	public PageUtil( InvitationDao invitationDao) {
		super();
		PageUtil.invitationDao = invitationDao;
	}


	public static PagePo getPage(Integer page) {
		List<Invitation> listPage = new ArrayList<>();
		if (page == null) page = 3;
		Integer pageSize = 2;
		System.err.println(invitationDao);
		Integer num = pageSize*(page-1);
		listPage = invitationDao.findByPage(num, pageSize);
		int count = invitationDao.find().size();
		int endPage = (int) Math.ceil((double) count / pageSize);
		PagePo pagePo = new PagePo(count, page,page-1,page+1, pageSize, endPage, listPage);
		return pagePo;
	}
}
