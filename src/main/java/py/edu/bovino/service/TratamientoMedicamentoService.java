package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.TratamientoMedicamentoRepository;

@Service
@RequiredArgsConstructor
public class TratamientoMedicamentoService {

    private final TratamientoMedicamentoRepository tratamientoMedicamentoRepository;

}
