package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CaijishujuEntity;
import com.entity.view.CaijishujuView;

import com.service.CaijishujuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 采集数据
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
@RestController
@RequestMapping("/caijishuju")
public class CaijishujuController {
    @Autowired
    private CaijishujuService caijishujuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CaijishujuEntity caijishuju,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("caijiyuan")) {
			caijishuju.setCaijiyuangonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			caijishuju.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<CaijishujuEntity> ew = new EntityWrapper<CaijishujuEntity>();
		PageUtils page = caijishujuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, caijishuju), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CaijishujuEntity caijishuju, 
		HttpServletRequest request){
        EntityWrapper<CaijishujuEntity> ew = new EntityWrapper<CaijishujuEntity>();
		PageUtils page = caijishujuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, caijishuju), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CaijishujuEntity caijishuju){
       	EntityWrapper<CaijishujuEntity> ew = new EntityWrapper<CaijishujuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( caijishuju, "caijishuju")); 
        return R.ok().put("data", caijishujuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CaijishujuEntity caijishuju){
        EntityWrapper< CaijishujuEntity> ew = new EntityWrapper< CaijishujuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( caijishuju, "caijishuju")); 
		CaijishujuView caijishujuView =  caijishujuService.selectView(ew);
		return R.ok("查询采集数据成功").put("data", caijishujuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CaijishujuEntity caijishuju = caijishujuService.selectById(id);
        return R.ok().put("data", caijishuju);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CaijishujuEntity caijishuju = caijishujuService.selectById(id);
        return R.ok().put("data", caijishuju);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CaijishujuEntity caijishuju, HttpServletRequest request){
    	caijishuju.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(caijishuju);
        caijishujuService.insert(caijishuju);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CaijishujuEntity caijishuju, HttpServletRequest request){
    	caijishuju.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(caijishuju);
        caijishujuService.insert(caijishuju);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CaijishujuEntity caijishuju, HttpServletRequest request){
        //ValidatorUtils.validateEntity(caijishuju);
        caijishujuService.updateById(caijishuju);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        caijishujuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<CaijishujuEntity> wrapper = new EntityWrapper<CaijishujuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("caijiyuan")) {
			wrapper.eq("caijiyuangonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = caijishujuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
