package com.example.demo.controller;


import com.example.demo.pojo.entity.Person;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;


/**
 * @description
 * @Author QianWei.Song
 * @Date: 2021/12/22 11:40
 * @Version 1.1.0
 */
@RestController
@RequestMapping("/exportPdf")
public class ExportPdf {

    @PostMapping("/pdf")
    public void getPdf() throws IOException, DocumentException {
        //获取一个document对象
        Document document = new Document(PageSize.A4);

        //建立一个书写器和document关联   参数可以传一个document对象 和一个输出流
        File file=new File("");
        String canonicalPath = file.getCanonicalPath()+"/Song.pdf";
        FileOutputStream fileOutputStream = new FileOutputStream(canonicalPath);
        PdfWriter pw = PdfWriter.getInstance(document,fileOutputStream);

        //开启文档  设置一些文档的信息
        document.open();
        //标题
        document.addTitle("song标题");
        document.addAuthor("song");
        document.addSubject("文档的主题");


        //设置字体
        Font font=new Font(BaseFont.createFont("STSongStd-Light", "UniGB-UCS2-H",
                BaseFont.NOT_EMBEDDED));

        //生称pdf文件   设置pdf文件的内容
        generatePdf(document,font);

        document.close();


    }

    private void generatePdf(Document document,Font font) throws DocumentException {

        //段落 指定段落的的名称和字体以及一些属性
        Paragraph elements = new Paragraph("美好的一天从早起开始",font);
        elements.setAlignment(1); //设置文字居中 0靠左   1，居中     2，靠右
        elements.setIndentationLeft(12); //设置左缩进
        elements.setIndentationRight(12); //设置右缩进
        elements.setFirstLineIndent(24); //设置首行缩进
        elements.setLeading(20f); //行间距
        elements.setSpacingBefore(5f); //设置段落上空白
        elements.setSpacingAfter(10f); //设置段落下空白

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("song",10,20.0,"henan","qqq","www","eee"));
        people.add(new Person("222",20,30.0,"henan","aaa","sss","ddd"));
        people.add(new Person("4444",40,50.0,"henan","ggg","hhh","jjj"));
        people.add(new Person("5555",50,60.0,"henan","zzz","xxx","ccc"));

        //表格  填入数据
        //创建表格
        PdfPTable table=createTable();

        //描述列
        table.addCell(createCell("名字",font,Element.ALIGN_CENTER));
        table.addCell(createCell("年纪",font,Element.ALIGN_CENTER));
        table.addCell(createCell("价钱",font,Element.ALIGN_CENTER));
        table.addCell(createCell("地址",font,Element.ALIGN_CENTER));
        table.addCell(createCell("旗子",font,Element.ALIGN_CENTER));
        table.addCell(createCell("爸爸",font,Element.ALIGN_CENTER));
        table.addCell(createCell("mather",font,Element.ALIGN_CENTER));

        AtomicReference<Integer> totalQuantity = new AtomicReference<>(0);
        //遍历对象数组  填数据
        people.forEach(x->{
            table.addCell(createCell(x.getName(),font,Element.ALIGN_CENTER));
            table.addCell(createCell(String.valueOf(x.getAge()), font, Element.ALIGN_CENTER));
            table.addCell(createCell(String.valueOf(x.getPrice()),font,Element.ALIGN_CENTER));
            table.addCell(createCell(x.getAddress(),font,Element.ALIGN_CENTER));
            table.addCell(createCell(x.getWife(),font,Element.ALIGN_CENTER));
            table.addCell(createCell(x.getFather(),font,Element.ALIGN_CENTER));
            table.addCell(createCell(x.getMather(),font,Element.ALIGN_CENTER));
            totalQuantity.getAndSet(totalQuantity.get() + 1);
        });
        //总计行  合并列
        table.addCell(createCell("总计", font));
        table.addCell(createCell("", font));
        table.addCell(createCell("", font));
        table.addCell(createCell("", font));
        table.addCell(createCell(String.valueOf(totalQuantity) + "个人", font));
        table.addCell(createCell("", font));

        //
        document.add(elements);
        document.add(table);
    }



    /**
     * 创建单元格(指定字体)
     * @param value
     * @param font
     * @return
     */
    public PdfPCell createCell(String value, Font font) {
        PdfPCell cell = new PdfPCell();
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPhrase(new Phrase(value, font));
        return cell;

    }
    //构建单元格对象  设置单元格的格式
    private PdfPCell createCell(String s, Font font, int alignCenter) {
        PdfPCell cell = new PdfPCell();
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPhrase(new Phrase(s, font));
        return cell;
}
    //构建表格对象
    //构建默认列宽，指定列数、水平(居中、右、左)的表格
    private PdfPTable createTable() {
        //指定列数
        PdfPTable pt=new PdfPTable(8);
        try {
            pt.setTotalWidth(520);
            pt.setLockedWidth(true);
          //  pt.setHorizontalAlignment(align);
            pt.getDefaultCell().setBorder(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pt;
}


}
