package grip.samples;

import org.opencv.core.Mat;

import grip.util.ImagePipeline;
import grip.util.VideoApp;

public class FindRedAreasApp {

	public static void main(String[] args) throws Exception {
		final FindRedAreas processor = new FindRedAreas();
		ImagePipeline pipeline = new ImagePipeline() {

			@Override
			public Mat process(Mat src) {
				processor.process(src);
				return processor.rgbThresholdOutput();
			}
		};
		(new VideoApp(pipeline, 320, 240)).run();
	}
}
