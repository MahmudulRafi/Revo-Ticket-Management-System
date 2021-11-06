
package RevoTMS;

class Route_class {
   
    private int route_no;
    private String routes;
    private int price;
    
    public Route_class(int route_no, String routes, int price){
        this.route_no = route_no;
        this.routes = routes;
        this.price = price;
    }


    
    public int getroute_no()
    {
        return route_no;
    }
    public String getroutes()
    {
        return routes;
    }
    public int getprice(){
        return price;
    }
}
