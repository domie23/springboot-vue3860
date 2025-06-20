package com.entity.model;

import com.entity.CaijishujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 采集数据
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public class CaijishujuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 采集员姓名
	 */
	
	private String caijiyuanxingming;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
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
	 * 详细行程
	 */
	
	private String xiangxixingcheng;
		
	/**
	 * 用户行程
	 */
	
	private String yonghuxingcheng;
		
	/**
	 * 核酸码
	 */
	
	private String hesuanma;
		
	/**
	 * 行程码
	 */
	
	private String xingchengma;
		
	/**
	 * 外出地
	 */
	
	private String waichudi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 采集日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date caijiriqi;
				
	
	/**
	 * 设置：采集员姓名
	 */
	 
	public void setCaijiyuanxingming(String caijiyuanxingming) {
		this.caijiyuanxingming = caijiyuanxingming;
	}
	
	/**
	 * 获取：采集员姓名
	 */
	public String getCaijiyuanxingming() {
		return caijiyuanxingming;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
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
	 * 设置：详细行程
	 */
	 
	public void setXiangxixingcheng(String xiangxixingcheng) {
		this.xiangxixingcheng = xiangxixingcheng;
	}
	
	/**
	 * 获取：详细行程
	 */
	public String getXiangxixingcheng() {
		return xiangxixingcheng;
	}
				
	
	/**
	 * 设置：用户行程
	 */
	 
	public void setYonghuxingcheng(String yonghuxingcheng) {
		this.yonghuxingcheng = yonghuxingcheng;
	}
	
	/**
	 * 获取：用户行程
	 */
	public String getYonghuxingcheng() {
		return yonghuxingcheng;
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
	 * 设置：采集日期
	 */
	 
	public void setCaijiriqi(Date caijiriqi) {
		this.caijiriqi = caijiriqi;
	}
	
	/**
	 * 获取：采集日期
	 */
	public Date getCaijiriqi() {
		return caijiriqi;
	}
			
}
