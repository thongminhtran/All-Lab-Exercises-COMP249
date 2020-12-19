public class AbstractFactoryPattern {
    public void makeJuices(JuiceFactory factory){
        //Create an array of 2 apple juices
        AppleJuice[] appleJuices = new AppleJuice[2];
        //Create an array of 3 orange juices
        OrangeJuice[] orangeJuices = new OrangeJuice[3];

        //Iterate through that array to print the info of AppleJuice

        for(int i = 0; i < 2; i++){
            appleJuices[i] = factory.createAppleJuice();
            appleJuices[i].getAppleJuiceInfo();
        }

        //Iterate through that array to print the info of OrangeJuice

        for(int k = 0; k < 3; k++){
            orangeJuices[k] = factory.createOrangeJuice();
            orangeJuices[k].getOrangeJuiceInfo();
        }
    }
}
