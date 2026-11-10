public class ProduitFactoryC extends ProduitFactory {
    protected Produit createProduit(){
        Produit produit = null;
        produit = new ProduitC();
        return produit;
    }

    // protected abstract Produit createProduit(){
    //     produit = new ProduitC();
    //     return produit;
    // };
}
