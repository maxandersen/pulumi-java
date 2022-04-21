// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1.inputs.AddressableArgs;
import com.pulumi.googlenative.run_v1.inputs.GoogleCloudRunV1ConditionArgs;
import com.pulumi.googlenative.run_v1.inputs.TrafficTargetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
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
    private @Nullable Output<AddressableArgs> address;

    public Optional<Output<AddressableArgs>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Conditions communicates information about ongoing/complete reconciliation processes that bring the &#34;spec&#34; inline with the observed state of the world. Service-specific conditions include: * &#34;ConfigurationsReady&#34;: true when the underlying Configuration is ready. * &#34;RoutesReady&#34;: true when the underlying Route is ready. * &#34;Ready&#34;: true when both the underlying Route and Configuration are ready.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<GoogleCloudRunV1ConditionArgs>> conditions;

    public Optional<Output<List<GoogleCloudRunV1ConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * From ConfigurationStatus. LatestCreatedRevisionName is the last revision that was created from this Service&#39;s Configuration. It might not be ready yet, for that use LatestReadyRevisionName.
     * 
     */
    @Import(name="latestCreatedRevisionName")
    private @Nullable Output<String> latestCreatedRevisionName;

    public Optional<Output<String>> latestCreatedRevisionName() {
        return Optional.ofNullable(this.latestCreatedRevisionName);
    }

    /**
     * From ConfigurationStatus. LatestReadyRevisionName holds the name of the latest Revision stamped out from this Service&#39;s Configuration that has had its &#34;Ready&#34; condition become &#34;True&#34;.
     * 
     */
    @Import(name="latestReadyRevisionName")
    private @Nullable Output<String> latestReadyRevisionName;

    public Optional<Output<String>> latestReadyRevisionName() {
        return Optional.ofNullable(this.latestReadyRevisionName);
    }

    /**
     * ObservedGeneration is the &#39;Generation&#39; of the Route that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition&#39;s status is True or False.
     * 
     */
    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    /**
     * From RouteStatus. Traffic holds the configured traffic distribution. These entries will always contain RevisionName references. When ConfigurationName appears in the spec, this will hold the LatestReadyRevisionName that we last observed.
     * 
     */
    @Import(name="traffic")
    private @Nullable Output<List<TrafficTargetArgs>> traffic;

    public Optional<Output<List<TrafficTargetArgs>>> traffic() {
        return Optional.ofNullable(this.traffic);
    }

    /**
     * From RouteStatus. URL holds the url that will distribute traffic over the provided traffic targets. It generally has the form https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private ServiceStatusArgs() {}

    private ServiceStatusArgs(ServiceStatusArgs $) {
        this.address = $.address;
        this.conditions = $.conditions;
        this.latestCreatedRevisionName = $.latestCreatedRevisionName;
        this.latestReadyRevisionName = $.latestReadyRevisionName;
        this.observedGeneration = $.observedGeneration;
        this.traffic = $.traffic;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceStatusArgs $;

        public Builder() {
            $ = new ServiceStatusArgs();
        }

        public Builder(ServiceStatusArgs defaults) {
            $ = new ServiceStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(@Nullable Output<AddressableArgs> address) {
            $.address = address;
            return this;
        }

        public Builder address(AddressableArgs address) {
            return address(Output.of(address));
        }

        public Builder conditions(@Nullable Output<List<GoogleCloudRunV1ConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<GoogleCloudRunV1ConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(GoogleCloudRunV1ConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder latestCreatedRevisionName(@Nullable Output<String> latestCreatedRevisionName) {
            $.latestCreatedRevisionName = latestCreatedRevisionName;
            return this;
        }

        public Builder latestCreatedRevisionName(String latestCreatedRevisionName) {
            return latestCreatedRevisionName(Output.of(latestCreatedRevisionName));
        }

        public Builder latestReadyRevisionName(@Nullable Output<String> latestReadyRevisionName) {
            $.latestReadyRevisionName = latestReadyRevisionName;
            return this;
        }

        public Builder latestReadyRevisionName(String latestReadyRevisionName) {
            return latestReadyRevisionName(Output.of(latestReadyRevisionName));
        }

        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        public Builder observedGeneration(Integer observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
        }

        public Builder traffic(@Nullable Output<List<TrafficTargetArgs>> traffic) {
            $.traffic = traffic;
            return this;
        }

        public Builder traffic(List<TrafficTargetArgs> traffic) {
            return traffic(Output.of(traffic));
        }

        public Builder traffic(TrafficTargetArgs... traffic) {
            return traffic(List.of(traffic));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public ServiceStatusArgs build() {
            return $;
        }
    }

}
