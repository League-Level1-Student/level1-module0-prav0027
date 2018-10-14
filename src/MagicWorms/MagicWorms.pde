  float frequency= .001;
float noiseInterval = 10;
void setup(){
  size(1000,1000);
  background(0,0,255);
}

void draw(){
int randomColorR = (int) random(255);
int randomColorG = (int) random(255);
int randomColorB = (int) random(255);
makeMagical();
  for(int i=0; i<300; i++){
    fill(randomColorR, randomColorG, randomColorB);
   ellipse(getWormX(i), getWormY(i), 1000/300,1000/300);
  }
}

void makeMagical(){
 fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}