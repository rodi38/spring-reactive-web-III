package tech.ada.mercado.service;


import org.springframework.stereotype.Service;
import tech.ada.mercado.MercadoApplication;
import tech.ada.mercado.repository.MercadoRepository;

@Service
public class MercadoService {
    private MercadoRepository repository;
    public MercadoService (MercadoRepository repository) {
        this.repository = repository;
    }
}
