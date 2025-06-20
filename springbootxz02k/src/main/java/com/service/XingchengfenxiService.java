package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XingchengfenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XingchengfenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XingchengfenxiView;


/**
 * 行程分析
 *
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public interface XingchengfenxiService extends IService<XingchengfenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XingchengfenxiVO> selectListVO(Wrapper<XingchengfenxiEntity> wrapper);
   	
   	XingchengfenxiVO selectVO(@Param("ew") Wrapper<XingchengfenxiEntity> wrapper);
   	
   	List<XingchengfenxiView> selectListView(Wrapper<XingchengfenxiEntity> wrapper);
   	
   	XingchengfenxiView selectView(@Param("ew") Wrapper<XingchengfenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XingchengfenxiEntity> wrapper);
   	

}

