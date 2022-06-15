package repository.impl;

import model.LoaiMatBang;
import model.MatBang;
import model.TrangThai;
import repository.BaseRepository;
import repository.IMatBangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatBangRepositoryImpl implements IMatBangRepository {
    private BaseRepository baseRepository = new BaseRepository();
    private final String FIND_ALL_MAT_BANG = " select * from mat_bang ";
    private final String FIND_ALL_LOAI_MAT_BANG = " select * from loai_mat_bang ";
    private final String FIND_ALL_TRANG_THAI = " select * from trang_thai ";
    private final String DELETE_MAT_BANG_BY_ID = " delete from mat_bang where ma_mat_bang = ? ";
    private final String INSERT_MAT_BANG = " insert into mat_bang values " +
            " (?,?,?,?,?,?,?,?) ";


    @Override
    public List<MatBang> findAllMatBang() {
        List<MatBang> matBangList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_MAT_BANG);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maMatBang= resultSet.getString("ma_mat_bang");
                int maTrangThai = resultSet.getInt("ma_trang_thai");
                double dienTich = resultSet.getDouble("dien_tich");
                int tang = resultSet.getInt("tang");
                int maLoaiMatBang = resultSet.getInt("ma_loai_mat_bang");
                double giaTien = resultSet.getDouble("gia_tien");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                String ngayKetThuc = resultSet.getString("ngay_ket_thuc");
                matBangList.add(new MatBang(maMatBang,maTrangThai,dienTich,tang,maLoaiMatBang,giaTien,ngayBatDau,ngayKetThuc));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matBangList;
    }

    @Override
    public List<LoaiMatBang> findAllLoaiMatBang() {
        List<LoaiMatBang> loaiMatBangList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_LOAI_MAT_BANG);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int maLoaiMatBang= resultSet.getInt("ma_loai_mat_bang");
                String tenLoaiMatBang = resultSet.getString("ten_loai_mat_bang");
                loaiMatBangList.add(new LoaiMatBang(maLoaiMatBang,tenLoaiMatBang));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return loaiMatBangList;
    }

    @Override
    public List<TrangThai> findAllTrangThai() {
        List<TrangThai> trangThaiList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_TRANG_THAI);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int maTrangThai= resultSet.getInt("ma_trang_thai");
                String tenTrangThai = resultSet.getString("ten_trang_thai");
                trangThaiList.add(new TrangThai(maTrangThai,tenTrangThai));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trangThaiList;
    }

    @Override
    public void delete(String deleteId) {
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_MAT_BANG_BY_ID);
            preparedStatement.setString(1, deleteId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void create(MatBang matBang) {
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MAT_BANG);
            preparedStatement.setString(1, matBang.getMaMatBang());
            preparedStatement.setInt(2, matBang.getMaTrangThai());
            preparedStatement.setDouble(3, matBang.getDienTich());
            preparedStatement.setInt(4, matBang.getTang());
            preparedStatement.setInt(5, matBang.getMaLoaiMatBang());
            preparedStatement.setDouble(6, matBang.getGiaTien());
            preparedStatement.setString(7, matBang.getNgayBatDau());
            preparedStatement.setString(8, matBang.getNgayKetThuc());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
