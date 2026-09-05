package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.AplicacionVacunaRepository;

@Service
@RequiredArgsConstructor
public class AplicacionVacunaService {

    private final AplicacionVacunaRepository aplicacionVacunarRepository;

}
