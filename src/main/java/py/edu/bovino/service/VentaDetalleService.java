package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.VentaDetalleRepository;

@Service
@RequiredArgsConstructor
public class VentaDetalleService {

    private final VentaDetalleRepository ventaDetalleRepository;

}
