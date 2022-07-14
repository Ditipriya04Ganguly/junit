package io.github;

import model.Patient;

import java.time.LocalDate;
import java.util.*;

public class PatientTester {
    static Map<Integer,Patientd> map= new HashMap<>();


    static  {

        map.put(1,new Patientd(Arrays.asList(
                new Patient(1,"R13.1", "Active",LocalDate.of(2022,06,30), LocalDate.of(2000,9,04)),
                new Patient(3,"R63.4", "Active",LocalDate.of(2022,05,30), LocalDate.of(1980,9,8)),
                new Patient(3,"K21.0", "Active",LocalDate.of(2022,04,30), LocalDate.of(1972,9,23)),
                new Patient(3,"K40", "Active",LocalDate.of(2022,04,01), LocalDate.of(1972,9,23))
                ),Arrays.asList("Y","Y"),Arrays.asList("Y"),null,Arrays.asList("Hiatal Hernia"),Arrays.asList("Dysphagia","GERD","Weight Loss")));
    }


}
