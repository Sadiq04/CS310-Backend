package kAi.Mobile.App.demo.BaseLog;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/baseLog") // Generic base path, can be overridden in child controllers
public abstract class BaseLogController<T extends BaseLog, ID, S extends BaseLogService<T, ID, ?>> {
    private final S service;

    @GetMapping("/{id}")
    public Optional<T> get(@PathVariable ID id){
        return service.getById(id);
    }

    @GetMapping("/all")
    public List<T> getAll(){
        return service.getAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody T log){
        service.create(log);
    }
}