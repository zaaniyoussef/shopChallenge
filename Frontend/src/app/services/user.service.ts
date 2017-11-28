import { Injectable } from '@angular/core';
import {Http,Headers} from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class UserService {

  constructor(private _http:Http) { }

  register(user){
    let headers = new Headers();
    headers.append('Content-type','application/json');
    return this._http.post('http://localhost:8080/user/register',user,{headers:headers})
    .map(res=>res.text());
  }

  login(user){
    let headers = new Headers();
    headers.append('Content-type','application/json');
    return this._http.get('http://localhost:8080/user/login/'+user.email+'/'+user.password,{headers:headers})
    .map(res => res.text() ? res.json() : res);
  }

  isLogedIn(){
    if(sessionStorage.getItem('user')){
      return true;
    }else{
      return false;
    }
  }
  
  allShops(){
    let headers = new Headers();
    headers.append('Content-type','application/json');
    return this._http.get('http://localhost:8080/shops',{headers:headers})
    .map(res => res.text() ? res.json() : res);
  }

  allShopsByStatus(){
    let headers = new Headers();
    headers.append('Content-type','application/json');
    return this._http.get('http://localhost:8080/user/shops/like',{headers:headers})
    .map(res => res.text() ? res.json() : res);
  }
  
  updateShop(shop){
    let headers = new Headers();
    headers.append('Content-type','application/json');
    return this._http.put('http://localhost:8080/shop/Update',shop,{headers:headers});
  }

}
