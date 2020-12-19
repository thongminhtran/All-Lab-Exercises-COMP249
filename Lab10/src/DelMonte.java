public class DelMonte implements JuiceFactory{

    //Add a private inner class called Apple implements the interface AppleJuice

    private class Apple implements AppleJuice{
        @Override
        public void getAppleJuiceInfo(){
            // This method prints out "Created an apple juice."
            System.out.println("Created an apple juice.");
        }
    }

    //Add a private inner class called Orange implements the interface OrangeJuice

    private class Orange implements OrangeJuice{
        @Override
        public void getOrangeJuiceInfo(){
            //This method prints out "Created an orange juice."
            System.out.println("Created an orange juice.");
        }
    }
    @Override
    public AppleJuice createAppleJuice() {
        return new Apple();
    }

    @Override
    public OrangeJuice createOrangeJuice() {
        return new Orange();
    }
}
