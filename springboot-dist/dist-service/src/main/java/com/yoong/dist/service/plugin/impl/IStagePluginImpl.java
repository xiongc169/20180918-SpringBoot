package com.yoong.dist.service.plugin.impl;

import com.yoong.dist.service.dubbo.dto.CommonParams;
import com.yoong.dist.service.plugin.IStagePlugin;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Desc IStagePluginImpl
 * <p>
 * @Author yoong
 * <p>
 * @Date 2020-9-18
 * <p>
 * @Version 1.0
 */
@Component
public class IStagePluginImpl implements IStagePlugin {


    @Override
    public Optional<String> apply(CommonParams commonParams) {
        return Optional.empty();
    }
}
