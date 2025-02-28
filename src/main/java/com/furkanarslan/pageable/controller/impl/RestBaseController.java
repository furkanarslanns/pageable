package com.furkanarslan.pageable.controller.impl;

import com.furkanarslan.pageable.utils.PagerUtil;
import com.furkanarslan.pageable.utils.RestPageableEntitiy;
import com.furkanarslan.pageable.utils.RestPageableRequest;
import com.furkanarslan.pageable.utils.RestRootEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class RestBaseController {

    public Pageable toPageable(RestPageableRequest request) {

        return PagerUtil.toPageable(request);
    }

  public <T> RestPageableEntitiy<T> toPageableResponse(Page<?> page, List<T> content) {
     return PagerUtil.toPageableResponse(page ,content);
  }
    public static <T> RestRootEntity<T> ok(T payload) {
        return  RestRootEntity.ok(payload);
    }




}
