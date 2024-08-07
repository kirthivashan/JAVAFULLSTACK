import { HttpClient, HttpClientJsonpModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BOOK } from './Model/BOOK';

@Injectable({
  providedIn: 'root'
})
export class BookstoreService {
  url:string;
 book:BOOK;

  constructor(private http:HttpClient) {
    this.url="http://localhost:3004/books";
    this.book=new BOOK();
   }

   insertBook(book  : BOOK){
    this.http.post<BOOK>(this.url,book).subscribe();
    return "Data Inserted Succesfully";
   }
}
