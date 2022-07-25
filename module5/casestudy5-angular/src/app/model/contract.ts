import {Customer} from "./customer";

export interface Contract {
  id: number;
  contractId: string;
  startDate: string;
  endDate: string;
  // customer: Customer;
  deposit: number;
  totalPayment: number;
}
