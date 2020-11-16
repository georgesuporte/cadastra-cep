import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SiafiComponent } from './siafi.component';

describe('SiafiComponent', () => {
  let component: SiafiComponent;
  let fixture: ComponentFixture<SiafiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SiafiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SiafiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
