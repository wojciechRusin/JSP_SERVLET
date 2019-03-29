package servlet;

import com.sda.servlets.model.User;
import com.sda.servlets.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/registerAction")
public class RegisterAction extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        this.userService = new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

//        System.out.println("login: " + login + "\n" + "password: " + password);
        // walidacja parametrów
        Optional<User> userOptional = userService.createUser(login,password);

        if(userOptional.isPresent()) {
            System.out.println(userOptional.get().toString());
        }else {
            System.out.println("User is in database");
        }
    }
}
