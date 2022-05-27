// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SystemTopicEventSubscriptionAzureFunctionEndpoint {
    /**
     * @return Specifies the ID of the Function where the Event Subscription will receive events. This must be the functions ID in format {function_app.id}/functions/{name}.
     * 
     */
    private final String functionId;
    /**
     * @return Maximum number of events per batch.
     * 
     */
    private final @Nullable Integer maxEventsPerBatch;
    /**
     * @return Preferred batch size in Kilobytes.
     * 
     */
    private final @Nullable Integer preferredBatchSizeInKilobytes;

    @CustomType.Constructor
    private SystemTopicEventSubscriptionAzureFunctionEndpoint(
        @CustomType.Parameter("functionId") String functionId,
        @CustomType.Parameter("maxEventsPerBatch") @Nullable Integer maxEventsPerBatch,
        @CustomType.Parameter("preferredBatchSizeInKilobytes") @Nullable Integer preferredBatchSizeInKilobytes) {
        this.functionId = functionId;
        this.maxEventsPerBatch = maxEventsPerBatch;
        this.preferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes;
    }

    /**
     * @return Specifies the ID of the Function where the Event Subscription will receive events. This must be the functions ID in format {function_app.id}/functions/{name}.
     * 
     */
    public String functionId() {
        return this.functionId;
    }
    /**
     * @return Maximum number of events per batch.
     * 
     */
    public Optional<Integer> maxEventsPerBatch() {
        return Optional.ofNullable(this.maxEventsPerBatch);
    }
    /**
     * @return Preferred batch size in Kilobytes.
     * 
     */
    public Optional<Integer> preferredBatchSizeInKilobytes() {
        return Optional.ofNullable(this.preferredBatchSizeInKilobytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemTopicEventSubscriptionAzureFunctionEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionId;
        private @Nullable Integer maxEventsPerBatch;
        private @Nullable Integer preferredBatchSizeInKilobytes;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemTopicEventSubscriptionAzureFunctionEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionId = defaults.functionId;
    	      this.maxEventsPerBatch = defaults.maxEventsPerBatch;
    	      this.preferredBatchSizeInKilobytes = defaults.preferredBatchSizeInKilobytes;
        }

        public Builder functionId(String functionId) {
            this.functionId = Objects.requireNonNull(functionId);
            return this;
        }
        public Builder maxEventsPerBatch(@Nullable Integer maxEventsPerBatch) {
            this.maxEventsPerBatch = maxEventsPerBatch;
            return this;
        }
        public Builder preferredBatchSizeInKilobytes(@Nullable Integer preferredBatchSizeInKilobytes) {
            this.preferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes;
            return this;
        }        public SystemTopicEventSubscriptionAzureFunctionEndpoint build() {
            return new SystemTopicEventSubscriptionAzureFunctionEndpoint(functionId, maxEventsPerBatch, preferredBatchSizeInKilobytes);
        }
    }
}
