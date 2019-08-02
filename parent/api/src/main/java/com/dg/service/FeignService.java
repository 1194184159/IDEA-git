package com.dg.service;

import com.dg.pojo.TAdmin;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "server01")
public interface FeignService {

    @GetMapping(value = "/admin/{id}")
    public TAdmin getTAdminById(@PathVariable("id") String id);
}
