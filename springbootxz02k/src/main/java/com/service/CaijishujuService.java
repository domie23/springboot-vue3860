package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaijishujuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaijishujuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaijishujuView;


/**
 * 采集数据
 *
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public interface CaijishujuService extends IService<CaijishujuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaijishujuVO> selectListVO(Wrapper<CaijishujuEntity> wrapper);
   	
   	CaijishujuVO selectVO(@Param("ew") Wrapper<CaijishujuEntity> wrapper);
   	
   	List<CaijishujuView> selectListView(Wrapper<CaijishujuEntity> wrapper);
   	
   	CaijishujuView selectView(@Param("ew") Wrapper<CaijishujuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaijishujuEntity> wrapper);
   	

}

