package br.edu.ifsp.arq.dmos5_2020s1.login_hardcode.model;

import br.edu.ifsp.arq.dmos5_2020s1.login_hardcode.constants.Users;

public class Login_Hardcode {

    private static Login_Hardcode sLogin_Hardcore = null;

    public static Login_Hardcode getInstance() {
        if(sLogin_Hardcore == null){
            sLogin_Hardcore = new Login_Hardcode();
        }
        return sLogin_Hardcore;
    }


    public boolean check(String user, String pass) {
        boolean result = false;
        if(user.equals(String.valueOf(Users.user1))){
            if(pass.equals(String.valueOf(Users.pass1))){
                result = true;
            }
        }
        return result;
    }

}
