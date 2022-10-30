[![wink.travel logo](https://res.cloudinary.com/traveliko/image/upload/c_scale,h_75/v1632220708/trippay/brand/TP_logo_v2_PURPLE_trans.png)](https://trippay.io)

# TripPay Java SDK

Welcome to the Java SDK that enables you to communicate with all that the TripPay platform has to offer.

## Getting started
This SDK contains libraries you can leverage to communicate with the TripPay platform.

### Java Requirements
Maven artifacts were compiled with Java 17. Java 1.8 is the lowest supported version.

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

Using Spring, @Import(PaymentSDKConfiguration.class) or run a component scan over `travel.wink.sdk.payment` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- AccountApi: Manage your account(s) on Wink with the Account API.
- AccountMappingsApi: Manage your account mappings on Wink with the Account Mapping API.
- AgentApi: Create a booking contract as an Agent with the Agent API.
- ContractApi: Retrieve booking contracts and cancel them if possible.
- MappingApi: More mapping features to control mappings between your system and Wink.
- PingApi: Easy way to check if you are connected and authenticated with the Wink platform.

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

Using Spring, @Import(PaymentAcquiringSDKConfiguration.class) or run a component scan over `travel.wink.sdk.payment.acquiring` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- AffiliateApi: Retrieve affiliate facilitator data with the Affiliate API.
- ContractApi: Validate, price and execute a booking contract with the Contract API.
- NmiApi: Create an SCA / PSD2 compliant sale request through NMI's payment gateway (U.S. only) with the NMI API.
- StripeApi: Create an SCA / PSD2 compliant sale request with Stripe's payment gateway with the Stripe API.

## Configuration
You will need a client ID and a client secret to communicate with any of the Wink platform endpoints. You can create your account and get your credentials here:

[https://sell.wink.travel](https://sell.wink.travel)

Steps: 
1. Register your personal user account
2. Log in
3. Create your first account
4. Select that account
5. Choose to create an Application for that account 
6. The application will hold your credentials

### Spring users
Add your credentials to your property file:

1. wink.travel.client.id=YOUR_CLIENT_ID
2. wink.travel.client.secret=YOUR_CLIENT_SECRET

### Non-Spring users
Create 2 environment variables in your preferred way:

1. WINK_TRAVEL_CLIENT_ID=YOUR_CLIENT_ID
2. WINK_TRAVEL_CLIENT_SECRET=YOUR_CLIENT_SECRET

## You might also be interested in...
If you are developing for WordPress, we've [probably] got you covered. Check out our WordPress plugin:

- Wink Java SDK repo: [https://github.com/wink-travel/wink-sdk-java](https://github.com/wink-travel/wink-sdk-java)
- Wink WordPress plugin repo: [https://github.com/wink-travel/affiliate-wordpress-plugin](https://github.com/wink-travel/affiliate-wordpress-plugin)
- Wink WordPress Divi plugin repo: [https://github.com/wink-travel/affiliate-wordpress-divi-plugin](https://github.com/wink-travel/affiliate-wordpress-divi-plugin)
- WordPress: [https://wordpress.org/plugins/iko-travel-affiliate/](https://wordpress.org/plugins/iko-travel-affiliate/) 
