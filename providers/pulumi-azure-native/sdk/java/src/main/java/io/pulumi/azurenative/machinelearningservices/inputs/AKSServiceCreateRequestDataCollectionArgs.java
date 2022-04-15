// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details of the data collection options specified.
 * 
 */
public final class AKSServiceCreateRequestDataCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AKSServiceCreateRequestDataCollectionArgs Empty = new AKSServiceCreateRequestDataCollectionArgs();

    /**
     * Option for enabling/disabling Event Hub.
     * 
     */
    @Import(name="eventHubEnabled")
      private final @Nullable Output<Boolean> eventHubEnabled;

    public Output<Boolean> eventHubEnabled() {
        return this.eventHubEnabled == null ? Codegen.empty() : this.eventHubEnabled;
    }

    /**
     * Option for enabling/disabling storage.
     * 
     */
    @Import(name="storageEnabled")
      private final @Nullable Output<Boolean> storageEnabled;

    public Output<Boolean> storageEnabled() {
        return this.storageEnabled == null ? Codegen.empty() : this.storageEnabled;
    }

    public AKSServiceCreateRequestDataCollectionArgs(
        @Nullable Output<Boolean> eventHubEnabled,
        @Nullable Output<Boolean> storageEnabled) {
        this.eventHubEnabled = eventHubEnabled;
        this.storageEnabled = storageEnabled;
    }

    private AKSServiceCreateRequestDataCollectionArgs() {
        this.eventHubEnabled = Codegen.empty();
        this.storageEnabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSServiceCreateRequestDataCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> eventHubEnabled;
        private @Nullable Output<Boolean> storageEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSServiceCreateRequestDataCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubEnabled = defaults.eventHubEnabled;
    	      this.storageEnabled = defaults.storageEnabled;
        }

        public Builder eventHubEnabled(@Nullable Output<Boolean> eventHubEnabled) {
            this.eventHubEnabled = eventHubEnabled;
            return this;
        }
        public Builder eventHubEnabled(@Nullable Boolean eventHubEnabled) {
            this.eventHubEnabled = Codegen.ofNullable(eventHubEnabled);
            return this;
        }
        public Builder storageEnabled(@Nullable Output<Boolean> storageEnabled) {
            this.storageEnabled = storageEnabled;
            return this;
        }
        public Builder storageEnabled(@Nullable Boolean storageEnabled) {
            this.storageEnabled = Codegen.ofNullable(storageEnabled);
            return this;
        }        public AKSServiceCreateRequestDataCollectionArgs build() {
            return new AKSServiceCreateRequestDataCollectionArgs(eventHubEnabled, storageEnabled);
        }
    }
}
