package com.ben.tools;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelFileTest {
    /**
     * excel文件去掉标题的两行空格
     */

    @Test
    public void remove34Row() throws IOException, InvalidFormatException {
        File excel = new File("F:\\绩效文档\\陕西绩效\\发过来的资料\\陕财办绩【2020】4号附件\\陕财办绩【2020】4号\\已处理的_v1\\附件1-2020年省级部门整体绩效目标表.xlsx");
        Workbook workbook = new XSSFWorkbook(excel);
        Sheet sheet = workbook.getSheet("10");
        Row row2 = sheet.getRow(2);
        Row row3 = sheet.getRow(3);
        boolean hadContent = RowContentFlag(row2)&&RowContentFlag(row3);
        if(!hadContent){
            sheet.shiftRows(2,3,1);
//            sheet.removeRow(row3);

        }
        FileOutputStream os = new FileOutputStream("F:\\绩效文档\\陕西绩效\\发过来的资料\\陕财办绩【2020】4号附件\\陕财办绩【2020】4号\\已处理的_v1\\result.xlsx");
        workbook.write(os);
        workbook.close();
        os.close();

    }

    /**
     *
     * @param row
     * @return true 为有内容，false为无内容
     */
    public boolean RowContentFlag(Row row){
        Iterator<Cell> iterator = row.iterator();
        while (iterator.hasNext()){
            Cell cell = iterator.next();
            String cellContent = cell.getStringCellValue();
            //如果内容不为空，返回真
            if(!cellContent.trim().equals("")){
                System.out.printf(cellContent);
                return true;
            }
        }
        return false;
    }
}
