package com.entity.model;

import com.entity.YonghuxingchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用户行程
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public class YonghuxingchengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 行程码
	 */
	
	private String xingchengma;
		
	/**
	 * 核酸码
	 */
	
	private String hesuanma;
		
	/**
	 * 外出地
	 */
	
	private String waichudi;
		
	/**
	 * 行程登记
	 */
	
	private String xingchengdengji;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
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
	 * 设置：行程码
	 */
	 
	public void setXingchengma(String xingchengma) {
		this.xingchengma = xingchengma;
	}
	
	/**
	 * 获取：行程码
	 */
	public String getXingchengma() {
		return xingchengma;
	}
				
	
	/**
	 * 设置：核酸码
	 */
	 
	public void setHesuanma(String hesuanma) {
		this.hesuanma = hesuanma;
	}
	
	/**
	 * 获取：核酸码
	 */
	public String getHesuanma() {
		return hesuanma;
	}
				
	
	/**
	 * 设置：外出地
	 */
	 
	public void setWaichudi(String waichudi) {
		this.waichudi = waichudi;
	}
	
	/**
	 * 获取：外出地
	 */
	public String getWaichudi() {
		return waichudi;
	}
				
	
	/**
	 * 设置：行程登记
	 */
	 
	public void setXingchengdengji(String xingchengdengji) {
		this.xingchengdengji = xingchengdengji;
	}
	
	/**
	 * 获取：行程登记
	 */
	public String getXingchengdengji() {
		return xingchengdengji;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
