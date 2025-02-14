// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.outputs;

import com.pulumi.azurenative.providerhub.outputs.SubscriptionStateOverrideActionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications {
    private final @Nullable String softDeleteTTL;
    private final @Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions;

    @CustomType.Constructor
    private ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications(
        @CustomType.Parameter("softDeleteTTL") @Nullable String softDeleteTTL,
        @CustomType.Parameter("subscriptionStateOverrideActions") @Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions) {
        this.softDeleteTTL = softDeleteTTL;
        this.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
    }

    public Optional<String> softDeleteTTL() {
        return Optional.ofNullable(this.softDeleteTTL);
    }
    public List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions() {
        return this.subscriptionStateOverrideActions == null ? List.of() : this.subscriptionStateOverrideActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String softDeleteTTL;
        private @Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.softDeleteTTL = defaults.softDeleteTTL;
    	      this.subscriptionStateOverrideActions = defaults.subscriptionStateOverrideActions;
        }

        public Builder softDeleteTTL(@Nullable String softDeleteTTL) {
            this.softDeleteTTL = softDeleteTTL;
            return this;
        }
        public Builder subscriptionStateOverrideActions(@Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions) {
            this.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
            return this;
        }
        public Builder subscriptionStateOverrideActions(SubscriptionStateOverrideActionResponse... subscriptionStateOverrideActions) {
            return subscriptionStateOverrideActions(List.of(subscriptionStateOverrideActions));
        }        public ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications build() {
            return new ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications(softDeleteTTL, subscriptionStateOverrideActions);
        }
    }
}
