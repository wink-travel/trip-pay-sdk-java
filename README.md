[![trippay.io logo](https://res.cloudinary.com/traveliko/image/upload/c_scale,h_75/v1632220708/trippay/brand/TP_logo_v2_PURPLE_trans.png)](https://trippay.io)

# TripPay Java SDK

Welcome to the Java SDK that enables you to communicate with all that the TripPay platform has to offer.

## Getting started
This SDK contains libraries you can leverage to communicate with the TripPay platform.

### Java Requirements
Maven artifacts were compiled with Java 21.

Spring is not required but we highly recommend you use. Our examples will be based on how to do it the "Spring way".

Download libraries from Maven Central Repository.

### Payment

[API documentation](https://docs.wink.travel/payment)

The Payment API exposes endpoints for affiliates and hotels to track bookings, analytics and funds availability. They can also choose to withdraw available funds to their bank account.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>payment-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(PaymentSDKConfiguration.class) or run a component scan over `io.trippay.sdk.payment` and `io.trippay.sdk.support`. That will give you access to the following Spring Beans:

- AccountApi: Manage your account(s) on Wink with the Account API.
- AccountMappingsApi: Manage your account mappings on Wink with the Account Mapping API.
- AgentApi: Create a booking contract as an Agent with the Agent API.
- ApplicationApi: Manage your applications.
- ContractApi: Retrieve booking contracts and cancel them if possible.
- ManagingEntityApi: Managed entities can be bound to applications and webhooks..
- MappingApi: More mapping features to control mappings between your system and Wink.
- PingApi: Easy way to check if you are connected and authenticated with the Wink platform.
- WebhookApi: Use the Webhook API to create webhooks to interface with the TripPay API.

### Payment Acquiring

[API documentation](https://docs.wink.travel/payment-acquiring)

The Payment Acquiring API exposes endpoints for affiliates to acquire a payment via our payment methods in their own applications. These are the same features we leverage in our payment Web Component.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>payment-acquiring-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(PaymentAcquiringSDKConfiguration.class) or run a component scan over `io.trippay.sdk.payment.acquiring` and `io.trippay.sdk.support`. That will give you access to the following Spring Beans:

- AffiliateApi: Retrieve affiliate facilitator data with the Affiliate API.
- ContractApi: Validate, price and execute a booking contract with the Contract API.
- StripeApi: Create an SCA / PSD2 compliant sale request with Stripe's payment gateway with the Stripe API.

## Configuration
You will need a client ID and a client secret to communicate with any of the Wink platform endpoints.

Steps: 
1. Register your personal user account
2. Log in to [https://sell.wink.travel](https://sell.wink.travel)
3. Click on your profile icon in the top-right corner and click Applications from the menu
5. Create a new Application 
6. The new application will provide you with clientId and secretKey

### Spring users
Add your credentials to your property file:

1. wink.travel.client.id=YOUR_CLIENT_ID
2. wink.travel.client.secret=YOUR_CLIENT_SECRET

### Non-Spring users
Create 2 environment variables in your preferred way:

1. WINK_TRAVEL_CLIENT_ID=YOUR_CLIENT_ID
2. WINK_TRAVEL_CLIENT_SECRET=YOUR_CLIENT_SECRET

## You might also be interested in...

- Wink IAM Java SDK repo: [https://github.com/wink-travel/iam-sdk-java](https://github.com/wink-travel/iam-sdk-java)
- Wink Java SDK repo: [https://github.com/wink-travel/wink-sdk-java](https://github.com/wink-travel/wink-sdk-java)
- WordPress: [https://wordpress.org/plugins/wink2travel/](https://wordpress.org/plugins/wink2travel/) 
