package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.MovimientoLoteRepository;

@Service
@RequiredArgsConstructor
public class MovimientoLoteService {

    private final MovimientoLoteRepository movimientoLoteRepository;

}
