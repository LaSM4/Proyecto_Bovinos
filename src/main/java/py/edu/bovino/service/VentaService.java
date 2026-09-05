package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.VentaRepository;

@Service
@RequiredArgsConstructor
public class VentaService {

    private final VentaRepository ventaRepository;

}
