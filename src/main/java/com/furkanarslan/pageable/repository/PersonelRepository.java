package com.furkanarslan.pageable.repository;

import com.furkanarslan.pageable.entitiy.Personel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelRepository extends JpaRepository<Personel, Long> {


   @Query(value = "select p from  Personel p")
    Page<Personel> findAllPageable(Pageable pageable);



}
