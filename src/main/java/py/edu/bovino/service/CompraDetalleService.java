package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.CompraDetalleRepository;

@Service
@RequiredArgsConstructor
public class CompraDetalleService {

    private final CompraDetalleRepository compraDetalleRepository;

}
