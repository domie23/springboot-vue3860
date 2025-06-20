package com.dao;

import com.entity.XingchengfenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XingchengfenxiVO;
import com.entity.view.XingchengfenxiView;


/**
 * 行程分析
 * 
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public interface XingchengfenxiDao extends BaseMapper<XingchengfenxiEntity> {
	
	List<XingchengfenxiVO> selectListVO(@Param("ew") Wrapper<XingchengfenxiEntity> wrapper);
	
	XingchengfenxiVO selectVO(@Param("ew") Wrapper<XingchengfenxiEntity> wrapper);
	
	List<XingchengfenxiView> selectListView(@Param("ew") Wrapper<XingchengfenxiEntity> wrapper);

	List<XingchengfenxiView> selectListView(Pagination page,@Param("ew") Wrapper<XingchengfenxiEntity> wrapper);
	
	XingchengfenxiView selectView(@Param("ew") Wrapper<XingchengfenxiEntity> wrapper);
	

}
