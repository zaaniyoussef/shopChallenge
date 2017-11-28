import { EventManagePage } from './app.po';

describe('shop-challenge', () => {
  let page: EventManagePage;

  beforeEach(() => {
    page = new EventManagePage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
