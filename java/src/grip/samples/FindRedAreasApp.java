package grip.samples;

import static edu.wpi.first.wpilibj.vision.GripRunner.makeCamera;
import static edu.wpi.first.wpilibj.vision.GripRunner.makeWindow;

import edu.wpi.first.wpilibj.vision.GripRunner;
import edu.wpi.first.wpilibj.vision.VideoViewer;

public class FindRedAreasApp {
	
	static final int IMG_WIDTH = 320;
	static final int IMG_HEIGHT = 240;

	final VideoViewer window;
	final GripRunner<FindRedAreas> gripRunner;
	
	public FindRedAreasApp() {
		this.window = makeWindow("GRIP", IMG_WIDTH, IMG_HEIGHT);
		this.gripRunner = new GripRunner<FindRedAreas>(
				makeCamera(0, IMG_WIDTH, IMG_HEIGHT, -1.0), 
				new FindRedAreas(), 
				processor -> { window.imshow(processor.rgbThresholdOutput());});
	}

	public static void main(String[] args) {
		FindRedAreasApp app = new FindRedAreasApp();
		app.gripRunner.runForever();
	}

}
