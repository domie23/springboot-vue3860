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


import com.dao.CaijishujuDao;
import com.entity.CaijishujuEntity;
import com.service.CaijishujuService;
import com.entity.vo.CaijishujuVO;
import com.entity.view.CaijishujuView;

@Service("caijishujuService")
public class CaijishujuServiceImpl extends ServiceImpl<CaijishujuDao, CaijishujuEntity> implements CaijishujuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaijishujuEntity> page = this.selectPage(
                new Query<CaijishujuEntity>(params).getPage(),
                new EntityWrapper<CaijishujuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaijishujuEntity> wrapper) {
		  Page<CaijishujuView> page =new Query<CaijishujuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaijishujuVO> selectListVO(Wrapper<CaijishujuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaijishujuVO selectVO(Wrapper<CaijishujuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaijishujuView> selectListView(Wrapper<CaijishujuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaijishujuView selectView(Wrapper<CaijishujuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
