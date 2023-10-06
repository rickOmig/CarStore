package br.com.carstore.servlet;

import br.com.carstore.dao.CarDao;
import br.com.carstore.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest  httpServletRequest, HttpServletResponse response) throws ServletException, IOException {

        String carName =  httpServletRequest.getParameter("carName");

        Car car = new Car(carName);
        CarDao carDao = new CarDao();
        carDao.createdCar(car);

        httpServletRequest.getRequestDispatcher("index.html").forward( httpServletRequest, response);

    }
}