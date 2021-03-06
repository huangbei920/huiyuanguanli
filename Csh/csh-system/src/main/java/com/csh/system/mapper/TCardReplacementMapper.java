package com.csh.system.mapper;

import com.csh.system.domain.TCardReplacement;
import java.util.List;

/**
 * 补卡记录 数据层
 *
 * @author csh
 * @date 2019-06-03
 */
public interface TCardReplacementMapper
{
	/**
	 * 查询补卡记录信息
	 *
	 * @param id 补卡记录ID
	 * @return 补卡记录信息
	 */
	public TCardReplacement selectTCardReplacementById(Integer id);

	/**
	 * 查询补卡记录列表
	 *
	 * @param tCardReplacement 补卡记录信息
	 * @return 补卡记录集合
	 */
	public List<TCardReplacement> selectTCardReplacementList(TCardReplacement tCardReplacement);

	/**
	 * 新增补卡记录
	 *
	 * @param tCardReplacement 补卡记录信息
	 * @return 结果
	 */
	public int insertTCardReplacement(TCardReplacement tCardReplacement);

	/**
	 * 修改补卡记录
	 *
	 * @param tCardReplacement 补卡记录信息
	 * @return 结果
	 */
	public int updateTCardReplacement(TCardReplacement tCardReplacement);

	/**
	 * 删除补卡记录
	 *
	 * @param id 补卡记录ID
	 * @return 结果
	 */
	public int deleteTCardReplacementById(Integer id);

	/**
	 * 批量删除补卡记录
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	public int deleteTCardReplacementByIds(String[] ids);

}