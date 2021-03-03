
package org.acme.rest.controller;

import org.acme.rest.entity.Employee;
import org.acme.rest.service.EmployeeService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import javax.ws.rs.WebApplicationException;

@ApplicationScoped
@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeController {

    @Inject
    EmployeeService employeeService;

    @GET
    @Produces("application/json")
    public Response getEmployee(){
        List<Employee> prod = employeeService.getEmployee();
        return Response.ok(prod).build();
    }

    @POST
    @Produces("application/json")
    public Response addEmployee(Employee employee){
        employeeService.addEmployee(employee);
        return Response.ok().build();
    }

    @GET
    @Path("/{id}")
    public List<Employee> findById(@PathParam("id") Long id) {
        List<Employee> p = employeeService.findById(id);

        if(p.size() == 0)
            throw new WebApplicationException(Response.Status.NOT_FOUND);

        return p;
    }

    @Transactional
    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        employeeService.deleteById(id);
    }

    @GET
    @Path("/email/{email}")
    public Employee get(@PathParam("email") @Encoded String email) {
        return employeeService.findByEmail(email);
    }

    @GET
    @Path("/jobtitle/{jobtitle}")
    public List<Employee> findByJobTitle(@PathParam("jobtitle") @Encoded String jobtitle) {
        return employeeService.findByJobTitle(jobtitle);
    }


}
