package com.sub.nit.hospital;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MedicalReportService {

    public MedicalReportService() {
        System.out.println("MedicalReportService Bean Created");
    }

    public void generateReport() {
        System.out.println("Medical Report Generated Successfully.");
    }
}
