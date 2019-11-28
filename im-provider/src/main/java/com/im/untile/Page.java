/*package com.im.untile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.im.pojo.Invitation;
import com.im.pojo.PagePo;

public class Page {
	public static PagePo getpage(List<Invitation> list,Integer page) {
		List<Invitation> listPage = new ArrayList<>();
		if(page==null) page=1;
		Stream<Invitation> stream = list.stream();
		int pageSize = 10;//页面大小
		stream.skip(pageSize*(page-1));
		int count = (int) stream.count();
		System.out.println(count);
		int endPageCount = count%pageSize;
		System.out.println(endPageCount);
		int endPage = (int) Math.ceil(count/pageSize)+1;
		System.out.println(endPage);
		//每页展示的集合
		if (page!=endPage) {
			
			stream.limit(pageSize).collect(Collectors.toList());
		} else {
			stream.limit(endPageCount).collect(Collectors.toList());
		}
		PagePo pagePo = new PagePo(count,pageSize,endPage,listPage);
		for (Invitation invitation : listPage) {
			System.out.println(invitation.getAuthor());
		}
		return pagePo;
	}

	private static Stream<Invitation> limit(int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
}
*/