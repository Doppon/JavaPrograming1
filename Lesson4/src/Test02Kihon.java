class Test02Kihon {
  static float ave = 0.0f;
  static float sum = 0.0f;
  public static void main(String[] args) {
    float data[] = new float[6];
    data[0] = 2.3f;
    data[1] = 3.4f;
    data[2] = 1.5f;
    data[3] = 30.9f;
    data[4] = 2.1f;
    data[5] = 9.2f;

    for(int i =0; i < 6; i++) {
      sum += data[i];
    }

    ave = sum / data.length;
    
    System.out.println("平均値：" + ave);
  }
}
