package com.furkanarslan.pageable.utils;

import lombok.experimental.UtilityClass;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@UtilityClass
public class PagerUtil {

    public Boolean isNullorEmpty(String value) {
        return value == null || value.trim().length() == 0;
    }


   public Pageable toPageable(RestPageableRequest request) {

        if (!isNullorEmpty(request.getColumnName())) {
           Sort sortBy = request.getIsAsc() ? Sort.by(Sort.Direction.ASC, "id") : Sort.by(Sort.Direction.DESC, "id");

           return PageRequest.of(request.getPageNumber(), request.getPageSize(), sortBy);


        }
return PageRequest.of(request.getPageNumber(), request.getPageSize());
   }

    public <T> RestPageableEntitiy<T> toPageableResponse(Page<?> page, List<T> content) {
        RestPageableEntitiy<T> entity = new RestPageableEntitiy<>();
        entity.setContent(content);
        entity.setPageNumber(page.getPageable().getPageNumber());
        entity.setPageSize(page.getPageable().getPageSize());
        entity.setTotolElements(page.getTotalElements());

return entity;
    }



}
