package ru.cifrabank;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {

    private final ConfigService configService;

    public ValueController(ConfigService configService) {
        this.configService = configService;
    }

    @GetMapping("/show")
    public ResponseEntity<String> show() {
        String props = configService.showProps();
        return ResponseEntity.ok(props);
    }
}
