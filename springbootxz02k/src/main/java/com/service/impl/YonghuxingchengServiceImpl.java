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


import com.dao.YonghuxingchengDao;
import com.entity.YonghuxingchengEntity;
import com.service.YonghuxingchengService;
import com.entity.vo.YonghuxingchengVO;
import com.entity.view.YonghuxingchengView;

@Service("yonghuxingchengService")
public class YonghuxingchengServiceImpl extends ServiceImpl<YonghuxingchengDao, YonghuxingchengEntity> implements YonghuxingchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuxingchengEntity> page = this.selectPage(
                new Query<YonghuxingchengEntity>(params).getPage(),
                new EntityWrapper<YonghuxingchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuxingchengEntity> wrapper) {
		  Page<YonghuxingchengView> page =new Query<YonghuxingchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuxingchengVO> selectListVO(Wrapper<YonghuxingchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuxingchengVO selectVO(Wrapper<YonghuxingchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuxingchengView> selectListView(Wrapper<YonghuxingchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuxingchengView selectView(Wrapper<YonghuxingchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
