package Service.impl;

import Service.MagazineService;
import domain.Magazine;
import org.springframework.stereotype.Service;
import repository.MagazineRepository;

import java.util.List;

@Service
public class MagazineServiceImpl implements MagazineService {
    private MagazineRepository magazineRepository;

    public MagazineServiceImpl(MagazineRepository magazineRepository) {
        this.magazineRepository = magazineRepository;
    }

    @Override
    public Magazine save(Magazine magazine) {
        return magazineRepository.save(magazine);
    }

    @Override
    public List<Magazine> readAll() {
        return magazineRepository.findAll();
    }

    @Override
    public Magazine update(Magazine magazine) {
        return magazineRepository.save(magazine);
    }

    @Override
    public void deleteById(Long id) {
        magazineRepository.deleteById(id);

    }
}
