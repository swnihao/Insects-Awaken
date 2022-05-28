package com.insects.getdata.mapper;


import com.insects.getdata.domain.EmployeeDetailRelation;

import java.util.List;

public interface EmployeeDetailRelationMapper {

    void addOne(EmployeeDetailRelation employeeDetailRelation);

    List<String> getEmployeePPPIDByRelationNotExists();

    List<String> getEmployeeRPIIDByRelationNotExists();

    List<String> getAllRelationRIPID();
}