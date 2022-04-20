// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.run_v1.inputs.AddressableArgs;
import com.pulumi.googlenative.run_v1.inputs.GoogleCloudRunV1ConditionArgs;
import com.pulumi.googlenative.run_v1.inputs.TrafficTargetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The current state of the Service. Output only.
 * 
 */
public final class ServiceStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceStatusArgs Empty = new ServiceStatusArgs();

    /**
     * From RouteStatus. Similar to url, information on where the service is available on HTTP.
     * 
     */
    @Import(name="address")
      private final @Nullable Output<AddressableArgs> address;

    public Output<AddressableArgs> address() {
        return this.address == null ? Codegen.empty() : this.address;
    }

    /**
     * Conditions communicates information about ongoing/complete reconciliation processes that bring the &#34;spec&#34; inline with the observed state of the world. Service-specific conditions include: * &#34;ConfigurationsReady&#34;: true when the underlying Configuration is ready. * &#34;RoutesReady&#34;: true when the underlying Route is ready. * &#34;Ready&#34;: true when both the underlying Route and Configuration are ready.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<GoogleCloudRunV1ConditionArgs>> conditions;

    public Output<List<GoogleCloudRunV1ConditionArgs>> conditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * From ConfigurationStatus. LatestCreatedRevisionName is the last revision that was created from this Service&#39;s Configuration. It might not be ready yet, for that use LatestReadyRevisionName.
     * 
     */
    @Import(name="latestCreatedRevisionName")
      private final @Nullable Output<String> latestCreatedRevisionName;

    public Output<String> latestCreatedRevisionName() {
        return this.latestCreatedRevisionName == null ? Codegen.empty() : this.latestCreatedRevisionName;
    }

    /**
     * From ConfigurationStatus. LatestReadyRevisionName holds the name of the latest Revision stamped out from this Service&#39;s Configuration that has had its &#34;Ready&#34; condition become &#34;True&#34;.
     * 
     */
    @Import(name="latestReadyRevisionName")
      private final @Nullable Output<String> latestReadyRevisionName;

    public Output<String> latestReadyRevisionName() {
        return this.latestReadyRevisionName == null ? Codegen.empty() : this.latestReadyRevisionName;
    }

    /**
     * ObservedGeneration is the &#39;Generation&#39; of the Route that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition&#39;s status is True or False.
     * 
     */
    @Import(name="observedGeneration")
      private final @Nullable Output<Integer> observedGeneration;

    public Output<Integer> observedGeneration() {
        return this.observedGeneration == null ? Codegen.empty() : this.observedGeneration;
    }

    /**
     * From RouteStatus. Traffic holds the configured traffic distribution. These entries will always contain RevisionName references. When ConfigurationName appears in the spec, this will hold the LatestReadyRevisionName that we last observed.
     * 
     */
    @Import(name="traffic")
      private final @Nullable Output<List<TrafficTargetArgs>> traffic;

    public Output<List<TrafficTargetArgs>> traffic() {
        return this.traffic == null ? Codegen.empty() : this.traffic;
    }

    /**
     * From RouteStatus. URL holds the url that will distribute traffic over the provided traffic targets. It generally has the form https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> url() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    public ServiceStatusArgs(
        @Nullable Output<AddressableArgs> address,
        @Nullable Output<List<GoogleCloudRunV1ConditionArgs>> conditions,
        @Nullable Output<String> latestCreatedRevisionName,
        @Nullable Output<String> latestReadyRevisionName,
        @Nullable Output<Integer> observedGeneration,
        @Nullable Output<List<TrafficTargetArgs>> traffic,
        @Nullable Output<String> url) {
        this.address = address;
        this.conditions = conditions;
        this.latestCreatedRevisionName = latestCreatedRevisionName;
        this.latestReadyRevisionName = latestReadyRevisionName;
        this.observedGeneration = observedGeneration;
        this.traffic = traffic;
        this.url = url;
    }

    private ServiceStatusArgs() {
        this.address = Codegen.empty();
        this.conditions = Codegen.empty();
        this.latestCreatedRevisionName = Codegen.empty();
        this.latestReadyRevisionName = Codegen.empty();
        this.observedGeneration = Codegen.empty();
        this.traffic = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AddressableArgs> address;
        private @Nullable Output<List<GoogleCloudRunV1ConditionArgs>> conditions;
        private @Nullable Output<String> latestCreatedRevisionName;
        private @Nullable Output<String> latestReadyRevisionName;
        private @Nullable Output<Integer> observedGeneration;
        private @Nullable Output<List<TrafficTargetArgs>> traffic;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.conditions = defaults.conditions;
    	      this.latestCreatedRevisionName = defaults.latestCreatedRevisionName;
    	      this.latestReadyRevisionName = defaults.latestReadyRevisionName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.traffic = defaults.traffic;
    	      this.url = defaults.url;
        }

        public Builder address(@Nullable Output<AddressableArgs> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable AddressableArgs address) {
            this.address = Codegen.ofNullable(address);
            return this;
        }
        public Builder conditions(@Nullable Output<List<GoogleCloudRunV1ConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<GoogleCloudRunV1ConditionArgs> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(GoogleCloudRunV1ConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder latestCreatedRevisionName(@Nullable Output<String> latestCreatedRevisionName) {
            this.latestCreatedRevisionName = latestCreatedRevisionName;
            return this;
        }
        public Builder latestCreatedRevisionName(@Nullable String latestCreatedRevisionName) {
            this.latestCreatedRevisionName = Codegen.ofNullable(latestCreatedRevisionName);
            return this;
        }
        public Builder latestReadyRevisionName(@Nullable Output<String> latestReadyRevisionName) {
            this.latestReadyRevisionName = latestReadyRevisionName;
            return this;
        }
        public Builder latestReadyRevisionName(@Nullable String latestReadyRevisionName) {
            this.latestReadyRevisionName = Codegen.ofNullable(latestReadyRevisionName);
            return this;
        }
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Codegen.ofNullable(observedGeneration);
            return this;
        }
        public Builder traffic(@Nullable Output<List<TrafficTargetArgs>> traffic) {
            this.traffic = traffic;
            return this;
        }
        public Builder traffic(@Nullable List<TrafficTargetArgs> traffic) {
            this.traffic = Codegen.ofNullable(traffic);
            return this;
        }
        public Builder traffic(TrafficTargetArgs... traffic) {
            return traffic(List.of(traffic));
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }        public ServiceStatusArgs build() {
            return new ServiceStatusArgs(address, conditions, latestCreatedRevisionName, latestReadyRevisionName, observedGeneration, traffic, url);
        }
    }
}
