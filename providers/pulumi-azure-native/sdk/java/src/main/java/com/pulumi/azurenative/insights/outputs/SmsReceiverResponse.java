// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SmsReceiverResponse {
    /**
     * The country code of the SMS receiver.
     * 
     */
    private final String countryCode;
    /**
     * The name of the SMS receiver. Names must be unique across all receivers within an action group.
     * 
     */
    private final String name;
    /**
     * The phone number of the SMS receiver.
     * 
     */
    private final String phoneNumber;
    /**
     * The status of the receiver.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private SmsReceiverResponse(
        @CustomType.Parameter("countryCode") String countryCode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("phoneNumber") String phoneNumber,
        @CustomType.Parameter("status") String status) {
        this.countryCode = countryCode;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    /**
     * The country code of the SMS receiver.
     * 
    */
    public String countryCode() {
        return this.countryCode;
    }
    /**
     * The name of the SMS receiver. Names must be unique across all receivers within an action group.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The phone number of the SMS receiver.
     * 
    */
    public String phoneNumber() {
        return this.phoneNumber;
    }
    /**
     * The status of the receiver.
     * 
    */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmsReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String countryCode;
        private String name;
        private String phoneNumber;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SmsReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCode = defaults.countryCode;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.status = defaults.status;
        }

        public Builder countryCode(String countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public SmsReceiverResponse build() {
            return new SmsReceiverResponse(countryCode, name, phoneNumber, status);
        }
    }
}
