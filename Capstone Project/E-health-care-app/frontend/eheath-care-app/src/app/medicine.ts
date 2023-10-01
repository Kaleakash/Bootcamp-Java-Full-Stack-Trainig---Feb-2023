// map model class with entity class in backend and entity class map to table. to map to json data. 
export class Medicine {
constructor(
    public mid:number,
    public mname:string,
    public price:number,
    public qty:number,
    public imageurl:string,
    public description:string)
    {
    
    }
}
