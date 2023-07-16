package com.avi.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A1GroupNameByCity {
    public static void main(String[] args) {

        List<A1GroupNameByCity> list = Arrays.asList(
                new A1GroupNameByCity(1,"Avi","muz","dev"),
                new A1GroupNameByCity(2,"Dilip","muz","network"),
                new A1GroupNameByCity(3,"Ravi","Patna","dev"),
                new A1GroupNameByCity(4,"Anil","Patna","network"),
                new A1GroupNameByCity(5,"Manoj","muz","dev")
        );

        // System.out.print(list);

        Map<String,List<A1GroupNameByCity>> groupByDept = list.stream()
                .collect(Collectors.groupingBy(A1GroupNameByCity::getDept));

        groupByDept.forEach(
                (department, employeesInDepartment) ->
                {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf("   %s%n", employee));
                }
        );




        //System.out.println(groupByDept);
    }
    private int eid;
    private String ename;
    private String ecity;
    private String dept;

    public A1GroupNameByCity(){

    }

    public A1GroupNameByCity(int eid, String ename, String ecity, String dept) {
        this.eid = eid;
        this.ename = ename;
        this.ecity = ecity;
        this.dept = dept;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEcity() {
        return ecity;
    }

    public void setEcity(String ecity) {
        this.ecity = ecity;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "A1GroupNameByCity{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", ecity='" + ecity + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
