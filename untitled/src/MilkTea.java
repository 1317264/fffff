public class MilkTea {
    private String name;
    private Ingredient ingredient;

    String getName(){
        return name;
    }
    Ingredient getIngredient(){
        return ingredient;
    }
    void setName(String name1){
        this.name=name1;
    }
    void setIngredient(Ingredient ingredient1){
        this.ingredient=ingredient1;
    }

    @Override
    public String toString(){
        return ("milkname:"+getName()+" with ingredient("+getIngredient().toString()+")");
    }
}
