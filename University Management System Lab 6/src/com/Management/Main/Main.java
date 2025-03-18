package com.Management.Main;

import com.Management.Campus.*;
import com.Management.Department.*;
import com.Management.Lab.*;
import com.Management.SystemUnit.*;
import com.Management.Employe.*;

public class Main {
    public static void main(String[] args) {

        // Lab 1 PCs
        SystemUnit pc1 = new SystemUnit("1", "Intel core i5", "7th generation", 16, 512);
        SystemUnit pc2 = new SystemUnit("2", "Intel core i7", "9th generation", 8, 256);
        SystemUnit pc3 = new SystemUnit("3", "Intel core i5", "8th generation", 8, 256);
        SystemUnit[] lab1PCs = {pc1, pc2, pc3};

        // Lab 2 PCs
        SystemUnit pc4 = new SystemUnit("1", "Intel core i5", "8th generation", 8, 256);
        SystemUnit pc5 = new SystemUnit("2", "Intel core i7", "13th generation", 16, 1024);
        SystemUnit[] lab2PCs = {pc4, pc5};

        // Lab 3 PCs
        SystemUnit pc6 = new SystemUnit("1", "Intel core i5", "7th generation", 8, 256);
        SystemUnit pc7 = new SystemUnit("2", "Intel core i7", "9th generation", 12, 512);
        SystemUnit[] lab3PCs = {pc6, pc7};

        // Creating Labs
        Lab lab1 = new Lab("C-1", new Employe("Mr. Shahruk Naeem", "Instructor"), lab1PCs.length, lab1PCs, true);
        Lab lab2 = new Lab("C-8", new Employe("Mr. Ahmed Faraz", "Instructor"), lab2PCs.length, lab2PCs, false);
        Lab lab3 = new Lab("C-14", new Employe("Muhammad Ali", "Lab Instructor"), lab3PCs.length, lab3PCs, true);

        Lab[] csLabs = {lab1, lab2};
        Lab[] eeLabs = {lab3};

        // Creating Departments
        Department csDepartment = new Department("Computer Science", new Employe("Dr. Adeel Khan", "HOD - Computer Science"), csLabs);
        Department eeDepartment = new Department("Electrical Engineering", new Employe("Dr. Asim Raza", "HOD - Electrical Engineering"), eeLabs);
        Department[] departments = {csDepartment, eeDepartment};

        // Creating Campus
        Campus campus = new Campus("COMSATS University", "Dr. Shahid Bhatti", departments);

        // Displaying Campus Details
        System.out.println(campus);
    }
}
