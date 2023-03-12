import {Injectable} from '@angular/core';

@Injectable()
export class LoginService {


    checkUser(login:any):boolean {
        if(login.email=="raj@gmail.com" && login.password=="123"){
            return true;
        }else {
            return false;
        }
    }
}