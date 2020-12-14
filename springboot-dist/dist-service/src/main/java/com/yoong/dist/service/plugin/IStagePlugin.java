package com.yoong.dist.service.plugin;


import com.yoong.dist.service.dubbo.dto.CommonParams;

import java.util.Optional;

/**
 * @Desc IStagePlugin
 * <p>
 * @Author yoong
 * <p>
 * @Date 2020-9-18
 * <p>
 * @Version 1.0
 */
public interface IStagePlugin {

    Optional<String> apply(CommonParams commonParams);
}
