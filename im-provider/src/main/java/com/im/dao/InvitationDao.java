package com.im.dao;

import java.util.List;

import com.im.pojo.Invitation;

public interface InvitationDao {
	public List<Invitation> find();

	public Invitation findById(int id);

	public int insert(Invitation invitation);

	public int delete(int[] ids);

	public int update(Invitation invitation);
	
	public  List<Invitation> findByPage(Integer num,Integer pageSize);
}
