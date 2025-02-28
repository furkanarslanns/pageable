package com.furkanarslan.pageable.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestPageableRequest {

    private int pageNumber;
    private int pageSize;
    private String columnName;
    private Boolean isAsc;




}
