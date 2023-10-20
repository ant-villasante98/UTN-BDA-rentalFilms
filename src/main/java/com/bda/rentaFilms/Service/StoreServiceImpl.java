package com.bda.rentaFilms.Service;

import com.bda.rentaFilms.Model.Dto.StoreDto;
import com.bda.rentaFilms.Model.Entity.StoreEntity;
import com.bda.rentaFilms.Repository.StoreRepository;
import com.bda.rentaFilms.Service.Contract.StoreService;
import com.bda.rentaFilms.Service.Mapper.StoreDtoMapper;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {


    private final StoreRepository storeRepository;
    private final StoreDtoMapper storeDtoMapper;

    public StoreServiceImpl(StoreRepository storeRepository, StoreDtoMapper storeDtoMapper) {
        this.storeRepository = storeRepository;
        this.storeDtoMapper = storeDtoMapper;
    }

    @Override
    public List<StoreDto> getAll() {
        List<StoreEntity> storeEntityList = this.storeRepository.findAll();
        return storeEntityList.stream()
                .map(storeDtoMapper)
                .toList();
    }

    @Override
    public StoreDto getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public StoreDto save(StoreDto object) {
        return null;
    }
}
