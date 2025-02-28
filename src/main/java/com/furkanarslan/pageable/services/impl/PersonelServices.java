package com.furkanarslan.pageable.services.impl;

import com.furkanarslan.pageable.dto.DtoDepartman;
import com.furkanarslan.pageable.dto.DtoPersonel;
import com.furkanarslan.pageable.entitiy.Personel;
import com.furkanarslan.pageable.repository.PersonelRepository;
import com.furkanarslan.pageable.services.IPersonelServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonelServices implements IPersonelServices {
    @Autowired
    private PersonelRepository personelRepository;

    @Override
    public Page<Personel> findAllPageable(Pageable pageable) {

        Page<Personel> page = personelRepository.findAllPageable(pageable);

        return page;
    }

    @Override
    public List<DtoPersonel> toDtoList(List<Personel> personelList) {

        List<DtoPersonel> dtoPersonelList = new ArrayList<>();

        for(Personel personel : personelList) {
            DtoPersonel dtoPersonel = new DtoPersonel();
            DtoDepartman dtoDepartman = new DtoDepartman();

            BeanUtils.copyProperties(personel,dtoPersonel);
            BeanUtils.copyProperties(personel.getDepartment(),dtoDepartman);
       dtoPersonel.setDepartman(dtoDepartman);
       dtoPersonelList.add(dtoPersonel);
return dtoPersonelList;
        }










        return List.of();
    }
}
