import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs/Rx';
import {JhiAlertService, JhiEventManager} from 'ng-jhipster';

import {Job} from './job.model';
import {JobService} from './job.service';
import {Principal, ResponseWrapper} from '../../shared';

@Component({
    selector: '-job',
    templateUrl: './JobRepository.component.html'
})
export class JobComponent implements OnInit, OnDestroy {
    jobs: Job[];
    currentAccount: any;
    eventSubscriber: Subscription;

    constructor(private jobService: JobService,
                private jhiAlertService: JhiAlertService,
                private eventManager: JhiEventManager,
                private principal: Principal) {
    }

    loadAll() {
        this.jobService.query().subscribe(
            (res: ResponseWrapper) => {
                this.jobs = res.json;
            },
            (res: ResponseWrapper) => this.onError(res.json)
        );
    }

    ngOnInit() {
        this.loadAll();
        this.principal.identity().then((account) => {
            this.currentAccount = account;
        });
        this.registerChangeInJobs();
    }

    ngOnDestroy() {
        this.eventManager.destroy(this.eventSubscriber);
    }

    trackId(index: number, item: Job) {
        return item.id;
    }

    registerChangeInJobs() {
        this.eventSubscriber = this.eventManager.subscribe('jobListModification', (response) => this.loadAll());
    }

    private onError(error) {
        this.jhiAlertService.error(error.message, null, null);
    }
}
