/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewModel;

import From.EntityFrom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Van-Giang
 */
public class UserModel {

    public boolean register(EntityFrom from) {
        try {
     String sql = "insert into `users` (name, image, price) values (?,?,?)";
            PreparedStatement ps = ViewModel.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, from.getName());
            ps.setString(2, from.getImage());
            ps.setString(3, from.getPirce());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }


}
