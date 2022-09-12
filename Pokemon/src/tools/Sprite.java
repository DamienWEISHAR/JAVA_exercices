package tools;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {

	//ATTRIBUTS
	private int spriteWidth; //nb max de perso en width dans la sprite sheet
	private int spriteHeight; // nb max de perso en height dans la sprite sheet
	private int maxSpriteX;
	private int maxSpriteY;
	private BufferedImage spriteSheet;
	
	
	public Sprite(String imageUrl, int maxSpriteX, int maxSpriteY) {
		this.spriteSheet = this.loadImage(imageUrl);
		
		int calculatedSpriteWidth = this.spriteSheet.getWidth() / maxSpriteX;
		int calculatedSpriteHeight = this.spriteSheet.getHeight() / maxSpriteY;
		this.setSpriteWidth(calculatedSpriteWidth);
		this.setSpriteHeight(calculatedSpriteHeight);
		this.setMaxSpriteX(maxSpriteX);
		this.setMaxSpriteY(maxSpriteY);
 
	}
	
	
    public BufferedImage loadImage(String file) {
        BufferedImage sprite = null;
        try {
            sprite = ImageIO.read(getClass().getResource(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sprite;
    }
    
    public BufferedImage getSprite(int positionCaseX, int positionCaseY) {
    	int positionX = this.spriteWidth * (positionCaseX - 1);
    	int positionY = this.spriteHeight * (positionCaseY - 1);
    	BufferedImage test =  this.spriteSheet.getSubimage(positionX, positionY, this.spriteWidth, this.spriteHeight);
    	return test;
    }


	public int getSpriteWidth() {
		return spriteWidth;
	}


	public int getSpriteHeight() {
		return spriteHeight;
	}


	public int getMaxSpriteX() {
		return maxSpriteX;
	}


	public int getMaxSpriteY() {
		return maxSpriteY;
	}


	public BufferedImage getSpriteSheet() {
		return spriteSheet;
	}


	public void setSpriteWidth(int spriteWidth) {
		this.spriteWidth = spriteWidth;
	}


	public void setSpriteHeight(int spriteHeight) {
		this.spriteHeight = spriteHeight;
	}


	public void setMaxSpriteX(int maxSpriteX) {
		this.maxSpriteX = maxSpriteX;
	}


	public void setMaxSpriteY(int maxSpriteY) {
		this.maxSpriteY = maxSpriteY;
	}


	public void setSpriteSheet(BufferedImage spriteSheet) {
		this.spriteSheet = spriteSheet;
	}   
    
    
}
