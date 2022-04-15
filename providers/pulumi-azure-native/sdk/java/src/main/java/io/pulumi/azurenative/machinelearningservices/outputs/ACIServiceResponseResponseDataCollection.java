// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ACIServiceResponseResponseDataCollection {
    /**
     * Option for enabling/disabling Event Hub.
     * 
     */
    private final @Nullable Boolean eventHubEnabled;
    /**
     * Option for enabling/disabling storage.
     * 
     */
    private final @Nullable Boolean storageEnabled;

    @CustomType.Constructor
    private ACIServiceResponseResponseDataCollection(
        @CustomType.Parameter("eventHubEnabled") @Nullable Boolean eventHubEnabled,
        @CustomType.Parameter("storageEnabled") @Nullable Boolean storageEnabled) {
        this.eventHubEnabled = eventHubEnabled;
        this.storageEnabled = storageEnabled;
    }

    /**
     * Option for enabling/disabling Event Hub.
     * 
    */
    public Optional<Boolean> eventHubEnabled() {
        return Optional.ofNullable(this.eventHubEnabled);
    }
    /**
     * Option for enabling/disabling storage.
     * 
    */
    public Optional<Boolean> storageEnabled() {
        return Optional.ofNullable(this.storageEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ACIServiceResponseResponseDataCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean eventHubEnabled;
        private @Nullable Boolean storageEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ACIServiceResponseResponseDataCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubEnabled = defaults.eventHubEnabled;
    	      this.storageEnabled = defaults.storageEnabled;
        }

        public Builder eventHubEnabled(@Nullable Boolean eventHubEnabled) {
            this.eventHubEnabled = eventHubEnabled;
            return this;
        }
        public Builder storageEnabled(@Nullable Boolean storageEnabled) {
            this.storageEnabled = storageEnabled;
            return this;
        }        public ACIServiceResponseResponseDataCollection build() {
            return new ACIServiceResponseResponseDataCollection(eventHubEnabled, storageEnabled);
        }
    }
}
