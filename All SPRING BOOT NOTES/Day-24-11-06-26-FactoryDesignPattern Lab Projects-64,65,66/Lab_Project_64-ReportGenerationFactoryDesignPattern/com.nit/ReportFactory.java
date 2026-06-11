package com.nit;

public class ReportFactory {

    public static Report getReport(String reportType) {

        if(reportType == null) {
            return null;
        }

        if(reportType.equalsIgnoreCase("PDF")) {
            return new PdfReport();
        }
        else if(reportType.equalsIgnoreCase("EXCEL")) {
            return new ExcelReport();
        }
        else if(reportType.equalsIgnoreCase("HTML")) {
            return new HtmlReport();
        }

        return null;
    }
}
