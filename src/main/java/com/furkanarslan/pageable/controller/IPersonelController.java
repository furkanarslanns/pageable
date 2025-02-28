package com.furkanarslan.pageable.controller;

import com.furkanarslan.pageable.dto.DtoPersonel;
import com.furkanarslan.pageable.utils.RestPageableEntitiy;
import com.furkanarslan.pageable.utils.RestPageableRequest;
import com.furkanarslan.pageable.utils.RestRootEntity;

public interface IPersonelController {

 public RestRootEntity<RestPageableEntitiy<DtoPersonel>> findAllPageable(RestPageableRequest pageable);


}
