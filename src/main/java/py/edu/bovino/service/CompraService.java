package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.CompraRepository;

@Service
@RequiredArgsConstructor
public class CompraService {

    private final CompraRepository compraRepository;
}
