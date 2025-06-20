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


import com.dao.FenxiyuanDao;
import com.entity.FenxiyuanEntity;
import com.service.FenxiyuanService;
import com.entity.vo.FenxiyuanVO;
import com.entity.view.FenxiyuanView;

@Service("fenxiyuanService")
public class FenxiyuanServiceImpl extends ServiceImpl<FenxiyuanDao, FenxiyuanEntity> implements FenxiyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenxiyuanEntity> page = this.selectPage(
                new Query<FenxiyuanEntity>(params).getPage(),
                new EntityWrapper<FenxiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenxiyuanEntity> wrapper) {
		  Page<FenxiyuanView> page =new Query<FenxiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FenxiyuanVO> selectListVO(Wrapper<FenxiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenxiyuanVO selectVO(Wrapper<FenxiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenxiyuanView> selectListView(Wrapper<FenxiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenxiyuanView selectView(Wrapper<FenxiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
