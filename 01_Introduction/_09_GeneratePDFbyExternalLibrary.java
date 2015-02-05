import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPTable;

public class _09_GeneratePDFbyExternalLibrary {

	public static void main(String[] args) throws DocumentException,
			IOException {
		char[] suits = { '\u2663', '\u2666', '\u2665', '\u2660' };
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		Document document = new Document();
		Rectangle rectangle = new Rectangle(PageSize.A4);
		document.setPageSize(rectangle);

		PdfPTable table = new PdfPTable(13);
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);

		BaseFont bf = BaseFont.createFont("century-gothic.ttf",
				BaseFont.IDENTITY_H, true);
		Font font = new Font(bf, 18f, Font.BOLD);

		try {
			PdfWriter.getInstance(document, new FileOutputStream(
					"Deck-of-Cards.pdf"));
			document.open();

			for (int i = 0; i < suits.length; i++) {
				for (int j = 0; j < faces.length; j++) {
					String eachCard = faces[j] + suits[i];
					if (i == 1 || i == 2) {
						font = new Font(bf, 14f, Font.BOLD, BaseColor.RED);
					} else {
						font = new Font(bf, 14f, Font.BOLD, BaseColor.BLACK);
					}
					PdfPTable singleCard = new PdfPTable(1);
					PdfPCell cell = new PdfPCell(new Phrase(eachCard, font));
					cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					cell.setFixedHeight(48);
					cell.setBorderColor(BaseColor.BLACK);
					singleCard.addCell(cell);
					table.addCell(singleCard);
				}
			}
			document.add(table);
			document.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
