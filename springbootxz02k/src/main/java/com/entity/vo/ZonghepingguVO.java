package com.entity.vo;

import com.entity.ZonghepingguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 综合评估
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public class ZonghepingguVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 风险评估
	 */
	
	private String fengxianpinggu;
		
	/**
	 * 预警
	 */
	
	private String yujing;
		
	/**
	 * 处理情况
	 */
	
	private String chuliqingkuang;
		
	/**
	 * 评估日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingguriqi;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：风险评估
	 */
	 
	public void setFengxianpinggu(String fengxianpinggu) {
		this.fengxianpinggu = fengxianpinggu;
	}
	
	/**
	 * 获取：风险评估
	 */
	public String getFengxianpinggu() {
		return fengxianpinggu;
	}
				
	
	/**
	 * 设置：预警
	 */
	 
	public void setYujing(String yujing) {
		this.yujing = yujing;
	}
	
	/**
	 * 获取：预警
	 */
	public String getYujing() {
		return yujing;
	}
				
	
	/**
	 * 设置：处理情况
	 */
	 
	public void setChuliqingkuang(String chuliqingkuang) {
		this.chuliqingkuang = chuliqingkuang;
	}
	
	/**
	 * 获取：处理情况
	 */
	public String getChuliqingkuang() {
		return chuliqingkuang;
	}
				
	
	/**
	 * 设置：评估日期
	 */
	 
	public void setPingguriqi(Date pingguriqi) {
		this.pingguriqi = pingguriqi;
	}
	
	/**
	 * 获取：评估日期
	 */
	public Date getPingguriqi() {
		return pingguriqi;
	}
			
}
