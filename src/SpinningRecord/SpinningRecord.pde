int angle = 0;
void setup(){
  PImage pictureOfRecord;
  size(600,600);
  pictureOfRecord = loadImage("Record.jpg");
  pictureOfRecord.resize(600,600);
}
void draw(){
  image(pictureOfRecord, 300, 300);
  
}

void rotateImage(PImage image, int amountToRotate){
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}