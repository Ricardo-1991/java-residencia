
public class MediaPonderada {
	public static float calc(float grade1, float grade2, float grade3, float height1, float height2, float height3) {
		float result = (grade1 * height1 + grade2 * height2 + grade3 * height3);
		result =  result / (height1 + height2 + height3);
		return result;
	}
}
