package service.impl;

import model.LoaiMatBang;
import model.MatBang;
import model.TrangThai;
import repository.IMatBangRepository;
import repository.impl.MatBangRepositoryImpl;
import service.IMatBangService;

import java.util.List;

public class MatBangServiceImpl implements IMatBangService {
    private IMatBangRepository matBangRepository = new MatBangRepositoryImpl();
    @Override
    public List<MatBang> findAllMatBang() {
        return matBangRepository.findAllMatBang();
    }

    @Override
    public List<LoaiMatBang> findAllLoaiMatBang() {
        return matBangRepository.findAllLoaiMatBang();
    }

    @Override
    public List<TrangThai> findAllTrangThai() {
        return matBangRepository.findAllTrangThai();
    }

    @Override
    public void delete(String deleteId) {
        matBangRepository.delete(deleteId);
    }

    @Override
    public void create(MatBang matBang) {
        matBangRepository.create(matBang);
    }
}
