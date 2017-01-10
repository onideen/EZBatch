import { EzbatchWebPage } from './app.po';

describe('ezbatch-web App', function() {
  let page: EzbatchWebPage;

  beforeEach(() => {
    page = new EzbatchWebPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
