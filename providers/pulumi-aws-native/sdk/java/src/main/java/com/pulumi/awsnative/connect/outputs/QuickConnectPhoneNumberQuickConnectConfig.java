// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class QuickConnectPhoneNumberQuickConnectConfig {
    private final String phoneNumber;

    @CustomType.Constructor
    private QuickConnectPhoneNumberQuickConnectConfig(@CustomType.Parameter("phoneNumber") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String phoneNumber() {
        return this.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectPhoneNumberQuickConnectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectPhoneNumberQuickConnectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }        public QuickConnectPhoneNumberQuickConnectConfig build() {
            return new QuickConnectPhoneNumberQuickConnectConfig(phoneNumber);
        }
    }
}
