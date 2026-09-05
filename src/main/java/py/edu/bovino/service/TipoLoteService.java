package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.TipoLoteRepository;

@Service
@RequiredArgsConstructor
public class TipoLoteService {

    private final TipoLoteRepository tipoLoteRepository;

}
