package com.zx.utils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * pdf转图片工具类
 */
public class PdfToImgUtils {

    public static void main(String[] args) {
        try {

            PDDocument document = PDDocument.load(new File("D:\\tmp\\temp.pdf"));
            // 创建PDF渲染器
            PDFRenderer renderer = new PDFRenderer(document);
            // 遍历每一页并渲染为图像
            for (int i = 0; i < document.getNumberOfPages(); i++) {
                BufferedImage image = renderer.renderImageWithDPI(i, 300); // 300 dpi的分辨率
                // 将图像保存为PNG文件
                ImageIO.write(image, "PNG", new File("D:\\tmp\\tranceImg\\"+"example-" + i + ".png"));
            }
            // 关闭文档
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
