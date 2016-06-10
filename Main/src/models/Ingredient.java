package models;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

public final class Ingredient {
   
    private String name;
    private String description;  
    private double price;
    private boolean available;
    private BufferedImage img;
    
    public Ingredient(String name) throws IOException {
        this.name = name;
        description = "";
        price = 0;
        available = true;
        img = ImageIO.read(this.getClass().getResource("/resources/defaultIngredient.jpg"));
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }
    
    public void resetImg() throws IOException {
        img = ImageIO.read(this.getClass().getResource("/resources/defaultIngredient.jpg"));  
    }
    
    public String toString() {
	return name;
    }
}
