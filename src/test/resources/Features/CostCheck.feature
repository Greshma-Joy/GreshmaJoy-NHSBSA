Feature: NHS Cost Check Service
  As a citizen of the UK
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need

  Background: Start cost check
   When I click on Start Now
   Then I should get navigated to select country page and validate the page
  @Acceptance
  Scenario Outline: Cost checking
    Given I select "<country>"
    When I put my circumstances into the Checker tool "<isgp>" and "<dental>" and "<date>" and "<month>" and "<year>" and "<partner>" and "<tax>" and "<universalcredit>" and "<usecredit>" and "<creditperiod>" and "<benefits>" and "<taxcredit>" and "<income>" and "<pregnant>" and "<injury>" and "<diabetics>" and "<glaucoma>" and "<carehome>" and "<savings>"
    Then I should get a result of whether I will get help or not
    Examples:
      | country          | isgp | dental  | date | month | year | partner | tax | universalcredit | usecredit | creditperiod | benefits   | taxcredit       | income | pregnant | injury | diabetics | glaucoma | carehome | savings |
      | England          | Yes  | England | 08   | 04    | 1997 | No      | Yes | Yescredit       | Yes       | Yes          | NA         | NA              | NA     | NA       | NA     | NA        | NA       | NA       | NA      |
      | Scotland         | No   | Scotland| 18   | 12    | 1993 | Yes     | Yes | No              | NA        | NA           | Tax Credit | WorkingTaxChild | Yes    | NA       | NA     | NA        | NA       | NA       | NA      |
      | Wales            | No   | No      | 02   | 11    | 1993 | Yes     | No  | NA              | NA        | NA           | NA         | NA              | NA     | Yes      | No     | No        | No       | No       | No      |

  @Acceptance
  Scenario: Cost checking for Northern Ireland
    When I put circumstance country as "Northern Ireland"
    Then I should get cannot use this service because you live in Northern Ireland


