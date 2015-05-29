package scenariogenerator;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BufferedImage img = null;
		try {
			img = ImageIO
					.read(new File(
							"C:\\DeinOrdner\\ForTheGloryModDevelopmentTool\\src\\main2\\frontend.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		BufferedImage img2 = null;

		try {
			img2 = ImageIO
					.read(new File(
							"C:\\DeinOrdner\\ForTheGloryModDevelopmentTool\\src\\main2\\backend.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Images loaded");
		MapPanel map = new MapPanel(img, img2, new HashMap<Color, Integer>());
		JFrame frame = new JFrame("Test MapPanel");
		frame.setBounds(10, 10, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(map);

	}

}
