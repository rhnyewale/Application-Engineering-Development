/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author rhnye
 */
public class AdminOrganization extends Organization{
    public AdminOrganization(String name)
    {
        super (Type.Admin.getValue());
    }

    public AdminOrganization() {
        super (Type.Admin.getValue());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public ArrayList<String> getSupportedRole()
    {
        ArrayList<String> roles= new ArrayList<>();
        roles.add("Admin");
        return roles;
    }
    
}
