package com.yoong.dist.service.filter;

import javax.servlet.http.HttpServletRequest;

/**
 * @Desc IStageFilter
 * <p>
 * @Author yoong
 * <p>
 * @Date 2020-9-18
 * <p>
 * @Version 1.0
 */
public interface IStageFilter<R, P> {

    R onRequest(P param, HttpServletRequest servletRequest);

}
