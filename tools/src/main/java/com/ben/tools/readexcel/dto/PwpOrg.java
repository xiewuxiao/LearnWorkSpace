package com.ben.tools.readexcel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.Row;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PwpOrg {
    private String code;
    private String name;
    private String shortName;

    public PwpOrg(Row row) {
        try {
            if(row.getCell(0)!=null) {
                this.code = row.getCell(0).getStringCellValue();
                this.name = row.getCell(1).getStringCellValue();
                this.shortName = name;
            }
        } catch (Exception e) {
            System.out.println((row.getRowNum()+1)+"出错");
            e.printStackTrace();

        }
    }
}
