package com.imooc.demo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imooc.demo.dao.AreaDao;
import com.imooc.demo.entity.Area;
import com.imooc.demo.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaDao areaDao;

	@Override
	public List<Area> getAreaList() {
		// 返回所有的信息
		return areaDao.queryArea();
	}

	@Override
	public Area getAreaById(int Id) {
		return areaDao.queryAreaById(Id);
	}

	@Transactional
	@Override
	public boolean addArea(Area area) {
		// 空值判断，主要是判断areaName不为空
		if (area.getnName() != null && !"".equals(area.getnName())) {
			// 设置默认值
			area.setA_num(20180098);
			area.setAname("中南海公寓");
			area.setN_num(110);
			area.setnName("刘三金");
			try {
				int effectedNum = areaDao.insertArea(area);
				if (effectedNum > 0) {
					return true;
				} else {
					throw new RuntimeException("添加信息失败!");
				}
			} catch (Exception e) {
				throw new RuntimeException("添加信息失败:" + e.toString());
			}
		} else {
			throw new RuntimeException("信息不能为空！");
		}
	}

	@Transactional
	@Override
	public boolean modifyArea(Area area) {
		// 空值判断，主要是areaId不为空
		if (area.getId() != null && area.getId() > 0) {
			// 设置默认值
			area.setnName("爱兜");
			try {
				// 更新区域信息
				int effectedNum = areaDao.updateArea(area);
				if (effectedNum > 0) {
					return true;
				} else {
					throw new RuntimeException("更新信息失败!");
				}
			} catch (Exception e) {
				throw new RuntimeException("更新信息失败:" + e.toString());
			}
		} else {
			throw new RuntimeException("信息不能为空！");
		}
	}

	@Transactional
	@Override
	public boolean deleteArea(int Id) {
		if (Id > 0) {
			try {
				// 删除区域信息
				int effectedNum = areaDao.deleteArea(Id);
				if (effectedNum > 0) {
					return true;
				} else {
					throw new RuntimeException("删除信息失败!");
				}
			} catch (Exception e) {
				throw new RuntimeException("删除信息失败:" + e.toString());
			}
		} else {
			throw new RuntimeException("Id不能为空！");
		}
	}
}
