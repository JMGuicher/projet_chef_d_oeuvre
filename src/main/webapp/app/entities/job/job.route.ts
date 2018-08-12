import {Routes} from '@angular/router';

import {UserRouteAccessService} from '../../shared';
import {JobComponent} from './job.component';
import {JobDetailComponent} from './job-detail.component';
import {JobPopupComponent} from './job-dialog.component';
import {JobDeletePopupComponent} from './job-delete-dialog.component';

export const jobRoute: Routes = [
    {
        path: 'job',
        component: JobComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'app.job.home.title'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'JobRepository/:id',
        component: JobDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'app.job.home.title'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const jobPopupRoute: Routes = [
    {
        path: 'JobRepository-new',
        component: JobPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'app.job.home.title'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'JobRepository/:id/edit',
        component: JobPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'app.job.home.title'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'JobRepository/:id/delete',
        component: JobDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'app.job.home.title'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
