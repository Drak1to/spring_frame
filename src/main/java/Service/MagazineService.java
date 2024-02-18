package Service;

import domain.Magazine;

import java.util.List;

public interface MagazineService {
    Magazine save(Magazine magazine);
    List<Magazine> readAll ();
    Magazine update(Magazine magazine);
    void deleteById(Long id);
}
