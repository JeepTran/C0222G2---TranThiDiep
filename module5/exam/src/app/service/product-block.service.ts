import {Injectable} from '@angular/core';
import {ProductBlock} from '../model/product-block';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Product} from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductBlockService {
  productBlocks: ProductBlock[] = [];
  // private URL_PRODUCTS = 'http://localhost:3000/products';
  // private URL_PRODUCT_BLOCKS = 'http://localhost:3000/productBlocks';
  private URL_PRODUCTS = 'http://localhost:8080/store/productList';
  private URL_PRODUCT_BLOCKS = 'http://localhost:8080/store/productBlockList';

  constructor(private httpClient: HttpClient) {
  }

  getAllProducts(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.URL_PRODUCTS);
  }

  getAllProductBlocks(): Observable<ProductBlock[]> {
    return this.httpClient.get<ProductBlock[]>(this.URL_PRODUCT_BLOCKS);
  }

  createProductBlock(productBlock: ProductBlock): Observable<ProductBlock> {
    return this.httpClient.post<ProductBlock>(this.URL_PRODUCT_BLOCKS, productBlock);
  }

  deleteProductBlock(id: number): Observable<ProductBlock> {
    return this.httpClient.delete<ProductBlock>(this.URL_PRODUCT_BLOCKS + '/' + id);
  }

  searchProductBlockByNameAndImportDateAndExpireDate(
    name: string, importDate: string, expireDate: string): Observable<ProductBlock[]> {
    return null;
  }

  searchProductBlockByNameAndExpireDate(
    name: string, expireDate: string): Observable<ProductBlock[]> {
    return this.httpClient.get<ProductBlock[]>(
      this.URL_PRODUCT_BLOCKS + '?product.name_like=' + name + '&expireDate_like=' + expireDate);
  }

  getProductBlockById(id: number): Observable<ProductBlock> {
    return this.httpClient.get<ProductBlock>(this.URL_PRODUCT_BLOCKS + '/' + id);
  }

  editProductBlockById(id: number, productBlock: ProductBlock): Observable<ProductBlock> {
    return this.httpClient.patch<ProductBlock>(this.URL_PRODUCT_BLOCKS + '/' + id, productBlock);
  }
}
