package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZonghepingguDao;
import com.entity.ZonghepingguEntity;
import com.service.ZonghepingguService;
import com.entity.vo.ZonghepingguVO;
import com.entity.view.ZonghepingguView;

@Service("zonghepingguService")
public class ZonghepingguServiceImpl extends ServiceImpl<ZonghepingguDao, ZonghepingguEntity> implements ZonghepingguService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZonghepingguEntity> page = this.selectPage(
                new Query<ZonghepingguEntity>(params).getPage(),
                new EntityWrapper<ZonghepingguEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZonghepingguEntity> wrapper) {
		  Page<ZonghepingguView> page =new Query<ZonghepingguView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZonghepingguVO> selectListVO(Wrapper<ZonghepingguEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZonghepingguVO selectVO(Wrapper<ZonghepingguEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZonghepingguView> selectListView(Wrapper<ZonghepingguEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZonghepingguView selectView(Wrapper<ZonghepingguEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
