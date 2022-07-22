import {Component, OnInit} from '@angular/core';
import {Todo} from './todo';
import {FormControl} from '@angular/forms';

let _id = 1;

@Component({
  selector: 'app-thuc-hanh-todo',
  templateUrl: './thuc-hanh-todo.component.html',
  styleUrls: ['./thuc-hanh-todo.component.css']
})
export class ThucHanhTodoComponent implements OnInit {
  todos: Todo[] = [];
  content = new FormControl();

  constructor() {
  }

  ngOnInit(): void {
  }

  toggleTodo(i: number) {
    this.todos[i].complete = !this.todos[i].complete;
  }

  change() {
    const value = this.content.value;
    if (value) {
      const todo: Todo = {
        id: _id++,
        content: value,
        complete: false
      };
      this.todos.push(todo);
      this.content.reset();
    }
  }
}
