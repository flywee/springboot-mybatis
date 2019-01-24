package com.imooc.demo.dao;

import java.util.List;

import com.imooc.demo.entity.Area;

public interface AreaDao {
	/**
	 * 列出列表
	 * 
	 * @return areaList
	 */
	List<Area> queryArea();

	/**
	 * 根据Id列出具体信息
	 * 
	 * @return area
	 */
	Area queryAreaById(int Id);

	/**
	 * 插入信息
	 * 
	 * @param area
	 * @return
	 */
	int insertArea(Area area);

	/**
	 * 更新信息
	 * 
	 * @param area
	 * @return
	 */
	int updateArea(Area area);

	/**
	 * 删除信息
	 * 
	 * @param areaId
	 * @return
	 */
	int deleteArea(int Id);
}
