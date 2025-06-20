package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaijifenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaijifenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaijifenxiView;


/**
 * 采集分析
 *
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public interface CaijifenxiService extends IService<CaijifenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaijifenxiVO> selectListVO(Wrapper<CaijifenxiEntity> wrapper);
   	
   	CaijifenxiVO selectVO(@Param("ew") Wrapper<CaijifenxiEntity> wrapper);
   	
   	List<CaijifenxiView> selectListView(Wrapper<CaijifenxiEntity> wrapper);
   	
   	CaijifenxiView selectView(@Param("ew") Wrapper<CaijifenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaijifenxiEntity> wrapper);
   	

}

