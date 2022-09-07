import {Category} from "./category";

export interface Product {
  id?: number,
  image?: string,
  name?: string,
  originPrice?:number,
  color?: string,
  capacity?: string,
  originCountry?: string,
  publishDate?: Date,
  discountPercentage?: number,
  description?: string,
  techSpecification?: string,
  productSet?: string,
  category?: Category,

}
