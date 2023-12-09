package homework.pet.model;

public class Pet {
        // поля класса
        private int id;
        private String kind;
        private int age;
        private String nickname;

        public Pet(int id, String kind, int age, String nickname) {
            this.id = id;
            this.kind = kind;
            this.age = age;
            this.nickname = nickname;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSpecies() {
            return kind;
        }

        public void setSpecies(String species) {
            this.kind = species;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public void display() {
            System.out.println("ID: " + id + ", Species: " + kind + ", Age: "
                    + age + ", Nickname: " + nickname);
        }

        public void thereIs(){
            System.out.println("There is a" + kind);
        }
        public void sleep(){
            System.out.println("It sleeps");
        }

        public void makeSound(){
            System.out.println("It communicates");
        }

        public void play(){
            System.out.println("Pet plays");
        }

        public void eat(){
            System.out.println("Pet eats");
        }

        public void bite(){
            System.out.println("Pet bites");
        }
}
