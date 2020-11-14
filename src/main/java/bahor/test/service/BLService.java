package bahor.test.service;

import bahor.test.model.BlackList;
import bahor.test.repo.BLRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BLService {

    private final BLRepo BLRepo;

    public BLService(BLRepo BLRepo) {
        this.BLRepo = BLRepo;
    }

    public BlackList save(BlackList blackList){
        return BLRepo.save(blackList);
    }

    public List<BlackList> getAll(){
        return BLRepo.findAll();
    }
}
