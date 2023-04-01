export class Cart {
    constructor(
        public id:number,
        public title:string,
        public description:string,
        public price:number,
        public discountPercentage:number,    
        public rating:number,
        public qty:number,
        public brand:string,
        public category:string,
        public thumbnail:string,
        public images:string[]
        ){

        }
}
