# budget book

An Android app that helps you track your spending and savings.

**Note**: This is a passion project that's developed for personal use. It is not intended to be released as a commercial product (yet).

## Features

Must-Haves:
* Add a new spend/save entry
  * Income or expenditure
  * Date
  * Amount
  * Image (optional)
    * From gallery or connect to phone camera
  * Description (optional)
* Edit an existing spend/save entry
  * Any of the fields
* Delete an existing spend/save entry
* View summary of spending/savings
  * Different periods
    * By day
    * By month
    * By year
  * Pie chart
* Backup to Google Drive

Nice-to-Haves:
* Different types of currency
  * Will be an app-wide change. All past entries will be updated with the new currency symbol.
  * User can provide an exchange rate to update past entries. Default rate is 1 (unchanged).
    * Some way to undo/confirm the change.
* Save goals (e.g. $150 for new mechanical keyboard, by 14 February)
  * Progress bar for how close you are to saving enough
  * Deadline (optional)
* Auto entries (e.g. automatically add salary entry on the 1st of the month)
  * Shortcut buttons (e.g. button to automatically add a $5 lunch expenditure)
* Export data as .xml or excel spreadsheet etc.
* Payment methods for backing up to Google Drive
  * Only if the app is tailored to become a commercial product.
* Import some existing ML library to parse photos of receipts and auto-populate spend entries

## Workflow

- [x] Define requirements
- [ ] Wireframing
- [ ] Development of core features
  - [ ] CRUD of entries with income/expenditure, date, amount and optional description
  - [ ] Daily/monthly summary
- [ ] Development of additional features
  - [ ] CRUD of entries with image from gallery or camera
  - [ ] Yearly summary
  - [ ] Backup to Google Drive
- [ ] Testing (should be done alongside development)
- [ ] Development of extra features & Testing
- [ ] Release on the Play Store (?)

## Aesthetics

Colour scheme: soft pastel colours, generally bright
Graphics: cute
Typeface: rounded sans serif font, not too small
Language: simple, minimal