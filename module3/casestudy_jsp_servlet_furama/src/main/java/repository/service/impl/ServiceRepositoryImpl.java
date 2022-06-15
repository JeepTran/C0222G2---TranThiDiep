package repository.service.impl;

import model.customer.Customer;
import model.service.RentType;
import model.service.Service;
import model.service.ServiceType;
import repository.base_repository.BaseRepository;
import repository.service.IServiceRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImpl implements IServiceRepository {
    private BaseRepository baseRepository = new BaseRepository();
    private final String FIND_ALL_SERVICE = " select * from service ";
    private final String FIND_ALL_SERVICE_TYPE = " select * from service_type ";
    private final String FIND_ALL_RENT_TYPE = " select * from rent_type ";
    private final String FIND_ALL_ATTACH_SERVICE = " select * from attach_service ";




    @Override
    public List<Service> findAllService() {
        List<Service> serviceList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_SERVICE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("service_id");
                String name = resultSet.getString("service_name");
                int area = resultSet.getInt("service_area");
                double cost = resultSet.getDouble("service_cost");
                int maxPeople = resultSet.getInt("service_max_people");
                int rentTypeId = resultSet.getInt("rent_type_id");
                int serviceTypeId = resultSet.getInt("service_type_id");
                String standardRoom = resultSet.getString("standard_room");
                String convenience = resultSet.getString("description_other_convenience");
                double poolArea = resultSet.getDouble("pool_area");
                int numOfFloors = resultSet.getInt("number_of_floors");
                serviceList.add(new Service(id,name,area,cost,maxPeople,rentTypeId,serviceTypeId,standardRoom,convenience,poolArea,numOfFloors));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceList;
    }

    @Override
    public List<ServiceType> findAllServiceType() {
        return null;
    }

    @Override
    public List<RentType> findAllRentType() {
        return null;
    }
}
