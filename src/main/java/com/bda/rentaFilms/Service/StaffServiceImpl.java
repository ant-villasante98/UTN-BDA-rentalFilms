package com.bda.rentaFilms.Service;

import com.bda.rentaFilms.Model.Dto.StaffDto;
import com.bda.rentaFilms.Model.Entity.StaffEntity;
import com.bda.rentaFilms.Repository.StaffRepository;
import com.bda.rentaFilms.Service.Contract.StaffService;
import com.bda.rentaFilms.Service.Mapper.StaffDtoMapper;
import com.bda.rentaFilms.Service.Mapper.StaffMapper;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class StaffServiceImpl implements StaffService {
    private final StaffRepository staffRepository;
    private final StaffDtoMapper staffDtoMapper;
    private  final StaffMapper staffMapper;

    public StaffServiceImpl(StaffRepository staffRepository, StaffDtoMapper staffDtoMapper, StaffMapper staffMapper) {
        this.staffRepository = staffRepository;
        this.staffDtoMapper = staffDtoMapper;
        this.staffMapper = staffMapper;
    }

    @Override
    public List<StaffDto> getAll() {
        List<StaffEntity> staffEntityList = this.staffRepository.findAll();
        return staffEntityList.stream()
                .map(staffDtoMapper)
                .toList();
    }

    @Override
    public StaffDto getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public StaffDto save(StaffDto object) {
        Optional<Long> optionalLong= this.staffRepository.findAll().stream().map(StaffEntity::getId).max(Long::compareTo);
        optionalLong.ifPresent(aLong -> object.setId(aLong + 1));
        Optional<StaffEntity> staffEntity = Stream.of(object).map(staffMapper).findFirst();
        this.staffRepository.save(staffEntity.get());
        return staffEntity.map(staffDtoMapper).orElseThrow();
    }
}
