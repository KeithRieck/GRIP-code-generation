package grip.util;

import org.opencv.core.Mat;

public interface ImagePipeline {

	public Mat process(Mat src);
}
