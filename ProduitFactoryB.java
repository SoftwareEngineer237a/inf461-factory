public class ProduitFactoryB extends ProduitFactory {
    protected Produit createProduit(){
        Produit produit = null;
        produit = new ProduitB();
        return produit;
    }

    // protected abstract Produit createProduit(){
    //     produit = new ProduitB();
    //     return produit;
    // };
}
