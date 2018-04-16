/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 1.7
 * @author Matthew S Montoya
 * 
 */
public class Chapter1Problem7 {
	public static void main(String[] args) {
		/*Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
		 * write a function to rotate the image by 90 degrees. Can you do this in place? 
		 */
		
		int imageSize = getImage();
		int[][] image = buildMatrix();
		int[][] rotatedImage = rotateMatrix(image);
	}
	

	/*INITIAL QUESTIONS && Assumptions
	 * 4 Bytes/pixel? I will assume an integer matrix
	 * 
	 */
	
	private static int getImage() {
		//ask for size (in pixels)
		//create n*n array and fill with integers 1-n
		//print the matrix on screen for the user to see it is original
		return 0;
	}

	private static int[][] buildMatrix() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[][] rotateMatrix(int[][] image) {
		// TODO Auto-generated method stub
		return null;
	}
}
