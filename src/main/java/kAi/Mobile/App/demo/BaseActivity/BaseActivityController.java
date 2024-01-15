package kAi.Mobile.App.demo.BaseActivity;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/baseActivity") // Generic base path, can be overridden in child controllers
public abstract class BaseActivityController<T extends BaseActivity, ID, S extends BaseActivityService<T, ID, ?>> {
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
    public void create(@RequestBody T activity){
        service.create(activity);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ID id){
        service.delete(id);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody T newActivity, @PathVariable ID id){
        service.update(newActivity, id);
    }
}
