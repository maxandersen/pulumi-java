// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebhookNotificationResponse {
    /**
     * @return a property bag of settings. This value can be empty.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * @return the service address to receive the notification.
     * 
     */
    private final @Nullable String serviceUri;

    @CustomType.Constructor
    private WebhookNotificationResponse(
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("serviceUri") @Nullable String serviceUri) {
        this.properties = properties;
        this.serviceUri = serviceUri;
    }

    /**
     * @return a property bag of settings. This value can be empty.
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * @return the service address to receive the notification.
     * 
     */
    public Optional<String> serviceUri() {
        return Optional.ofNullable(this.serviceUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookNotificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> properties;
        private @Nullable String serviceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookNotificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.serviceUri = defaults.serviceUri;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder serviceUri(@Nullable String serviceUri) {
            this.serviceUri = serviceUri;
            return this;
        }        public WebhookNotificationResponse build() {
            return new WebhookNotificationResponse(properties, serviceUri);
        }
    }
}
