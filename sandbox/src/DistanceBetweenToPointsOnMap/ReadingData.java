package DistanceBetweenToPointsOnMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReadingData {


    public static void main(String[] args) throws IOException {


        String excelFilePath = "C:/Users/À/Desktop/ExcelForPOI/DataForRead.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();
        Map<String,Double[]> pointsMap = new HashMap<>();

        for (int r = 0; r <= rows; r++)
        {
            XSSFRow row = sheet.getRow(r);

            for (int c = 0; c < cols; c++)
            {
                XSSFCell cell = row.getCell(c);

//                switch (cell.getCellType())
//                {
//
//
//                    case STRING :  cell.getStringCellValue(); break;
//                    case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
//                    case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
//                }
//                System.out.println(" ");
            }

        }
            }

        }


