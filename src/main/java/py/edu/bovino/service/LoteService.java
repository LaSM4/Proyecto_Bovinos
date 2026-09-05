package py.edu.bovino.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import py.edu.bovino.repository.LoteRepository;

@Service
@RequiredArgsConstructor
public class LoteService {

    private final LoteRepository loteRepository;
}
