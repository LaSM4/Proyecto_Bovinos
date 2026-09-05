package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.RazaRepository;

@Service
@RequiredArgsConstructor
public class RazaService {

    private final RazaRepository razaRepository;

}
