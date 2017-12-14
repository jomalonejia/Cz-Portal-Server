package com.cz.user.controller;

        import com.baomidou.mybatisplus.mapper.EntityWrapper;
        import com.cz.user.domain.Address;
        import com.cz.user.service.AddressService;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
        import org.springframework.security.access.prepost.PreAuthorize;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

/**
 * Created by jomalone_jia on 2017/11/20.
 */
@RestController
@RequestMapping("/address")
public class AddressController {

    private static final Logger _log = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private AddressService addressService;

    @GetMapping("/get/{username}")
    @PreAuthorize("isAuthenticated()")
    public Object get(@PathVariable String username){
        try {

            List<Address> results = addressService.selectList(new EntityWrapper<Address>().eq("username", username));
            _log.info(results.toString());
            return results;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/add")
    @PreAuthorize("isAuthenticated()")
    public Object add(@RequestBody Address address){
        try {
            return addressService.insert(address);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/update")
    @PreAuthorize("isAuthenticated()")
    public Object update(@RequestBody Address address){
        try {
            return addressService.updateById(address);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().build();
    }
}
