package a_lectures.GeekBrains.Part2OOP.lecture4.Ex004.V2;

public class VideoContent extends Content {
    public VideoContent(String name) {
        super(name);
    }

    public abstract static class Content {
        public String name;

        public Content(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
