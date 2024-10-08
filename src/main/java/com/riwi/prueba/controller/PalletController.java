package com.riwi.prueba.controller;

import com.riwi.prueba.Dto.mapper.PalletMapper;
import com.riwi.prueba.Dto.request.PalletRequestDto;
import com.riwi.prueba.model.Pallet;
import com.riwi.prueba.service.PalletService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pallets")
public class PalletController {

    @Autowired
    private PalletService palletService;

    @GetMapping()
    public List<Pallet> getAllPallets(){
        return palletService.getAllPallets();
    }

    @PostMapping()
    public void createPellet(@RequestBody @Valid PalletRequestDto palletRequestDto){
        Pallet pallet = PalletMapper.INSTANCE.palletRequestDtoToPallet(palletRequestDto);
        palletService.createPallet(pallet);
    }

    @PutMapping("/${id}")
    public void updatePallet(@RequestBody @Valid PalletRequestDto palletRequestDto, @PathVariable Long id){
        Pallet pallet = PalletMapper.INSTANCE.palletRequestDtoToPallet(palletRequestDto);
        palletService.updatePallet(pallet, id);
    }

    @DeleteMapping("/${id}")
    public void deletePallet(@PathVariable Long id){
        palletService.deletePallet(id);
    }


}
