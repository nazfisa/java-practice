package AbastractPracticeHackerrank;

class MyBook extends Book{
    @Override
    void setTitle(String s){
        this.title=s;
    }
    @Override
    String getTitle(){
        return title;
    }
}