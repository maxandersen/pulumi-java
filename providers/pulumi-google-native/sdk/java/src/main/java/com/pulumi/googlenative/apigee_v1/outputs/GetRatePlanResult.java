// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1RateRangeResponse;
import com.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1RevenueShareRangeResponse;
import com.pulumi.googlenative.apigee_v1.outputs.GoogleTypeMoneyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRatePlanResult {
    /**
     * Name of the API product that the rate plan is associated with.
     * 
     */
    private final String apiproduct;
    /**
     * Frequency at which the customer will be billed.
     * 
     */
    private final String billingPeriod;
    /**
     * API call volume ranges and the fees charged when the total number of API calls is within a given range. The method used to calculate the final fee depends on the selected pricing model. For example, if the pricing model is `STAIRSTEP` and the ranges are defined as follows: ```{ &#34;start&#34;: 1, &#34;end&#34;: 100, &#34;fee&#34;: 75 }, { &#34;start&#34;: 101, &#34;end&#34;: 200, &#34;fee&#34;: 100 }, }``` Then the following fees would be charged based on the total number of API calls (assuming the currency selected is `USD`): * 1 call costs $75 * 50 calls cost $75 * 150 calls cost $100 The number of API calls cannot exceed 200.
     * 
     */
    private final List<GoogleCloudApigeeV1RateRangeResponse> consumptionPricingRates;
    /**
     * Pricing model used for consumption-based charges.
     * 
     */
    private final String consumptionPricingType;
    /**
     * Time that the rate plan was created in milliseconds since epoch.
     * 
     */
    private final String createdAt;
    /**
     * Currency to be used for billing. Consists of a three-letter code as defined by the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) standard.
     * 
     */
    private final String currencyCode;
    /**
     * Description of the rate plan.
     * 
     */
    private final String description;
    /**
     * Display name of the rate plan.
     * 
     */
    private final String displayName;
    /**
     * Time when the rate plan will expire in milliseconds since epoch. Set to 0 or `null` to indicate that the rate plan should never expire.
     * 
     */
    private final String endTime;
    /**
     * Frequency at which the fixed fee is charged.
     * 
     */
    private final Integer fixedFeeFrequency;
    /**
     * Fixed amount that is charged at a defined interval and billed in advance of use of the API product. The fee will be prorated for the first billing period.
     * 
     */
    private final GoogleTypeMoneyResponse fixedRecurringFee;
    /**
     * Time the rate plan was last modified in milliseconds since epoch.
     * 
     */
    private final String lastModifiedAt;
    /**
     * Name of the rate plan.
     * 
     */
    private final String name;
    /**
     * Details of the revenue sharing model.
     * 
     */
    private final List<GoogleCloudApigeeV1RevenueShareRangeResponse> revenueShareRates;
    /**
     * Method used to calculate the revenue that is shared with developers.
     * 
     */
    private final String revenueShareType;
    /**
     * Initial, one-time fee paid when purchasing the API product.
     * 
     */
    private final GoogleTypeMoneyResponse setupFee;
    /**
     * Time when the rate plan becomes active in milliseconds since epoch.
     * 
     */
    private final String startTime;
    /**
     * Current state of the rate plan (draft or published).
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetRatePlanResult(
        @CustomType.Parameter("apiproduct") String apiproduct,
        @CustomType.Parameter("billingPeriod") String billingPeriod,
        @CustomType.Parameter("consumptionPricingRates") List<GoogleCloudApigeeV1RateRangeResponse> consumptionPricingRates,
        @CustomType.Parameter("consumptionPricingType") String consumptionPricingType,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("currencyCode") String currencyCode,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("fixedFeeFrequency") Integer fixedFeeFrequency,
        @CustomType.Parameter("fixedRecurringFee") GoogleTypeMoneyResponse fixedRecurringFee,
        @CustomType.Parameter("lastModifiedAt") String lastModifiedAt,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("revenueShareRates") List<GoogleCloudApigeeV1RevenueShareRangeResponse> revenueShareRates,
        @CustomType.Parameter("revenueShareType") String revenueShareType,
        @CustomType.Parameter("setupFee") GoogleTypeMoneyResponse setupFee,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state) {
        this.apiproduct = apiproduct;
        this.billingPeriod = billingPeriod;
        this.consumptionPricingRates = consumptionPricingRates;
        this.consumptionPricingType = consumptionPricingType;
        this.createdAt = createdAt;
        this.currencyCode = currencyCode;
        this.description = description;
        this.displayName = displayName;
        this.endTime = endTime;
        this.fixedFeeFrequency = fixedFeeFrequency;
        this.fixedRecurringFee = fixedRecurringFee;
        this.lastModifiedAt = lastModifiedAt;
        this.name = name;
        this.revenueShareRates = revenueShareRates;
        this.revenueShareType = revenueShareType;
        this.setupFee = setupFee;
        this.startTime = startTime;
        this.state = state;
    }

    /**
     * Name of the API product that the rate plan is associated with.
     * 
    */
    public String apiproduct() {
        return this.apiproduct;
    }
    /**
     * Frequency at which the customer will be billed.
     * 
    */
    public String billingPeriod() {
        return this.billingPeriod;
    }
    /**
     * API call volume ranges and the fees charged when the total number of API calls is within a given range. The method used to calculate the final fee depends on the selected pricing model. For example, if the pricing model is `STAIRSTEP` and the ranges are defined as follows: ```{ &#34;start&#34;: 1, &#34;end&#34;: 100, &#34;fee&#34;: 75 }, { &#34;start&#34;: 101, &#34;end&#34;: 200, &#34;fee&#34;: 100 }, }``` Then the following fees would be charged based on the total number of API calls (assuming the currency selected is `USD`): * 1 call costs $75 * 50 calls cost $75 * 150 calls cost $100 The number of API calls cannot exceed 200.
     * 
    */
    public List<GoogleCloudApigeeV1RateRangeResponse> consumptionPricingRates() {
        return this.consumptionPricingRates;
    }
    /**
     * Pricing model used for consumption-based charges.
     * 
    */
    public String consumptionPricingType() {
        return this.consumptionPricingType;
    }
    /**
     * Time that the rate plan was created in milliseconds since epoch.
     * 
    */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * Currency to be used for billing. Consists of a three-letter code as defined by the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) standard.
     * 
    */
    public String currencyCode() {
        return this.currencyCode;
    }
    /**
     * Description of the rate plan.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Display name of the rate plan.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Time when the rate plan will expire in milliseconds since epoch. Set to 0 or `null` to indicate that the rate plan should never expire.
     * 
    */
    public String endTime() {
        return this.endTime;
    }
    /**
     * Frequency at which the fixed fee is charged.
     * 
    */
    public Integer fixedFeeFrequency() {
        return this.fixedFeeFrequency;
    }
    /**
     * Fixed amount that is charged at a defined interval and billed in advance of use of the API product. The fee will be prorated for the first billing period.
     * 
    */
    public GoogleTypeMoneyResponse fixedRecurringFee() {
        return this.fixedRecurringFee;
    }
    /**
     * Time the rate plan was last modified in milliseconds since epoch.
     * 
    */
    public String lastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Name of the rate plan.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Details of the revenue sharing model.
     * 
    */
    public List<GoogleCloudApigeeV1RevenueShareRangeResponse> revenueShareRates() {
        return this.revenueShareRates;
    }
    /**
     * Method used to calculate the revenue that is shared with developers.
     * 
    */
    public String revenueShareType() {
        return this.revenueShareType;
    }
    /**
     * Initial, one-time fee paid when purchasing the API product.
     * 
    */
    public GoogleTypeMoneyResponse setupFee() {
        return this.setupFee;
    }
    /**
     * Time when the rate plan becomes active in milliseconds since epoch.
     * 
    */
    public String startTime() {
        return this.startTime;
    }
    /**
     * Current state of the rate plan (draft or published).
     * 
    */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRatePlanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiproduct;
        private String billingPeriod;
        private List<GoogleCloudApigeeV1RateRangeResponse> consumptionPricingRates;
        private String consumptionPricingType;
        private String createdAt;
        private String currencyCode;
        private String description;
        private String displayName;
        private String endTime;
        private Integer fixedFeeFrequency;
        private GoogleTypeMoneyResponse fixedRecurringFee;
        private String lastModifiedAt;
        private String name;
        private List<GoogleCloudApigeeV1RevenueShareRangeResponse> revenueShareRates;
        private String revenueShareType;
        private GoogleTypeMoneyResponse setupFee;
        private String startTime;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRatePlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiproduct = defaults.apiproduct;
    	      this.billingPeriod = defaults.billingPeriod;
    	      this.consumptionPricingRates = defaults.consumptionPricingRates;
    	      this.consumptionPricingType = defaults.consumptionPricingType;
    	      this.createdAt = defaults.createdAt;
    	      this.currencyCode = defaults.currencyCode;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.endTime = defaults.endTime;
    	      this.fixedFeeFrequency = defaults.fixedFeeFrequency;
    	      this.fixedRecurringFee = defaults.fixedRecurringFee;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.name = defaults.name;
    	      this.revenueShareRates = defaults.revenueShareRates;
    	      this.revenueShareType = defaults.revenueShareType;
    	      this.setupFee = defaults.setupFee;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder apiproduct(String apiproduct) {
            this.apiproduct = Objects.requireNonNull(apiproduct);
            return this;
        }
        public Builder billingPeriod(String billingPeriod) {
            this.billingPeriod = Objects.requireNonNull(billingPeriod);
            return this;
        }
        public Builder consumptionPricingRates(List<GoogleCloudApigeeV1RateRangeResponse> consumptionPricingRates) {
            this.consumptionPricingRates = Objects.requireNonNull(consumptionPricingRates);
            return this;
        }
        public Builder consumptionPricingRates(GoogleCloudApigeeV1RateRangeResponse... consumptionPricingRates) {
            return consumptionPricingRates(List.of(consumptionPricingRates));
        }
        public Builder consumptionPricingType(String consumptionPricingType) {
            this.consumptionPricingType = Objects.requireNonNull(consumptionPricingType);
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = Objects.requireNonNull(currencyCode);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder fixedFeeFrequency(Integer fixedFeeFrequency) {
            this.fixedFeeFrequency = Objects.requireNonNull(fixedFeeFrequency);
            return this;
        }
        public Builder fixedRecurringFee(GoogleTypeMoneyResponse fixedRecurringFee) {
            this.fixedRecurringFee = Objects.requireNonNull(fixedRecurringFee);
            return this;
        }
        public Builder lastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder revenueShareRates(List<GoogleCloudApigeeV1RevenueShareRangeResponse> revenueShareRates) {
            this.revenueShareRates = Objects.requireNonNull(revenueShareRates);
            return this;
        }
        public Builder revenueShareRates(GoogleCloudApigeeV1RevenueShareRangeResponse... revenueShareRates) {
            return revenueShareRates(List.of(revenueShareRates));
        }
        public Builder revenueShareType(String revenueShareType) {
            this.revenueShareType = Objects.requireNonNull(revenueShareType);
            return this;
        }
        public Builder setupFee(GoogleTypeMoneyResponse setupFee) {
            this.setupFee = Objects.requireNonNull(setupFee);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetRatePlanResult build() {
            return new GetRatePlanResult(apiproduct, billingPeriod, consumptionPricingRates, consumptionPricingType, createdAt, currencyCode, description, displayName, endTime, fixedFeeFrequency, fixedRecurringFee, lastModifiedAt, name, revenueShareRates, revenueShareType, setupFee, startTime, state);
        }
    }
}
