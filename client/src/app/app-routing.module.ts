import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TransferComponent } from './components/transfer/transfer.component';
import { CounterpartyComponent } from './components/counterparty/counterparty.component';
import { VASPComponent } from './components/vasp/vasp.component';


const routes: Routes = [
  { path: 'counterparties', component: CounterpartyComponent },
  { path: 'transfers', component: TransferComponent },
  { path: 'vasps', component: VASPComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
