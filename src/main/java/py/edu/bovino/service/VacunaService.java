package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.VacunaRepository;

@Service
@RequiredArgsConstructor
public class VacunaService {

    private final VacunaRepository vacunaRepository;

}
