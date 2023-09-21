package com.coforge.demo.Ec;

import com.coforge.demo.model.AddressResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface AddServices {
    @GetMapping("/address/{empId}")
    public AddressResponse AddService(@PathVariable int empId);
}
