package com.furkanarslan.pageable.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RestPageableEntitiy<T> {

private List<T> content;
private  int pageNumber;

private int pageSize;

private long totolElements;






}
