
void setup() {
PImage face = loadImage("face image.jpg");
size(500, 500);
face.resize(400, 400);
image(face, 0, 0);
}

void draw() {
  ellipse(0, 0, 400, 400);
  ellipse(0, 0, 0, 0);
  fill(#DB0D0D);

}
