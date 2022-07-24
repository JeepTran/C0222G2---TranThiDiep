export interface Facility {
  id: string;
  name: string;
  area: number;
  cost: number;
  maxPeople: number;
  rentType: string;
  roomStandard?: string;
  otherConvenience?: string;
  poolArea?: number;
  numberOfFloor?: number;
  freeFacility?: string;
}

