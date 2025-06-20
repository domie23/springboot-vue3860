package com.entity.view;

import com.entity.CaijifenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 采集分析
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
@TableName("caijifenxi")
public class CaijifenxiView  extends CaijifenxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaijifenxiView(){
	}
 
 	public CaijifenxiView(CaijifenxiEntity caijifenxiEntity){
 	try {
			BeanUtils.copyProperties(this, caijifenxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
