package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 实验室信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-05 13:56:40
 */
@TableName("shiyanshixinxi")
public class ShiyanshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiyanshixinxiEntity() {
		
	}
	
	public ShiyanshixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 实验室名称
	 */
					
	private String shiyanshimingcheng;
	
	/**
	 * 实验室位置
	 */
					
	private String shiyanshiweizhi;
	
	/**
	 * 实验室规模
	 */
					
	private String shiyanshiguimo;
	
	/**
	 * 容纳人数
	 */
					
	private Integer rongnarenshu;
	
	/**
	 * 设备
	 */
					
	private String shebei;
	
	/**
	 * 设备数量
	 */
					
	private Integer shebeishuliang;
	
	/**
	 * 设施
	 */
					
	private String sheshi;
	
	/**
	 * 试剂
	 */
					
	private String shiji;
	
	/**
	 * 耗材
	 */
					
	private String haocai;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 实验室类型
	 */
					
	private String shiyanshileixing;
	
	/**
	 * 使用说明
	 */
					
	private String shiyongshuoming;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：实验室名称
	 */
	public void setShiyanshimingcheng(String shiyanshimingcheng) {
		this.shiyanshimingcheng = shiyanshimingcheng;
	}
	/**
	 * 获取：实验室名称
	 */
	public String getShiyanshimingcheng() {
		return shiyanshimingcheng;
	}
	/**
	 * 设置：实验室位置
	 */
	public void setShiyanshiweizhi(String shiyanshiweizhi) {
		this.shiyanshiweizhi = shiyanshiweizhi;
	}
	/**
	 * 获取：实验室位置
	 */
	public String getShiyanshiweizhi() {
		return shiyanshiweizhi;
	}
	/**
	 * 设置：实验室规模
	 */
	public void setShiyanshiguimo(String shiyanshiguimo) {
		this.shiyanshiguimo = shiyanshiguimo;
	}
	/**
	 * 获取：实验室规模
	 */
	public String getShiyanshiguimo() {
		return shiyanshiguimo;
	}
	/**
	 * 设置：容纳人数
	 */
	public void setRongnarenshu(Integer rongnarenshu) {
		this.rongnarenshu = rongnarenshu;
	}
	/**
	 * 获取：容纳人数
	 */
	public Integer getRongnarenshu() {
		return rongnarenshu;
	}
	/**
	 * 设置：设备
	 */
	public void setShebei(String shebei) {
		this.shebei = shebei;
	}
	/**
	 * 获取：设备
	 */
	public String getShebei() {
		return shebei;
	}
	/**
	 * 设置：设备数量
	 */
	public void setShebeishuliang(Integer shebeishuliang) {
		this.shebeishuliang = shebeishuliang;
	}
	/**
	 * 获取：设备数量
	 */
	public Integer getShebeishuliang() {
		return shebeishuliang;
	}
	/**
	 * 设置：设施
	 */
	public void setSheshi(String sheshi) {
		this.sheshi = sheshi;
	}
	/**
	 * 获取：设施
	 */
	public String getSheshi() {
		return sheshi;
	}
	/**
	 * 设置：试剂
	 */
	public void setShiji(String shiji) {
		this.shiji = shiji;
	}
	/**
	 * 获取：试剂
	 */
	public String getShiji() {
		return shiji;
	}
	/**
	 * 设置：耗材
	 */
	public void setHaocai(String haocai) {
		this.haocai = haocai;
	}
	/**
	 * 获取：耗材
	 */
	public String getHaocai() {
		return haocai;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：实验室类型
	 */
	public void setShiyanshileixing(String shiyanshileixing) {
		this.shiyanshileixing = shiyanshileixing;
	}
	/**
	 * 获取：实验室类型
	 */
	public String getShiyanshileixing() {
		return shiyanshileixing;
	}
	/**
	 * 设置：使用说明
	 */
	public void setShiyongshuoming(String shiyongshuoming) {
		this.shiyongshuoming = shiyongshuoming;
	}
	/**
	 * 获取：使用说明
	 */
	public String getShiyongshuoming() {
		return shiyongshuoming;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
