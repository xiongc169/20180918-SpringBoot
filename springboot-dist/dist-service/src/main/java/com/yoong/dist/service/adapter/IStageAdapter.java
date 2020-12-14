package com.yoong.dist.service.adapter;

import com.yoong.dist.service.dubbo.dto.CommonParams;

/**
 * @Desc IStageAdapter
 * <p>
 * @Author yoong
 * <p>
 * @Date 2020-9-18
 * <p>
 * @Version 1.0
 */
public interface IStageAdapter<R, P> {

    R transformRequest(P param, CommonParams commonParams);

}
