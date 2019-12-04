public interface Shop {
    public abstract void Add(Bubble bubble);
    public abstract void Add(Coconut coconut);
    public abstract void Sell(String milkname,String Ingredientname);
    public abstract  void Buy(Ingredient ingredient);
}
