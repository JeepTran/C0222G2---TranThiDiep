export class Shape {
    private _x:number;
    private _y:number;
    constructor(a:number, b:number) {
        this._x=a;
        this._y=b;
    }

    get x(): number {
        return this._x;
    }

    set x(value: number) {
        this._x = value;
    }

    get y(): number {
        return this._y;
    }

    set y(value: number) {
        this._y = value;
    }
    toString():string{
        return `(x:${this.x}, y:${this.y})`;
    }
}