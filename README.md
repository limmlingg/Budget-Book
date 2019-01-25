# budget book

An Android app that helps you track your spending and savings.

**Note**: This is a passion project that's developed for personal use. It is not intended to be released as a commercial product (yet).

## Features

Must-Haves:
* Add a new spend/income entry
  * Income or expenditure
  * Date
  * Amount
  * Category (defaults to uncategorised)
  * Image (optional)
    * From gallery or connect to phone camera
  * Description (optional)
* Edit an existing spend/income entry
  * Any of the fields
  * Upon changing the image, the old image will be discarded (unless it has been backed up, and the user restores the backup)
* Delete an existing spend/income entry
* View summary of spending/income
  * Different periods
    * By day
    * By month
    * By year
  * Pie chart
* Back up
  * Local storage (automatic, offline)
  * Google Drive (requires internet connection, can change backup location/file name)
  * "Back up now" to force an immediate local and Google Drive save (if connected to a Google Drive account)
  * "Sync from Google Drive" to pull Google Drive data, saves to local storage as well (can't undo!)

Nice-to-Haves:
* Different types of currency
  * Will be an app-wide change. All past entries will be updated with the new currency symbol.
  * User can provide an exchange rate to update past entries. Default rate is 1 (unchanged).
    * Some way to undo/confirm the change.
* More user options
  * Auto entries (e.g. automatically add salary entry on the 1st of the month)
    * Shortcut buttons (e.g. button to automatically add a $5 lunch expenditure)
  * Customise categories
    * Icon from provided list or gallery image
      * Notify if icon from provided list is being used as the icon for another category.
    * Category names must be unique
    * Able to have sub-categories (e.g. food -> snacks)
    * If a category is deleted, all past entries with that category is converted to "uncategorised"
      * "uncategorised" cannot be deleted, but can be renamed.
  * Default default entry options
  * Change back up options
    * Auto back up (will require internet connection to perform auto back up to Google Drive)
    * Back up only when button is clicked
  * Export data as .xml or excel spreadsheet etc.
* Payment methods for backing up to Google Drive
  * Only if the app is tailored to become a commercial product.
* Import some existing ML library to parse photos of receipts and auto-populate spend entries

## Progress

- [x] Define requirements
- [x] Wireframing
  - [x] Landing screen
  - [x] Create/edit entry screen
  - [x] Summary screen
  - [x] Settings screen
- [ ] Development of core features
  - [ ] CRUD of entries with income/expenditure, date, amount, one of the preset categories and optional description
  - [ ] Daily/monthly summary
- [ ] Development of additional required features
  - [ ] CRUD of entries with image from gallery or camera
  - [ ] Customisable categories
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
