package com.ligabetplay.Pais.application;

import com.ligabetplay.Pais.domain.models.Pais;
import com.ligabetplay.Pais.infrastructure.PaisRepository;
import java.util.List;
import java.util.Optional;

public class PaisService {
    private final PaisRepository paisRepository;

    public PaisService(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    public void createPais(Pais pais) {
        paisRepository.save(pais);
    }

    public void updatePais(Pais pais) {
        paisRepository.update(pais);
    }

    public Optional<Pais> getPaisById(int id) {
        return paisRepository.findById(id);
    }

    public void deletePais(int id) {
        paisRepository.delete(id);
    }

    public List<Pais> getAllPaises() {
        return paisRepository.findAll();
    }
}
