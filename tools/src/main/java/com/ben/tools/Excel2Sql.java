package com.ben.tools;

import com.ben.tools.readexcel.dto.PwpOrg;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.net.URI;
import java.util.Iterator;

public class Excel2Sql {

    public static void main(String[] args) throws Exception{
        //设置模板参数
        File outputFile = new File(new URI(Excel2Sql.class.getResource("/").toURI()+"/pwp_org.sql"));
        FileWriter fileWriter = new FileWriter(outputFile);
        ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader("template/");
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);


        URI classPath = new URI(Excel2Sql.class.getResource("/").toURI()+"excel/部门基础数据10.14.xls");
        Workbook excel = new HSSFWorkbook(new FileInputStream(new File(classPath)));
        Sheet firstSheet = excel.getSheetAt(0);
        Iterator<Row> iterator = firstSheet.rowIterator();
        while (iterator.hasNext()){
            Row row = iterator.next();
            if(row.getRowNum()<1) continue;
            PwpOrg org = new PwpOrg(row);
            if(org.getCode()==null&&org.getName()==null) continue;
            Template t = gt.getTemplate("/insert-pwp_org");
            t.binding("org",org);
            String str = t.render();
            fileWriter.write(str);
        }
        fileWriter.flush();
        fileWriter.close();
        System.out.println("运行结束");
    }

}
