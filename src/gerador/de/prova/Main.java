
package gerador.de.prova;

import View.GUI_Index;
import View.splash;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {

   
    public static void main(String[] args) throws IOException {
new splash().setVisible(true);
   
    }
    
  /*  public static void gerar() throws IOException{
       Document document = new Document();

		try {
			PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Xavier\\Desktop\\oxente.pdf"));
			document.open(); //Abrindo o documento
			//Deve-se adicionar corretamente o endereço da imagem.
			Image image = Image.getInstance(Main.class.getClassLoader().getResource("imagens/cabecalho.png"));
  float x =26,y=103*6;
			image.setAbsolutePosition(x,y);

			
			document.add(image);
                        
Font f2 = new Font (Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL);
float led;
			String disciplina = "                     disciplin";
                         Paragraph p1 = new Paragraph(disciplina,f2);
              p1.setSpacingBefore(-18);
                       
                          led = 95;
                         p1.setLeading(led);
                            document.add(p1);
                            
                          String modulo = "                     modulo";
                         Paragraph p2 = new Paragraph(modulo,f2);
              p2.setSpacingBefore(10);
                       
                         led = 95;
                         p1.setLeading(led);
                            document.add(p2);  
                            
                                 String periodo = "                                                      "+"periodo";
                         Paragraph p3 = new Paragraph(periodo,f2);
              p3.setSpacingBefore(-96);
                      
                         led = 95;
                         p3.setLeading(led);
                            document.add(p3);  
                            
                                String semestre = "                                                                               ";
                                semestre = semestre + "                                ";
                                        semestre = semestre + "semere";
                         Paragraph p4 = new Paragraph(semestre,f2);
              p4.setSpacingBefore(-96);
                      
                         led = 95;
                         p4.setLeading(led);
                            document.add(p4); 
                            
                            String professor = "                     profsor";
                         Paragraph p5 = new Paragraph(professor,f2);
              p5.setSpacingBefore(-73);
                       
                         led = 95;
                         p5.setLeading(led);
                            document.add(p5); 
                            
                            
                            String data = "                                                                               ";
                            data = data + "                                                            ";
                                                             data = data + "                     data";
                         Paragraph p6 = new Paragraph(data,f2);
              p6.setSpacingBefore(-94);
                       
                         led = 95;
                         p6.setLeading(led);
                            document.add(p6); 
                            
                            
                                String objetivo = "                     objetivo";
                         Paragraph p7 = new Paragraph(objetivo,f2);
              p7.setSpacingBefore(-80);
                       
                         led = 95;
                         p7.setLeading(led);
                            document.add(p7); 
                            
                                   /* String pergunt="";
                                      
                                      for (int i=0; i < cont; i++){
                                      pergunt = pergunt + perguntas[i] + "\n";
                                      }
                                      Paragraph p8 = new Paragraph(pergunt,f2);
             p8.setSpacingBefore(-20);
                       
                         led = 95;
                         p8.setLeading(led);
                            document.add(p8);     
                            */
                            
                          /*
			document.close();
			
			
			//Mensagem que aparece no console caso tudo dê certo
			System.out.println("Imagem na célula");
                        
                        
                    
                
                       
                        
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		 Desktop.getDesktop().open(new File("C:\\Users\\Xavier\\Desktop\\oxente.pdf"));
                 
	}
    */
    
    
}
