package com.lm2a.junit.service;


import com.lm2a.junit.domain.SmartWatch;


import java.util.List;

public interface SmartWatchService {

    Integer count();

    List<SmartWatch> findAll();

    SmartWatch findOne(Long id);

    SmartWatch save(SmartWatch user);

    boolean delete(Long id);

    void deleteAll();
}
