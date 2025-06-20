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


import com.dao.CaijiyuanDao;
import com.entity.CaijiyuanEntity;
import com.service.CaijiyuanService;
import com.entity.vo.CaijiyuanVO;
import com.entity.view.CaijiyuanView;

@Service("caijiyuanService")
public class CaijiyuanServiceImpl extends ServiceImpl<CaijiyuanDao, CaijiyuanEntity> implements CaijiyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaijiyuanEntity> page = this.selectPage(
                new Query<CaijiyuanEntity>(params).getPage(),
                new EntityWrapper<CaijiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaijiyuanEntity> wrapper) {
		  Page<CaijiyuanView> page =new Query<CaijiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaijiyuanVO> selectListVO(Wrapper<CaijiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaijiyuanVO selectVO(Wrapper<CaijiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaijiyuanView> selectListView(Wrapper<CaijiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaijiyuanView selectView(Wrapper<CaijiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
