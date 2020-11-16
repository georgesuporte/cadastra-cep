import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GiaComponent } from './gia.component';

describe('GiaComponent', () => {
  let component: GiaComponent;
  let fixture: ComponentFixture<GiaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GiaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GiaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
