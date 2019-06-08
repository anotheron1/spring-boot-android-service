package com.example.repository;

import com.example.domain.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface InteractionRepository extends JpaRepository<Interaction, String> {
    @Query("select b from Interaction b where b.caffe_id = :caffe_id and b.client_id = :client_id")
    Interaction findByCaffe_id(@Param("caffe_id") String caffe_id, @Param("client_id") String client_id);

//    Interaction findById(Long id);

//    @Transactional
//    @Modifying
//    @Query("update Interaction set all_cup=:all_cup, caffe_id=:caffe_id1, client_id=:client_id1, client_qr=:client_qr, fill_cup=:fill_cup where id=:id")
//    int updateFill_Cup(@Param("all_cup") String all_cup, @Param("caffe_id1") String caffe_id1, @Param("client_id1") String client_id1, @Param("client_qr") String client_qr, @Param("fill_cup") String fill_cup, @Param("id") String id);
}
