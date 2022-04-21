// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.inputs;

import com.pulumi.azurenative.testbase.inputs.DistributionGroupListReceiverValueResponse;
import com.pulumi.azurenative.testbase.inputs.SubscriptionReceiverValueResponse;
import com.pulumi.azurenative.testbase.inputs.UserObjectReceiverValueResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A notification event receiver value.
 * 
 */
public final class NotificationReceiverValueResponse extends com.pulumi.resources.InvokeArgs {

    public static final NotificationReceiverValueResponse Empty = new NotificationReceiverValueResponse();

    /**
     * The user object receiver value.
     * 
     */
    @Import(name="distributionGroupListReceiverValue")
    private @Nullable DistributionGroupListReceiverValueResponse distributionGroupListReceiverValue;

    public Optional<DistributionGroupListReceiverValueResponse> distributionGroupListReceiverValue() {
        return Optional.ofNullable(this.distributionGroupListReceiverValue);
    }

    /**
     * The user object receiver value.
     * 
     */
    @Import(name="subscriptionReceiverValue")
    private @Nullable SubscriptionReceiverValueResponse subscriptionReceiverValue;

    public Optional<SubscriptionReceiverValueResponse> subscriptionReceiverValue() {
        return Optional.ofNullable(this.subscriptionReceiverValue);
    }

    /**
     * The user object receiver value.
     * 
     */
    @Import(name="userObjectReceiverValue")
    private @Nullable UserObjectReceiverValueResponse userObjectReceiverValue;

    public Optional<UserObjectReceiverValueResponse> userObjectReceiverValue() {
        return Optional.ofNullable(this.userObjectReceiverValue);
    }

    private NotificationReceiverValueResponse() {}

    private NotificationReceiverValueResponse(NotificationReceiverValueResponse $) {
        this.distributionGroupListReceiverValue = $.distributionGroupListReceiverValue;
        this.subscriptionReceiverValue = $.subscriptionReceiverValue;
        this.userObjectReceiverValue = $.userObjectReceiverValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationReceiverValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationReceiverValueResponse $;

        public Builder() {
            $ = new NotificationReceiverValueResponse();
        }

        public Builder(NotificationReceiverValueResponse defaults) {
            $ = new NotificationReceiverValueResponse(Objects.requireNonNull(defaults));
        }

        public Builder distributionGroupListReceiverValue(@Nullable DistributionGroupListReceiverValueResponse distributionGroupListReceiverValue) {
            $.distributionGroupListReceiverValue = distributionGroupListReceiverValue;
            return this;
        }

        public Builder subscriptionReceiverValue(@Nullable SubscriptionReceiverValueResponse subscriptionReceiverValue) {
            $.subscriptionReceiverValue = subscriptionReceiverValue;
            return this;
        }

        public Builder userObjectReceiverValue(@Nullable UserObjectReceiverValueResponse userObjectReceiverValue) {
            $.userObjectReceiverValue = userObjectReceiverValue;
            return this;
        }

        public NotificationReceiverValueResponse build() {
            return $;
        }
    }

}
