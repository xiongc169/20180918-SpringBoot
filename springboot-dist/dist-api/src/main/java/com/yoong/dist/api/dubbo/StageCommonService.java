package com.yoong.dist.api.dubbo;

import java.util.Optional;

/**
 * @Desc dubbo接口类
 * <p>
 * @Author yoong
 * <p>
 * @Date 2020-9-18
 * <p>
 * @Version 1.0
 */
public interface StageCommonService {

    Optional<String> applyCredit(Long creditId);
}
