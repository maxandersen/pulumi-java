// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies a metric to load balance a service during runtime.
 * 
 */
public final class ServiceLoadMetricDescriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceLoadMetricDescriptionResponse Empty = new ServiceLoadMetricDescriptionResponse();

    /**
     * Used only for Stateless services. The default amount of load, as a number, that this service creates for this metric.
     * 
     */
    @Import(name="defaultLoad")
      private final @Nullable Integer defaultLoad;

    public Optional<Integer> defaultLoad() {
        return this.defaultLoad == null ? Optional.empty() : Optional.ofNullable(this.defaultLoad);
    }

    /**
     * The name of the metric. If the service chooses to report load during runtime, the load metric name should match the name that is specified in Name exactly. Note that metric names are case sensitive.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Primary replica.
     * 
     */
    @Import(name="primaryDefaultLoad")
      private final @Nullable Integer primaryDefaultLoad;

    public Optional<Integer> primaryDefaultLoad() {
        return this.primaryDefaultLoad == null ? Optional.empty() : Optional.ofNullable(this.primaryDefaultLoad);
    }

    /**
     * Used only for Stateful services. The default amount of load, as a number, that this service creates for this metric when it is a Secondary replica.
     * 
     */
    @Import(name="secondaryDefaultLoad")
      private final @Nullable Integer secondaryDefaultLoad;

    public Optional<Integer> secondaryDefaultLoad() {
        return this.secondaryDefaultLoad == null ? Optional.empty() : Optional.ofNullable(this.secondaryDefaultLoad);
    }

    /**
     * The service load metric relative weight, compared to other metrics configured for this service, as a number.
     * 
     */
    @Import(name="weight")
      private final @Nullable String weight;

    public Optional<String> weight() {
        return this.weight == null ? Optional.empty() : Optional.ofNullable(this.weight);
    }

    public ServiceLoadMetricDescriptionResponse(
        @Nullable Integer defaultLoad,
        String name,
        @Nullable Integer primaryDefaultLoad,
        @Nullable Integer secondaryDefaultLoad,
        @Nullable String weight) {
        this.defaultLoad = defaultLoad;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.primaryDefaultLoad = primaryDefaultLoad;
        this.secondaryDefaultLoad = secondaryDefaultLoad;
        this.weight = weight;
    }

    private ServiceLoadMetricDescriptionResponse() {
        this.defaultLoad = null;
        this.name = null;
        this.primaryDefaultLoad = null;
        this.secondaryDefaultLoad = null;
        this.weight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLoadMetricDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer defaultLoad;
        private String name;
        private @Nullable Integer primaryDefaultLoad;
        private @Nullable Integer secondaryDefaultLoad;
        private @Nullable String weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceLoadMetricDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultLoad = defaults.defaultLoad;
    	      this.name = defaults.name;
    	      this.primaryDefaultLoad = defaults.primaryDefaultLoad;
    	      this.secondaryDefaultLoad = defaults.secondaryDefaultLoad;
    	      this.weight = defaults.weight;
        }

        public Builder defaultLoad(@Nullable Integer defaultLoad) {
            this.defaultLoad = defaultLoad;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder primaryDefaultLoad(@Nullable Integer primaryDefaultLoad) {
            this.primaryDefaultLoad = primaryDefaultLoad;
            return this;
        }
        public Builder secondaryDefaultLoad(@Nullable Integer secondaryDefaultLoad) {
            this.secondaryDefaultLoad = secondaryDefaultLoad;
            return this;
        }
        public Builder weight(@Nullable String weight) {
            this.weight = weight;
            return this;
        }        public ServiceLoadMetricDescriptionResponse build() {
            return new ServiceLoadMetricDescriptionResponse(defaultLoad, name, primaryDefaultLoad, secondaryDefaultLoad, weight);
        }
    }
}
