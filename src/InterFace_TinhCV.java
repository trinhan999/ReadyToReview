interface InterFace_TinhCV {
  float PI = 3.14f;

  float tinhCV();
}

interface InterFace_TinhDT extends InterFace_TinhCV {
  float tinhDT();
}

class HTron implements InterFace_TinhCV, InterFace_TinhDT {
  public float rad = 0;

  public float tinhCV() {
    float C;
    C = rad * 2 * PI;
    return C;
  }

  public float tinhDT() {
    float C;
    C = rad * rad * PI;
    return C;
  }
}

class InfMain {
  public static void main(String args[]) {
    HTron h1 = new HTron();
    //ko the doi
    //h1.PI
    h1.rad = 5;
    float cv = h1.tinhCV();
    System.out.println("chu vi: " + cv);
    float dt = h1.tinhDT();
    System.out.println("dien tich: " + dt);
  }
}

