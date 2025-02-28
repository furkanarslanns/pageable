package com.furkanarslan.pageable.services;

import com.furkanarslan.pageable.dto.DtoPersonel;
import com.furkanarslan.pageable.entitiy.Personel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPersonelServices {
    Page<Personel> findAllPageable(Pageable pageable);

    List<DtoPersonel>  toDtoList(List<Personel> personelList);

}
