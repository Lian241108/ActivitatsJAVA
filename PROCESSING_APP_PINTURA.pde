color c;
String s;
float r;
boolean dibuixant;

void setup() {

  size(800, 800);
  background(255);
  rectMode(CENTER);
  ellipseMode(CENTER);

  c = color(0);
  s = "RECT";
  r = 10;
  boolean dibuxant = false;
}

void triarColor() {
  if (key == 'R' || key == 'r') {
    c = color(255, 0, 0);
  } else if (key == 'B' || key == 'b') {
    c = color(0, 0, 255);
  } else if (key == 'G' || key == 'g') {
    c = color(0, 255, 0);
  } else if (key == 'N' || key == 'n') {
    c = color(0);
  } else if (key == 'W' || key == 'w') {
    c = color(255);
  }
  noStroke();
  fill(c);
}


void triarMida() {
  if (keyCode == UP) {
    r= r+5;
  } else if (keyCode == DOWN) {
    r =r- 5;
  }
  // Límits de mida
  if (r < 5) {
    r = 5;
  } else if (r > 350) {
    r = 350;
  }
}


// Funció per establir la forma de la figura
void forma() {
  if (key == '1') {
    s = "RECT";
  } else if (key == '2') {
    s = "CIRCLE";
  } else if (key == '3') {
    s = "TRIANGLE";
  }
}

// Funció per abilitar / desabilitar el dibuixar
void dibuixar() {
  if (keyCode==LEFT) { 
    dibuixant = !dibuixant; 
  }
}

// Funció que s'executa en pitjar el teclat
void keyPressed() {
  borrar();
  dibuixar();
  forma();
  triarMida();
  triarColor();
}

// Funció que s'executa en pitjar el ratolí
void mousePressionat() {
  dibuixarForma();
}

// Funció que dibuixa la figura
void dibuixarForma() {
  if (dibuixant) {
    fill(c);
    if (s == "RECT") {
      rect(mouseX, mouseY, r, r);
    } else if (s == "CIRCLE") {
      ellipse(mouseX, mouseY, r, r);
    } else if (s == "TRIANGLE") {
      triangle(mouseX, mouseY - r, mouseX - r, mouseY + r, mouseX + r, mouseY + r);
    }
  }
}

// Funció per esborra el dibuix anterior
void borrar() {
  if (keyCode == RIGHT) {
    background(255);
  }
}

void draw() {
  dibuixarForma();
}
