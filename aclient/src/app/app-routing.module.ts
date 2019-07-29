import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CpUsersListComponent} from './cpusersList/cpUsers-list.component';
import {CpUsersFormComponent} from './cpUsers-form/cpUsers-form.component';
import {CpUserProfileListComponent} from './cp-user-profile-list/cp-user-profile-list.component';
import {CpJobListComponent} from './cp-job-list/cp-job-list.component';
import { CpDocumentListComponent } from './cp-document-list/cp-document-list.component';
import { CpUserProfileFormComponent } from './cp-user-profile-form/cp-user-profile-form.component';
import {JobByIdComponent} from './job-by-id/job-by-id.component';
import { CpJobFormComponent } from './cp-job-form/cp-job-form.component';
import { AppliedJobListComponent } from './applied-job-list/applied-job-list.component';
import { LoginComponent } from './login/login.component';
import { MyJobDetailComponent } from './my-job-detail/my-job-detail.component';
import { AdminAllJobsListComponent} from './admin-all-jobs-list/admin-all-jobs-list.component';
import { UserByIdComponent} from './user-by-id/user-by-id.component';
import { AdminJobDetailComponent} from './admin-job-detail/admin-job-detail.component';
import { ApplicationTableComponent} from './application-table/application-table.component';
import { LastComponent} from './last/last.component';
import { FileUploadComponent } from './file-upload/file-upload.component';
import { AddUserComponent } from './add-user/add-user.component';
import { HomeComponent } from './home/home.component';
import { MainNavComponent } from './main-nav/main-nav.component';
import { NewAdminComponent } from './new-admin/new-admin.component';
import { ChangePasswordComponent } from './change-password/change-password.component';
const routes: Routes = [
  { path: '', component: LoginComponent,},
  { path: 'createAccount', component: AddUserComponent},
  { path: 'Main', component: MainNavComponent,
  children:[ 
  
  { path: 'Details', component: CpUsersListComponent },
  { path: 'addDetail', component: CpUsersFormComponent },
  { path: 'profileDetail/:id', component: CpUserProfileListComponent },
  { path: 'jobDetail', component: CpJobListComponent },
  { path: 'documentDetail', component: CpDocumentListComponent },
  { path: 'addProfileDetail', component: CpUserProfileFormComponent},
  { path: 'jobId/:id', component: JobByIdComponent },
  { path: 'addJobDetail', component: CpJobFormComponent},
  { path: 'appliedJob', component: AppliedJobListComponent},
  { path: 'mjd/:jobid', component: MyJobDetailComponent},
  { path: 'allAdminJobs', component: AdminAllJobsListComponent },
  { path: 'UserById/:id', component: UserByIdComponent },
  { path: 'adminJob/:id', component: AdminJobDetailComponent},
  { path: 'applicationTable/:jobid', component: ApplicationTableComponent},
  { path: 'last', component: LastComponent},
  { path: 'f', component: FileUploadComponent},
  { path: 'home', component: HomeComponent},
  { path: 'newAdmin', component: NewAdminComponent},
  { path: 'changePassword', component: ChangePasswordComponent}
    ]  }
    

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
