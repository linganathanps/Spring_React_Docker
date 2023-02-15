package in.novoup.policyboss.insurance.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController("filter")
@Slf4j
public class FilterController {

    @GetMapping("/getTypes")
    public List<String> getType() {
        log.info("Inside the parent filter for the user :: {}", "testUser");
        return Arrays.asList("test");
    }
}
