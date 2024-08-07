import { Component } from '@angular/core';
import { BOOK } from './Model/BOOK';
import { BookstoreService } from './bookstore.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'BOOKSTORE';

  book : BOOK;
   result :string;

   constructor(private service:BookstoreService){
    this.book=new BOOK();
    this.result="";
   }

  insertBook(data:any){
    this.book.id=data.bookId;
    this.book.bookName=data.bookName;
    this.book.bookAuthor=data.bookAuthor;
    this.result=this.service.insertBook(this.book);
}
}
