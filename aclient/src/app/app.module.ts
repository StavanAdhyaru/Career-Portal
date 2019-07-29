import { BrowserModule } from '@angular/platform-browser';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CpUsersListComponent } from './cpusersList/cpUsers-list.component';
import { CpUsersFormComponent } from './cpUsers-form/cpUsers-form.component';
import {CpUsersService} from './cpUsers.service';
import {CpUserProfileService} from './cp-user-profile.service';
import {CpJobService} from './cp-job.service';
import {CpDocumentService} from './cp-document.service';
import { CpUserProfileListComponent } from './cp-user-profile-list/cp-user-profile-list.component';
import { CpJobListComponent } from './cp-job-list/cp-job-list.component';
import { CpDocumentListComponent } from './cp-document-list/cp-document-list.component';
import { CpUserProfileFormComponent } from './cp-user-profile-form/cp-user-profile-form.component';
import {JobByIdService} from './job-by-id.service';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {Globals} from './global';
import { FlexLayoutModule } from '@angular/flex-layout';
import { AdminAllJobsListComponent } from './admin-all-jobs-list/admin-all-jobs-list.component';
import { UserByIdComponent } from './user-by-id/user-by-id.component';
import { AdminJobDetailComponent } from './admin-job-detail/admin-job-detail.component';
import { ApplicationTableComponent } from './application-table/application-table.component';
import { ApplicationTableService } from './application-table.service';
import { LastComponent } from './last/last.component';
import { LastService} from './last.service';
import { CpJobApplicationService} from './cp-job-application.service';
import {FileUploadModule} from 'ng2-file-upload';
import {CookieService} from 'ngx-cookie-service';
import {LocationStrategy, HashLocationStrategy} from '@angular/common';
import {FileUploadService} from './file-upload.service';

// Angular Material Imports
import { JobByIdComponent } from './job-by-id/job-by-id.component';
import {MatListModule} from '@angular/material/list';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatIconModule} from '@angular/material/icon';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material'
import { CpJobFormComponent } from './cp-job-form/cp-job-form.component';
import {MatSelectModule} from '@angular/material/select';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatToolbarModule} from '@angular/material/toolbar';
import { MainNavComponent } from './main-nav/main-nav.component';
import { LayoutModule } from '@angular/cdk/layout';
import { AppliedJobListComponent } from './applied-job-list/applied-job-list.component';
import { AppliedJobService } from './applied-job.service';
import {MatCardModule} from '@angular/material/card';
import { LoginComponent } from './login/login.component';
import {MatTableModule} from '@angular/material/table';
import { MyJobDetailComponent } from './my-job-detail/my-job-detail.component';
import {MatPaginatorModule} from '@angular/material/paginator';
import {MatMenuModule} from '@angular/material/menu';
import {MatExpansionModule} from '@angular/material/expansion';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import { FileUploadComponent } from './file-upload/file-upload.component';
import { AddUserComponent } from './add-user/add-user.component';
import { HomeComponent } from './home/home.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { NewAdminComponent } from './new-admin/new-admin.component';
import { ViewUserDetailService } from './view-user-detail.service';
import {MatDialogModule} from '@angular/material/dialog';
import { MessageComponent } from './dialog/message/message.component';
import { ChangePasswordComponent } from './change-password/change-password.component';
@NgModule({
  declarations: [
    AppComponent,
    CpUsersListComponent,
    CpUsersFormComponent,
    CpUserProfileListComponent,
    CpJobListComponent,
    CpDocumentListComponent,
    CpUserProfileFormComponent,
    JobByIdComponent,
    CpJobFormComponent,
    MainNavComponent,
    AppliedJobListComponent,
    LoginComponent,
    MyJobDetailComponent,
    AdminAllJobsListComponent,
    UserByIdComponent,
    AdminJobDetailComponent,
    ApplicationTableComponent,
    LastComponent,
    FileUploadComponent,
    AddUserComponent,
    HomeComponent,
    ForgotPasswordComponent,
    NewAdminComponent,
    MessageComponent,
    ChangePasswordComponent,
  ],
  schemas:[CUSTOM_ELEMENTS_SCHEMA],
    imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    FileUploadModule,
    BrowserAnimationsModule,
    MatListModule,
    MatCheckboxModule,
    MatIconModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatDatepickerModule,
    MatSelectModule,
    MatSidenavModule,
    MatToolbarModule,
    LayoutModule,
    MatCardModule,
    MatTableModule,
    MatPaginatorModule,
    FlexLayoutModule,
    MatMenuModule,
    MatExpansionModule,
    MatNativeDateModule,
    MatSlideToggleModule,
    MatDialogModule,
  ],
  entryComponents:[
    MessageComponent,
  ],
  providers: [CpUsersService,CpUserProfileService,CpJobService,CpDocumentService,JobByIdService,AppliedJobService,Globals,ApplicationTableService,LastService,CpJobApplicationService,CookieService,FileUploadService,ViewUserDetailService, {provide: LocationStrategy, useClass: HashLocationStrategy}],
  bootstrap: [AppComponent]
})
export class AppModule { }
