package com.riwi.prueba.controller;

import com.riwi.prueba.Dto.mapper.LoadMapper;
import com.riwi.prueba.Dto.request.LoadRequestDto;
import com.riwi.prueba.model.Load;
import com.riwi.prueba.service.LoadService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/loads")
public class LoadController {

    @Autowired
    private LoadService loadService;

    @GetMapping()
    public List<Load> getAllLoad(){
        return loadService.getAllLoads();
    }

    @GetMapping("/${id}")
    public Optional<Load> getLoadById(@PathVariable Long id){
        return loadService.getLoadById(id);
    }

    @PostMapping("/${id}")
    public void createLoad(@RequestBody @Valid LoadRequestDto loadRequestDto){
        Load load = LoadMapper.INSTANCE.loadRequestDtoToLoad(loadRequestDto);
        loadService.createLoad(load);
    }

    @PutMapping("/${id}")
    public void updateLoad(@RequestBody @Valid LoadRequestDto loadRequestDto, @PathVariable Long id){
        Load updatedLoad = LoadMapper.INSTANCE.loadRequestDtoToLoad(loadRequestDto);
        loadService.updateLoad(updatedLoad, id);
    }

    @PatchMapping("/${id}/status")
    public void updateLoadStatus(@PathVariable Long id, @RequestParam String status){
        loadService.updateLoadStatus(id, status);
    }


}
