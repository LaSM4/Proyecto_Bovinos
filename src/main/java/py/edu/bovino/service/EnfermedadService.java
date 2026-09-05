package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.EnfermedadRepository;

@Service
@RequiredArgsConstructor
public class EnfermedadService {

    private final EnfermedadRepository enfermedadRepository;

}
