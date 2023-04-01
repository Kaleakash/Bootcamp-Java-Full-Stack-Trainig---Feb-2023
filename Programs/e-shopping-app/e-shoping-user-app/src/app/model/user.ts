export class User {
    constructor(
    public id: number,
    public username: string,
    public fullName: string,
    public address:Address,
    public emailid: string,
    public password: string,
    public img: string,
    public contact: string){}
}
export class Address {
    constructor(
    public street: string,
    public city: string,
    public state: string,
    public country: string,
    public pincode:number){

    }
}