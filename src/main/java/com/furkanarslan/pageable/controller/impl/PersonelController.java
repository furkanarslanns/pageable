package com.furkanarslan.pageable.controller.impl;

import com.furkanarslan.pageable.controller.IPersonelController;
import com.furkanarslan.pageable.dto.DtoPersonel;
import com.furkanarslan.pageable.entitiy.Personel;
import com.furkanarslan.pageable.services.impl.PersonelServices;
import com.furkanarslan.pageable.utils.RestPageableEntitiy;
import com.furkanarslan.pageable.utils.RestPageableRequest;
import com.furkanarslan.pageable.utils.RestRootEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/personel")
public class PersonelController extends RestBaseController implements IPersonelController {

    @Autowired
    PersonelServices personelServices;
    @GetMapping("/list/pageable")
    @Override
    public RestRootEntity<RestPageableEntitiy<DtoPersonel>> findAllPageable(RestPageableRequest pageable) {


        Page<Personel> page  = personelServices.findAllPageable(toPageable(pageable));
       RestPageableEntitiy<DtoPersonel> pageableResponse = toPageableResponse(page , personelServices.toDtoList(page.getContent()));

return ok(pageableResponse);
    }
}
