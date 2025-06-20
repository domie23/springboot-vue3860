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


import com.dao.CaijifenxiDao;
import com.entity.CaijifenxiEntity;
import com.service.CaijifenxiService;
import com.entity.vo.CaijifenxiVO;
import com.entity.view.CaijifenxiView;

@Service("caijifenxiService")
public class CaijifenxiServiceImpl extends ServiceImpl<CaijifenxiDao, CaijifenxiEntity> implements CaijifenxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaijifenxiEntity> page = this.selectPage(
                new Query<CaijifenxiEntity>(params).getPage(),
                new EntityWrapper<CaijifenxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaijifenxiEntity> wrapper) {
		  Page<CaijifenxiView> page =new Query<CaijifenxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaijifenxiVO> selectListVO(Wrapper<CaijifenxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaijifenxiVO selectVO(Wrapper<CaijifenxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaijifenxiView> selectListView(Wrapper<CaijifenxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaijifenxiView selectView(Wrapper<CaijifenxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
