// map the json file or backend json data 
export class Product {
    constructor(
        public pid?:number,
        public title?:string,
        public description?:string,
        public price?:number,
        public discountPercentage?:number,    
        public rating?:number,
        public stock?:number,
        public brand?:string,
        public category?:string,
        public cid?:number,
        public thumbnail?:string,
        public images?:string[]
        ){

        }
}
