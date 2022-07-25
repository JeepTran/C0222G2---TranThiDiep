import {CustomerType} from "./customer-type";

export interface Customer {
  id:number;
  name: string;
  dob:string;
  gender:number;
  customerType:CustomerType;
  idCard:string;
  phone:string;
  email:string;
  address:string;
}
