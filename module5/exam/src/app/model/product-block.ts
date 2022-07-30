import {Product} from './product';

export interface ProductBlock {
  id: number;
  blockId: string;
  product: Product;
  quantity: number;
  importDate: string;
  manufactureDate: string;
  expireDate: string;
}
