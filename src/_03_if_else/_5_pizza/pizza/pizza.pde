
void setup() {
    size(500, 500);
    fill(#F2B91B);
    ellipse(250, 250, 500, 500);
}
void draw() {
    PImage pepperoni; 
    pepperoni = loadImage("pepperoni.png");
    image(pepperoni,200,200);
    pepperoni.resize(30,30);
    
    
 
    image(pepperoni,300,300);
    pepperoni.resize(50,50);
    
    image(pepperoni,100,300);
    pepperoni.resize(50,50);
    
    image(pepperoni,200,200);
    pepperoni.resize(50,50);
    image(pepperoni,100,100);
    pepperoni.resize(50,50);
    image(pepperoni,200,100);
    pepperoni.resize(50,50);

}
