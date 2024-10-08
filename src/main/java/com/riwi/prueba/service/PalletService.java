package com.riwi.prueba.service;

import com.riwi.prueba.model.Pallet;
import com.riwi.prueba.repository.PalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PalletService {
    
    @Autowired
    private PalletRepository palletRepository;


    // Método para crear un pallet
    public void createPallet(Pallet pallet) {
        palletRepository.save(pallet);
    }


    // Método para obtener todos los pallets
    public List<Pallet> getAllPallets() {
        return palletRepository.findAll();
    }

    // Método para obtener un pallet por ID
    public Optional<Pallet> getPalletById(Long id) {
        return palletRepository.findById(id);
    }

    // Método para eliminar un pallet por ID
    public void deletePallet(Long id) {
        palletRepository.deleteById(id);
    }

    //Metodo para actualizar un pallet
    public void updatePallet(Pallet updatedPallet, Long id) {
        Optional<Pallet> palletOptional = palletRepository.findById(id);

        if (palletOptional.isPresent()) {
            Pallet pallet = palletOptional.get();
            pallet.setId(updatedPallet.getId());
            pallet.setLocation(updatedPallet.getLocation());
            pallet.setState(updatedPallet.getState());
            pallet.setMaxWeight(updatedPallet.getMaxWeight());
            palletRepository.save(pallet);

        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }
    
}
