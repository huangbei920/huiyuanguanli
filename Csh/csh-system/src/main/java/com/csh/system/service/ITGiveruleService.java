package com.csh.system.service;

import com.csh.system.domain.TGiverule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 奖励规则 服务层
 * 
 * @author csh
 * @date 2019-07-12
 */
public interface ITGiveruleService 
{
	/**
     * 查询奖励规则信息
     * 
     * @param id 奖励规则ID
     * @return 奖励规则信息
     */
	public TGiverule selectTGiveruleById(Integer id);

	public List<TGiverule> selectTGiveruleByCompanyidAndCardType(@Param("companyid")Integer companyid, @Param("cardtype")Integer cardtype);
	/**
     * 查询奖励规则列表
     * 
     * @param tGiverule 奖励规则信息
     * @return 奖励规则集合
     */
	public List<TGiverule> selectTGiveruleList(TGiverule tGiverule);
	
	/**
     * 新增奖励规则
     * 
     * @param tGiverule 奖励规则信息
     * @return 结果
     */
	public int insertTGiverule(TGiverule tGiverule);
	
	/**
     * 修改奖励规则
     * 
     * @param tGiverule 奖励规则信息
     * @return 结果
     */
	public int updateTGiverule(TGiverule tGiverule);
		
	/**
     * 删除奖励规则信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTGiveruleByIds(String ids);
	
}
