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


import com.dao.XingchengfenxiDao;
import com.entity.XingchengfenxiEntity;
import com.service.XingchengfenxiService;
import com.entity.vo.XingchengfenxiVO;
import com.entity.view.XingchengfenxiView;

@Service("xingchengfenxiService")
public class XingchengfenxiServiceImpl extends ServiceImpl<XingchengfenxiDao, XingchengfenxiEntity> implements XingchengfenxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XingchengfenxiEntity> page = this.selectPage(
                new Query<XingchengfenxiEntity>(params).getPage(),
                new EntityWrapper<XingchengfenxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XingchengfenxiEntity> wrapper) {
		  Page<XingchengfenxiView> page =new Query<XingchengfenxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XingchengfenxiVO> selectListVO(Wrapper<XingchengfenxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XingchengfenxiVO selectVO(Wrapper<XingchengfenxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XingchengfenxiView> selectListView(Wrapper<XingchengfenxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XingchengfenxiView selectView(Wrapper<XingchengfenxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
