package service;

import model.LoaiMatBang;
import model.MatBang;
import model.TrangThai;

import java.util.List;

public interface IMatBangService {
    List<MatBang> findAllMatBang();

    List<LoaiMatBang> findAllLoaiMatBang();

    List<TrangThai> findAllTrangThai();

    void delete(String deleteId);

    void create(MatBang matBang);
}
