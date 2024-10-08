package com.riwi.prueba.service;

import com.riwi.prueba.model.Load;
import com.riwi.prueba.repository.LoadRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoadService {

    private LoadRepository loadRepository;

    // Método para crear un load
    public void createLoad(Load load) {
        loadRepository.save(load);
    }


    // Método para obtener todos los loads
    public List<Load> getAllLoads() {
        return loadRepository.findAll();
    }

    // Método para obtener un load por ID
    public Optional<Load> getLoadById(Long id) {
        return loadRepository.findById(id);
    }

    // Método para eliminar un load por ID
    public void deleteLoad(Long id) {
        loadRepository.deleteById(id);
    }

    //Metodo para actualizar un load
    public void updateLoad(Load updatedLoad, Long id) {
        Optional<Load> loadOptional = loadRepository.findById(id);

        if (loadOptional.isPresent()) {
            Load load = loadOptional.get();
            load.setId(updatedLoad.getId());
            load.setDimension(updatedLoad.getDimension());
            load.setState(updatedLoad.getState());
            load.setWeight(updatedLoad.getWeight());
            loadRepository.save(load);

        } else {
            throw new RuntimeException("Load not found with id: " + id);
        }
    }

    //Metodo para actualizar el status de un load por medio de su id
    public void updateLoadStatus(Long id, String status) {
        if (loadRepository.existsById(id)) {
            loadRepository.updateLoadStatus(id, status);
        }else {
            throw new RuntimeException("Load not found with id: " + id);
        }

    }



}
