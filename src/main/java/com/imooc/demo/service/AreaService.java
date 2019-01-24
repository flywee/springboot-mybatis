package com.imooc.demo.service;

import java.util.List;

import com.imooc.demo.entity.Area;

public interface AreaService {

	/**
	 * 获取列表
	 * 
	 * @return
	 */
	List<Area> getAreaList();

	/**
	 * 通过区域Id获取信息
	 * 
	 * @param Id
	 * @return
	 */
	Area getAreaById(int Id);

	/**
	 * 增加信息
	 * 
	 * @param area
	 * @return
	 */
	boolean addArea(Area area);

	/**
	 * 修改信息
	 * 
	 * @param area
	 * @return
	 */
	boolean modifyArea(Area area);

	/**
	 * 删除信息
	 * 
	 * @param area
	 * @return
	 */
	boolean deleteArea(int Id);

}
