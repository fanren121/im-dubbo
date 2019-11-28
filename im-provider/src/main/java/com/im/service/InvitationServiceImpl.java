package com.im.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.im.dao.InvitationDao;
import com.im.pojo.Invitation;
import com.im.pojo.PagePo;
import com.im.untile.PageUtil;

@Service
public class InvitationServiceImpl implements InvitationService {

	@Autowired
	private InvitationDao invitationDao;

	@Override
	public List<Invitation> find() {
		return invitationDao.find();
	}

	@Override
	public Invitation find(int id) {
		return invitationDao.findById(id);
	}

	@Override
	public boolean insert(Invitation invitation) {
		invitation.setCreatedate(new Date(System.currentTimeMillis()));
		return invitationDao.insert(invitation) > 0 ? true : false;
	}

	@Override
	public boolean delete(int[] ids) {
		return invitationDao.delete(ids) > 0 ? true : false;
	}

	@Override
	public boolean update(Invitation invitation) {
		return invitationDao.update(invitation) > 0 ? true : false;
	}

	@Override
	public PagePo find(Integer page) {
		PagePo pagePo = PageUtil.getPage(page);
		System.out.println(pagePo);
		return pagePo;
	}

}
