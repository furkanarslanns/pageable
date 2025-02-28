package com.furkanarslan.pageable.utils;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class RestRootEntity<T> {
    private int status;

    private T payload;

    private String errorMessage;

    public static <T> RestRootEntity<T> ok(T payload) {
        RestRootEntity<T> restRootEntity = new RestRootEntity<>();
        restRootEntity.setPayload(payload);
        restRootEntity.setErrorMessage(null);
        restRootEntity.setStatus(HttpStatus.OK.value());
        return restRootEntity;
    }


}
