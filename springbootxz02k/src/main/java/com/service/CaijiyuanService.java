package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaijiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaijiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaijiyuanView;


/**
 * 采集员
 *
 * @author 
 * @email 
 * @date 2022-04-14 15:56:34
 */
public interface CaijiyuanService extends IService<CaijiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaijiyuanVO> selectListVO(Wrapper<CaijiyuanEntity> wrapper);
   	
   	CaijiyuanVO selectVO(@Param("ew") Wrapper<CaijiyuanEntity> wrapper);
   	
   	List<CaijiyuanView> selectListView(Wrapper<CaijiyuanEntity> wrapper);
   	
   	CaijiyuanView selectView(@Param("ew") Wrapper<CaijiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaijiyuanEntity> wrapper);
   	

}

