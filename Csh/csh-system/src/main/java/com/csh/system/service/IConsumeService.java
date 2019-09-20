package com.csh.system.service;


import com.csh.system.domain.Consume;

import java.util.List;

/**
 * 消费记录 服务层
 *
 * @author ruoyi
 * @date 2019-08-22
 */

public interface IConsumeService {
    /**
     * 查询消费记录信息
     *
     * @param id 消费记录ID
     * @return 消费记录信息
     */
    public Consume selectConsumeById(Integer id);

    /**
     * 查询消费记录列表
     *
     * @param consume 消费记录信息
     * @return 消费记录集合
     */
    public List<Consume> selectConsumeList(Consume consume);

    /**
     * 新增消费记录
     *
     * @param consume 消费记录信息
     * @return 结果
     */
    public int insertConsume(Consume consume);

    /**
     * 修改消费记录
     *
     * @param consume 消费记录信息
     * @return 结果
     */
    public int updateConsume(Consume consume);

    /**
     * 删除消费记录信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteConsumeByIds(String ids);

}
