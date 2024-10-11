package com.stempien.LichDelta;

import org.springframework.stereotype.Service;

@Service
public class DeltaService {
    private final DeltaRepository deltaRepository;
    public DeltaService(DeltaRepository deltaRepository) {
        this.deltaRepository = deltaRepository;
    }
    void save(Delta delta) {
        delta.setValue(delta.getB()*delta.getB()-(4*delta.getA()*delta.getC()));
        deltaRepository.save(delta);
    }
}
