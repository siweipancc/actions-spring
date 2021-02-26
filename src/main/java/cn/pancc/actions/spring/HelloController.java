package cn.pancc.actions.spring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("hello")
@RestController
public class HelloController {

    @GetMapping
    public ResponseEntity<Map<?, ?>> hello() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("data", "hello");

        return ResponseEntity.ok(map);
    }

}
