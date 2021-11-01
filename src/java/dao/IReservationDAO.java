/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.dto.ReservationDto;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IReservationDAO {
    List<ReservationDto> getByID(int id);
    int deleteByServiceId(int id, int serviceId);
    int insert(List<ReservationDto> dto);
}
