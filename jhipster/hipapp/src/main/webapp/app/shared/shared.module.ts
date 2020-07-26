import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { HipappSharedLibsModule, HipappSharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [HipappSharedLibsModule, HipappSharedCommonModule],
  declarations: [HasAnyAuthorityDirective],
  exports: [HipappSharedCommonModule, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class HipappSharedModule {
  static forRoot() {
    return {
      ngModule: HipappSharedModule
    };
  }
}
