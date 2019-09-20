package com.csh.system.service.impl;

import java.util.List;

import com.csh.common.annotation.DataScope;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csh.system.mapper.TBalanceChangeMapper;
import com.csh.system.domain.TBalanceChange;
import com.csh.system.service.ITBalanceChangeService;
import com.csh.common.core.text.Convert;

/**
 * 会员余额的增加和减少 服务层实现
 *
 * @author csh
 * @date 2019-06-03
 */
@Service
public class TBalanceChangeServiceImpl implements ITBalanceChangeService
{
	@Autowired
	private TBalanceChangeMapper tBalanceChangeMapper;

	/**
	 * 查询会员余额的增加和减少信息
	 *
	 * @param id 会员余额的增加和减少ID
	 * @return 会员余额的增加和减少信息
	 */
	@Override
	public TBalanceChange selectTBalanceChangeById(Long id)
	{
		return tBalanceChangeMapper.selectTBalanceChangeById(id);
	}

	/**
	 * 查询会员余额的增加和减少列表
	 *
	 * @param tBalanceChange 会员余额的增加和减少信息
	 * @return 会员余额的增加和减少集合
	 */
	@Override
	@DataScope(tableAlias = "d")
	public List<TBalanceChange> selectTBalanceChangeList(TBalanceChange tBalanceChange)
	{
		return tBalanceChangeMapper.selectTBalanceChangeList(tBalanceChange);
	}

	/**
	 * 新增会员余额的增加和减少
	 *
	 * @param tBalanceChange 会员余额的增加和减少信息
	 * @return 结果
	 */
	@Override
	public int insertTBalanceChange(TBalanceChange tBalanceChange)
	{
		return tBalanceChangeMapper.insertTBalanceChange(tBalanceChange);
	}

	@Override
	public int updateTBalanceChangeByMemberNo(@Param("memberNoTwo") String memberNoTwo,@Param("memberNoOne") String memberNoOne)
	{
		return tBalanceChangeMapper.updateTBalanceChangeByMemberNo(memberNoTwo,memberNoOne);
	}

	/**
	 * 修改会员余额的增加和减少
	 *
	 * @param tBalanceChange 会员余额的增加和减少信息
	 * @return 结果
	 */
	@Override
	public int updateTBalanceChange(TBalanceChange tBalanceChange)
	{
		return tBalanceChangeMapper.updateTBalanceChange(tBalanceChange);
	}

	/**
	 * 删除会员余额的增加和减少对象
	 *
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	@Override
	public int deleteTBalanceChangeByIds(String ids)
	{
		return tBalanceChangeMapper.deleteTBalanceChangeByIds(Convert.toStrArray(ids));
	}

	@Override
	public TBalanceChange selectBalanceObject(@Param("memberNo") String memberNo) {
		return tBalanceChangeMapper.selectBalanceObject(memberNo);
	}



}
