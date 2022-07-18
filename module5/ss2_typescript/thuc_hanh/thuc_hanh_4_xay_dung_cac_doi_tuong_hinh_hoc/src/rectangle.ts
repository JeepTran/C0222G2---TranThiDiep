import {Shape} from "./shape";

export class Rectangle extends Shape implements IArea{

    constructor(a: number, b: number, private _width:number, private _height: number) {
        super(a, b);
    }

    area(): number {
        return this._width*this._height;
    }

    get width(): number {
        return this._width;
    }

    set width(value: number) {
        this._width = value;
    }

    get height(): number {
        return this._height;
    }

    set height(value: number) {
        this._height = value;
    }
}