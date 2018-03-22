package com.cloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @project:spring-cloud
 * @package:com.cloud.filter
 * @create_date:2018/3/21 10:47
 * @author:Subtimental
 * @description:TODO
 */
@Component
public class MyFilter extends ZuulFilter{

    private final Logger logger= LoggerFactory.getLogger(getClass());

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("%s>>>>>>>%s",request.getMethod(),request.getRequestURL().toString()));
        String token = request.getParameter("token");
        if (token==null){
            logger.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
            }
            return null;
        }
        logger.info("ok");
        return null;
    }
}
