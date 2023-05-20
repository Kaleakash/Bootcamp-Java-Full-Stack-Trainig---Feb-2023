export class Order {
    constructor(
        public orderid?:number,
        public orderDate?:String,
        public orderStatus:string="pending",
            public products?:Array<OrderProducts>,
        public totalItems?:number,
        public itemsSubTotal?:number,
        public shipmentCharges?:number,
        public totalAmount?:number,
        public paymentStatus?:string,
        public paymentMethodTitle?:string,
        public email?:string,
        ) {}
}
export class OrderProducts{
    constructor(
        public id?:number,
        public productTitle?:string,
        public productImg?:string,
        public brand?:string,
        public productDescription?:string,
        public productCategory?:string,
        public price?:number,
        public quantity?:number,
        public totalPrice?:number){}
}