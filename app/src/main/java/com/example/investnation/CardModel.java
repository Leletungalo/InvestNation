package com.example.investnation;

/* This class represents a CardView for the FinancialLitracyActivity
 *
 * @Author: Songeziwe S. Soboois
 * @Date: June 16, 2019
 */

public class CardModel {
    private int image_Id;
    private int heading_id;
    private int description_id;

    public CardModel(int imageId, int headingid, int descriptionid){
        image_Id = imageId;
        heading_id = headingid;
        description_id = descriptionid;
    }

    // Getters to access instance variables
    public int getImage_Id(){ return image_Id;}
    public int getHeading_id(){ return heading_id; }
    public int getDescription_id(){ return description_id; }
}
