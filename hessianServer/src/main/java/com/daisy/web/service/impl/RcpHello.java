package com.daisy.web.service.impl;

import com.daisy.web.service.IRcpHello;
import org.springframework.stereotype.Service;

/**
 * @Name com.daisy.web.service.impl.RcpHello
 * @Description
 * @Author qianna
 * @Version 2017/5/4 18:27
 * @Copyright 上海云辰信息科技有限公司
 */
@Service("rcpHello")
public class RcpHello implements IRcpHello {
    public String sayHello(String inStr) {
        return "from Server response to:"+inStr+",response content";
    }
}
