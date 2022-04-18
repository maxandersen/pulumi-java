// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codestarnotifications.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NotificationRuleTarget {
    private final String targetAddress;
    private final String targetType;

    @CustomType.Constructor
    private NotificationRuleTarget(
        @CustomType.Parameter("targetAddress") String targetAddress,
        @CustomType.Parameter("targetType") String targetType) {
        this.targetAddress = targetAddress;
        this.targetType = targetType;
    }

    public String targetAddress() {
        return this.targetAddress;
    }
    public String targetType() {
        return this.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRuleTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetAddress;
        private String targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRuleTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetAddress = defaults.targetAddress;
    	      this.targetType = defaults.targetType;
        }

        public Builder targetAddress(String targetAddress) {
            this.targetAddress = Objects.requireNonNull(targetAddress);
            return this;
        }
        public Builder targetType(String targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }        public NotificationRuleTarget build() {
            return new NotificationRuleTarget(targetAddress, targetType);
        }
    }
}
