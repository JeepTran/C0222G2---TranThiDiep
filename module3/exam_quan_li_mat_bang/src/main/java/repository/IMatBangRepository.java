package repository;

import model.LoaiMatBang;
import model.MatBang;
import model.TrangThai;

import java.util.List;

public interface IMatBangRepository {
    List<MatBang> findAllMatBang();

    List<LoaiMatBang> findAllLoaiMatBang();

    List<TrangThai> findAllTrangThai();

    void delete(String deleteId);

    void create(MatBang matBang);
}
