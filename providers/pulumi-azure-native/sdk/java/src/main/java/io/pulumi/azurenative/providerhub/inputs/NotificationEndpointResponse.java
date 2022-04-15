// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final NotificationEndpointResponse Empty = new NotificationEndpointResponse();

    @Import(name="locations")
      private final @Nullable List<String> locations;

    public List<String> locations() {
        return this.locations == null ? List.of() : this.locations;
    }

    @Import(name="notificationDestination")
      private final @Nullable String notificationDestination;

    public Optional<String> notificationDestination() {
        return this.notificationDestination == null ? Optional.empty() : Optional.ofNullable(this.notificationDestination);
    }

    public NotificationEndpointResponse(
        @Nullable List<String> locations,
        @Nullable String notificationDestination) {
        this.locations = locations;
        this.notificationDestination = notificationDestination;
    }

    private NotificationEndpointResponse() {
        this.locations = List.of();
        this.notificationDestination = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> locations;
        private @Nullable String notificationDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locations = defaults.locations;
    	      this.notificationDestination = defaults.notificationDestination;
        }

        public Builder locations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        public Builder notificationDestination(@Nullable String notificationDestination) {
            this.notificationDestination = notificationDestination;
            return this;
        }        public NotificationEndpointResponse build() {
            return new NotificationEndpointResponse(locations, notificationDestination);
        }
    }
}
