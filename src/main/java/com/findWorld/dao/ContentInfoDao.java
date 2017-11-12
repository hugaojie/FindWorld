package com.findWorld.dao;

import java.util.List;

import com.findWorld.bean.ContentInfo;

public interface ContentInfoDao {
	/**
	 * 初始化查询Home页Blog内容展示
	 * */
	public List<ContentInfo> initHomeAllContent();

}
