package com.taoke.miquaner.ctrl;

import com.taoke.miquaner.MiquanerApplication;
import com.taoke.miquaner.data.EUser;
import com.taoke.miquaner.serv.ITbkServ;
import com.taoke.miquaner.serv.IUserServ;
import com.taoke.miquaner.view.UserRegisterSubmit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

@RestController
public class UserCtrl {

    private IUserServ userServ;

    @Autowired
    public UserCtrl(IUserServ userServ) {
        this.userServ = userServ;
    }

    @RequestMapping(value = "/tbk/user/login", method = RequestMethod.POST)
    public Object login(@RequestBody EUser user) {
        return this.userServ.login(user);
    }

    @RequestMapping(value = "/tbk/user/register", method = RequestMethod.POST)
    public Object register(Reader reader) throws IOException {
        return this.userServ.register(
                MiquanerApplication.DEFAULT_OBJECT_MAPPER.readValue(
                        new BufferedReader(reader).readLine(),
                        UserRegisterSubmit.class
                )
        );
    }

    @RequestMapping(value = "/tbk/phone/verify", method = RequestMethod.POST)
    public Object verify(String phone) {
        return this.userServ.sendVerifyCode(phone);
    }

}
