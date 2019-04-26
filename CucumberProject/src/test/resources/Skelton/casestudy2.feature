Feature: CaseStudy2
Scenario: The one where the user added atleast one product to cart and pperforming the payment to successful order
    Given URL of then TestMeApp
    When Lary added a Headphone to cart
    And checkout for payment
    And  fill transaction details
    Then  product has been successfully ordered