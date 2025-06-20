package com.entity.view;

import com.entity.YonghuxingchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户行程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
@TableName("yonghuxingcheng")
public class YonghuxingchengView  extends YonghuxingchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuxingchengView(){
	}
 
 	public YonghuxingchengView(YonghuxingchengEntity yonghuxingchengEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuxingchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
