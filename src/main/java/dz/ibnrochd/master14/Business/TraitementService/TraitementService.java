package dz.ibnrochd.master14.Business.TraitementService;


import dz.ibnrochd.master14.Mapper.TraitementMapper;
import dz.ibnrochd.master14.model.Traitement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author GHEZALI Abdelhak
 * Created on 2024/04/25.
 */
@Service
public class TraitementService implements ITraitementService {

    @Autowired
    private TraitementMapper traitementMapper;

    @Override
    public void createTraitement(Traitement traitement) {
        traitementMapper.insert(traitement);
    }

    @Override
    public Traitement getTraitement(int id) {
        return traitementMapper.selectByTraitementId(id);
    }

    @Override
    public List<Traitement> getAllTraitements() {
        return traitementMapper.selectAll();
    }
    @Override
    public void updateTraitement(int id,Traitement traitement) {
        traitementMapper.update(id,traitement);
    }

    @Override
    public void deleteTraitement(int id) {
        traitementMapper.delete(id);
    }
}
