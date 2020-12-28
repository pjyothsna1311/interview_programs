package Interview;

import java.util.*;

public class Permission {

    String url;
    List<String> methods ;

    Permission(String url, List<String> methods){
        this.url = url;
        this.methods = methods;
    }

    public String toString() {
        return url + " " + methods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permission that = (Permission) o;
        return this.url.equals(that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, methods);
    }
}

class Client{
    public static void main(String[] args) {
        List<Permission> permlist = new ArrayList<>();
        List<String> methods = new ArrayList<>();
        methods.add("POST");
        methods.add("PUT");

        List<String> method1 = new ArrayList<>();
        method1.add("GET");

        List<String> method2 = new ArrayList<>();
        method2.add("POST");
        method2.add("PUT");
        method2.add("GET");

        Permission p1 = new Permission("/test",methods );
        Permission p2 = new Permission("/test",method1 );
        Permission p3 = new Permission("/test1",method2);

        permlist.add(p1);
        permlist.add(p2);
        permlist.add(p3);

        System.out.println(permlist);

        List<Permission> uniquepermlist = new ArrayList<>();
        uniquepermlist.add(p1);
        uniquepermlist.add(p2);
        uniquepermlist.add(p3);

        HashMap<String, List<String>> hm = new HashMap<>();
        for(Permission p : permlist) {
            if(hm.containsKey(p.url)){
                List<String> newList = hm.get(p.url);
                newList.addAll(p.methods);
                hm.put(p.url,newList);
            }else {
                hm.put(p.url, p.methods);
            }
        }
        for(Map.Entry<String,List<String>> map : hm.entrySet()) {
            System.out.println(map.getKey() + "  " + map.getValue());
        }

        //System.out.println(uniquepermlist);






    }
}
