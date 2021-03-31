package com.hystrix.feign;

import com.hystrix.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/api/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/api/student/index")
    public String index();
}
