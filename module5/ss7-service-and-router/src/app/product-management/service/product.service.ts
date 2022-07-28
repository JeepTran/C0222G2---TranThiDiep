import {Injectable} from '@angular/core';
import {Product} from "../model/product";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  products: Product[] = [];
  private URL_PRODUCTS = "http://localhost:3000/product";

  constructor(private httpClient: HttpClient) {
    this.products.push({id: 6, name: "Samsung J3", price: 500000, description: "90%"});
  }

  getAll(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.URL_PRODUCTS);
  }

  saveProduct(product: Product): Observable<Product> {
    return this.httpClient.post<Product>(this.URL_PRODUCTS, product);
  }

  getProductById(id: number): Observable<Product> {
    return this.httpClient.get(this.URL_PRODUCTS + '/' + id);
  }

  editProduct(id: number, product: Product): Observable<Product> {
    return this.httpClient.put<Product>(`${this.URL_PRODUCTS}/edit/${id}`, product);
  }

  deleteProduct(id: number): Observable<Product> {
    return this.httpClient.delete(`${this.URL_PRODUCTS}/delete/${id}`);
  }
}
