package com.changhong.system.web.controller;

import com.changhong.system.service.UserService;
import com.changhong.system.web.facade.dto.UserDTO;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: Jack Wang
 * Date: 14-4-9
 * Time: 上午11:42
 */
public class UserFormController extends SimpleFormController {

    private UserService userService;

    public UserFormController() {
        setCommandClass(UserDTO.class);
        setCommandName("user");
        setFormView("/backend/system/userform");
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        int userId = ServletRequestUtils.getIntParameter(request, "userId", -1);
        String current = ServletRequestUtils.getStringParameter(request, "current", "");
        String filername = ServletRequestUtils.getStringParameter(request, "filername", "");
        request.setAttribute("current", current);
        request.setAttribute("filername", filername);

        if (userId > 0) {
            return userService.obtainUserById(userId, true);
        }
        return new UserDTO();
    }

    @Override
    protected void onBindAndValidate(HttpServletRequest request, Object command, BindException errors) throws Exception {
        int userId = ServletRequestUtils.getIntParameter(request, "userId", -1);
        String name = ServletRequestUtils.getStringParameter(request, "name", "");
        if (!StringUtils.hasText(name)) {
            errors.rejectValue("name", "user.name.empty");
        }

        String username = ServletRequestUtils.getStringParameter(request, "username", "");
        if (!StringUtils.hasText(username)) {
            errors.rejectValue("username", "user.username.empty");
        } else {
            boolean exist = userService.obtainUserExist(userId, username);
            if (exist) {
                errors.rejectValue("username", "user.username.exist");
            }
        }
    }

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        String current = ServletRequestUtils.getStringParameter(request, "current", "");
        String filername = ServletRequestUtils.getStringParameter(request, "filername", "");

        UserDTO userDTO = (UserDTO) command;
        userService.changeUserDetails(userDTO);

        return new ModelAndView(new RedirectView("useroverview.html?current="+current+"&filername="+filername));
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
