package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.TerceroRepository;

@Service
@RequiredArgsConstructor
public class TerceroService {

    private final TerceroRepository terceroRepository;

}
