/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.DBContext;
import dao.IBankDAO;
import entity.dto.BankAccountDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BankAccountDAOImpl extends DBContext implements IBankDAO {

    @Override
    public List<BankAccountDto> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "SELECT * FROM [dbo].[bank_account]";
        List<BankAccountDto> result = new ArrayList<>();
        try {
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                BankAccountDto dto = new BankAccountDto();
                dto.id = rs.getInt("bank_id");
                dto.bankName = rs.getString("bank_name");
                dto.bankNameShort = rs.getString("bank_name_short");
                dto.bankAccount = rs.getString("bank_account");
                dto.owner = rs.getString("owner");
                result.add(dto);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BankAccountDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BankAccountDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;

    }

}
