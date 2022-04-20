// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run_v1.outputs.AddressableResponse;
import com.pulumi.googlenative.run_v1.outputs.GoogleCloudRunV1ConditionResponse;
import com.pulumi.googlenative.run_v1.outputs.TrafficTargetResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceStatusResponse {
    /**
     * From RouteStatus. Similar to url, information on where the service is available on HTTP.
     * 
     */
    private final AddressableResponse address;
    /**
     * Conditions communicates information about ongoing/complete reconciliation processes that bring the &#34;spec&#34; inline with the observed state of the world. Service-specific conditions include: * &#34;ConfigurationsReady&#34;: true when the underlying Configuration is ready. * &#34;RoutesReady&#34;: true when the underlying Route is ready. * &#34;Ready&#34;: true when both the underlying Route and Configuration are ready.
     * 
     */
    private final List<GoogleCloudRunV1ConditionResponse> conditions;
    /**
     * From ConfigurationStatus. LatestCreatedRevisionName is the last revision that was created from this Service&#39;s Configuration. It might not be ready yet, for that use LatestReadyRevisionName.
     * 
     */
    private final String latestCreatedRevisionName;
    /**
     * From ConfigurationStatus. LatestReadyRevisionName holds the name of the latest Revision stamped out from this Service&#39;s Configuration that has had its &#34;Ready&#34; condition become &#34;True&#34;.
     * 
     */
    private final String latestReadyRevisionName;
    /**
     * ObservedGeneration is the &#39;Generation&#39; of the Route that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition&#39;s status is True or False.
     * 
     */
    private final Integer observedGeneration;
    /**
     * From RouteStatus. Traffic holds the configured traffic distribution. These entries will always contain RevisionName references. When ConfigurationName appears in the spec, this will hold the LatestReadyRevisionName that we last observed.
     * 
     */
    private final List<TrafficTargetResponse> traffic;
    /**
     * From RouteStatus. URL holds the url that will distribute traffic over the provided traffic targets. It generally has the form https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
     * 
     */
    private final String url;

    @CustomType.Constructor
    private ServiceStatusResponse(
        @CustomType.Parameter("address") AddressableResponse address,
        @CustomType.Parameter("conditions") List<GoogleCloudRunV1ConditionResponse> conditions,
        @CustomType.Parameter("latestCreatedRevisionName") String latestCreatedRevisionName,
        @CustomType.Parameter("latestReadyRevisionName") String latestReadyRevisionName,
        @CustomType.Parameter("observedGeneration") Integer observedGeneration,
        @CustomType.Parameter("traffic") List<TrafficTargetResponse> traffic,
        @CustomType.Parameter("url") String url) {
        this.address = address;
        this.conditions = conditions;
        this.latestCreatedRevisionName = latestCreatedRevisionName;
        this.latestReadyRevisionName = latestReadyRevisionName;
        this.observedGeneration = observedGeneration;
        this.traffic = traffic;
        this.url = url;
    }

    /**
     * From RouteStatus. Similar to url, information on where the service is available on HTTP.
     * 
    */
    public AddressableResponse address() {
        return this.address;
    }
    /**
     * Conditions communicates information about ongoing/complete reconciliation processes that bring the &#34;spec&#34; inline with the observed state of the world. Service-specific conditions include: * &#34;ConfigurationsReady&#34;: true when the underlying Configuration is ready. * &#34;RoutesReady&#34;: true when the underlying Route is ready. * &#34;Ready&#34;: true when both the underlying Route and Configuration are ready.
     * 
    */
    public List<GoogleCloudRunV1ConditionResponse> conditions() {
        return this.conditions;
    }
    /**
     * From ConfigurationStatus. LatestCreatedRevisionName is the last revision that was created from this Service&#39;s Configuration. It might not be ready yet, for that use LatestReadyRevisionName.
     * 
    */
    public String latestCreatedRevisionName() {
        return this.latestCreatedRevisionName;
    }
    /**
     * From ConfigurationStatus. LatestReadyRevisionName holds the name of the latest Revision stamped out from this Service&#39;s Configuration that has had its &#34;Ready&#34; condition become &#34;True&#34;.
     * 
    */
    public String latestReadyRevisionName() {
        return this.latestReadyRevisionName;
    }
    /**
     * ObservedGeneration is the &#39;Generation&#39; of the Route that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition&#39;s status is True or False.
     * 
    */
    public Integer observedGeneration() {
        return this.observedGeneration;
    }
    /**
     * From RouteStatus. Traffic holds the configured traffic distribution. These entries will always contain RevisionName references. When ConfigurationName appears in the spec, this will hold the LatestReadyRevisionName that we last observed.
     * 
    */
    public List<TrafficTargetResponse> traffic() {
        return this.traffic;
    }
    /**
     * From RouteStatus. URL holds the url that will distribute traffic over the provided traffic targets. It generally has the form https://{route-hash}-{project-hash}-{cluster-level-suffix}.a.run.app
     * 
    */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressableResponse address;
        private List<GoogleCloudRunV1ConditionResponse> conditions;
        private String latestCreatedRevisionName;
        private String latestReadyRevisionName;
        private Integer observedGeneration;
        private List<TrafficTargetResponse> traffic;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.conditions = defaults.conditions;
    	      this.latestCreatedRevisionName = defaults.latestCreatedRevisionName;
    	      this.latestReadyRevisionName = defaults.latestReadyRevisionName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.traffic = defaults.traffic;
    	      this.url = defaults.url;
        }

        public Builder address(AddressableResponse address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        public Builder conditions(List<GoogleCloudRunV1ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(GoogleCloudRunV1ConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder latestCreatedRevisionName(String latestCreatedRevisionName) {
            this.latestCreatedRevisionName = Objects.requireNonNull(latestCreatedRevisionName);
            return this;
        }
        public Builder latestReadyRevisionName(String latestReadyRevisionName) {
            this.latestReadyRevisionName = Objects.requireNonNull(latestReadyRevisionName);
            return this;
        }
        public Builder observedGeneration(Integer observedGeneration) {
            this.observedGeneration = Objects.requireNonNull(observedGeneration);
            return this;
        }
        public Builder traffic(List<TrafficTargetResponse> traffic) {
            this.traffic = Objects.requireNonNull(traffic);
            return this;
        }
        public Builder traffic(TrafficTargetResponse... traffic) {
            return traffic(List.of(traffic));
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public ServiceStatusResponse build() {
            return new ServiceStatusResponse(address, conditions, latestCreatedRevisionName, latestReadyRevisionName, observedGeneration, traffic, url);
        }
    }
}
