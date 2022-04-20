// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendServiceBackend {
    /**
     * Specifies the balancing mode for this backend.
     * For global HTTP(S) or TCP/SSL load balancing, the default is
     * UTILIZATION. Valid values are UTILIZATION, RATE (for HTTP(S))
     * and CONNECTION (for TCP/SSL).
     * Default value is `UTILIZATION`.
     * Possible values are `UTILIZATION`, `RATE`, and `CONNECTION`.
     * 
     */
    private final @Nullable String balancingMode;
    /**
     * A multiplier applied to the group&#39;s maximum servicing capacity
     * (based on UTILIZATION, RATE or CONNECTION).
     * Default value is 1, which means the group will serve up to 100%
     * of its configured capacity (depending on balancingMode). A
     * setting of 0 means the group is completely drained, offering
     * 0% of its available Capacity. Valid range is [0.0,1.0].
     * 
     */
    private final @Nullable Double capacityScaler;
    /**
     * An optional description of this resource.
     * Provide this property when you create the resource.
     * 
     */
    private final @Nullable String description;
    /**
     * The fully-qualified URL of an Instance Group or Network Endpoint
     * Group resource. In case of instance group this defines the list
     * of instances that serve traffic. Member virtual machine
     * instances from each instance group must live in the same zone as
     * the instance group itself. No two backends in a backend service
     * are allowed to use same Instance Group resource.
     * For Network Endpoint Groups this defines list of endpoints. All
     * endpoints of Network Endpoint Group must be hosted on instances
     * located in the same zone as the Network Endpoint Group.
     * Backend services cannot mix Instance Group and
     * Network Endpoint Group backends.
     * Note that you must specify an Instance Group or Network Endpoint
     * Group resource using the fully-qualified URL, rather than a
     * partial URL.
     * 
     */
    private final String group;
    /**
     * The maximum number of connections to the backend cluster.
     * Defaults to 1024.
     * 
     */
    private final @Nullable Integer maxConnections;
    /**
     * The max number of simultaneous connections that a single backend
     * network endpoint can handle. This is used to calculate the
     * capacity of the group. Can be used in either CONNECTION or
     * UTILIZATION balancing modes.
     * For CONNECTION mode, either
     * maxConnections or maxConnectionsPerEndpoint must be set.
     * 
     */
    private final @Nullable Integer maxConnectionsPerEndpoint;
    /**
     * The max number of simultaneous connections that a single
     * backend instance can handle. This is used to calculate the
     * capacity of the group. Can be used in either CONNECTION or
     * UTILIZATION balancing modes.
     * For CONNECTION mode, either maxConnections or
     * maxConnectionsPerInstance must be set.
     * 
     */
    private final @Nullable Integer maxConnectionsPerInstance;
    /**
     * The max requests per second (RPS) of the group.
     * Can be used with either RATE or UTILIZATION balancing modes,
     * but required if RATE mode. For RATE mode, either maxRate or one
     * of maxRatePerInstance or maxRatePerEndpoint, as appropriate for
     * group type, must be set.
     * 
     */
    private final @Nullable Integer maxRate;
    /**
     * The max requests per second (RPS) that a single backend network
     * endpoint can handle. This is used to calculate the capacity of
     * the group. Can be used in either balancing mode. For RATE mode,
     * either maxRate or maxRatePerEndpoint must be set.
     * 
     */
    private final @Nullable Double maxRatePerEndpoint;
    /**
     * The max requests per second (RPS) that a single backend
     * instance can handle. This is used to calculate the capacity of
     * the group. Can be used in either balancing mode. For RATE mode,
     * either maxRate or maxRatePerInstance must be set.
     * 
     */
    private final @Nullable Double maxRatePerInstance;
    /**
     * Used when balancingMode is UTILIZATION. This ratio defines the
     * CPU utilization target for the group. Valid range is [0.0, 1.0].
     * 
     */
    private final @Nullable Double maxUtilization;

    @CustomType.Constructor
    private BackendServiceBackend(
        @CustomType.Parameter("balancingMode") @Nullable String balancingMode,
        @CustomType.Parameter("capacityScaler") @Nullable Double capacityScaler,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("group") String group,
        @CustomType.Parameter("maxConnections") @Nullable Integer maxConnections,
        @CustomType.Parameter("maxConnectionsPerEndpoint") @Nullable Integer maxConnectionsPerEndpoint,
        @CustomType.Parameter("maxConnectionsPerInstance") @Nullable Integer maxConnectionsPerInstance,
        @CustomType.Parameter("maxRate") @Nullable Integer maxRate,
        @CustomType.Parameter("maxRatePerEndpoint") @Nullable Double maxRatePerEndpoint,
        @CustomType.Parameter("maxRatePerInstance") @Nullable Double maxRatePerInstance,
        @CustomType.Parameter("maxUtilization") @Nullable Double maxUtilization) {
        this.balancingMode = balancingMode;
        this.capacityScaler = capacityScaler;
        this.description = description;
        this.group = group;
        this.maxConnections = maxConnections;
        this.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
        this.maxConnectionsPerInstance = maxConnectionsPerInstance;
        this.maxRate = maxRate;
        this.maxRatePerEndpoint = maxRatePerEndpoint;
        this.maxRatePerInstance = maxRatePerInstance;
        this.maxUtilization = maxUtilization;
    }

    /**
     * Specifies the balancing mode for this backend.
     * For global HTTP(S) or TCP/SSL load balancing, the default is
     * UTILIZATION. Valid values are UTILIZATION, RATE (for HTTP(S))
     * and CONNECTION (for TCP/SSL).
     * Default value is `UTILIZATION`.
     * Possible values are `UTILIZATION`, `RATE`, and `CONNECTION`.
     * 
    */
    public Optional<String> balancingMode() {
        return Optional.ofNullable(this.balancingMode);
    }
    /**
     * A multiplier applied to the group&#39;s maximum servicing capacity
     * (based on UTILIZATION, RATE or CONNECTION).
     * Default value is 1, which means the group will serve up to 100%
     * of its configured capacity (depending on balancingMode). A
     * setting of 0 means the group is completely drained, offering
     * 0% of its available Capacity. Valid range is [0.0,1.0].
     * 
    */
    public Optional<Double> capacityScaler() {
        return Optional.ofNullable(this.capacityScaler);
    }
    /**
     * An optional description of this resource.
     * Provide this property when you create the resource.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The fully-qualified URL of an Instance Group or Network Endpoint
     * Group resource. In case of instance group this defines the list
     * of instances that serve traffic. Member virtual machine
     * instances from each instance group must live in the same zone as
     * the instance group itself. No two backends in a backend service
     * are allowed to use same Instance Group resource.
     * For Network Endpoint Groups this defines list of endpoints. All
     * endpoints of Network Endpoint Group must be hosted on instances
     * located in the same zone as the Network Endpoint Group.
     * Backend services cannot mix Instance Group and
     * Network Endpoint Group backends.
     * Note that you must specify an Instance Group or Network Endpoint
     * Group resource using the fully-qualified URL, rather than a
     * partial URL.
     * 
    */
    public String group() {
        return this.group;
    }
    /**
     * The maximum number of connections to the backend cluster.
     * Defaults to 1024.
     * 
    */
    public Optional<Integer> maxConnections() {
        return Optional.ofNullable(this.maxConnections);
    }
    /**
     * The max number of simultaneous connections that a single backend
     * network endpoint can handle. This is used to calculate the
     * capacity of the group. Can be used in either CONNECTION or
     * UTILIZATION balancing modes.
     * For CONNECTION mode, either
     * maxConnections or maxConnectionsPerEndpoint must be set.
     * 
    */
    public Optional<Integer> maxConnectionsPerEndpoint() {
        return Optional.ofNullable(this.maxConnectionsPerEndpoint);
    }
    /**
     * The max number of simultaneous connections that a single
     * backend instance can handle. This is used to calculate the
     * capacity of the group. Can be used in either CONNECTION or
     * UTILIZATION balancing modes.
     * For CONNECTION mode, either maxConnections or
     * maxConnectionsPerInstance must be set.
     * 
    */
    public Optional<Integer> maxConnectionsPerInstance() {
        return Optional.ofNullable(this.maxConnectionsPerInstance);
    }
    /**
     * The max requests per second (RPS) of the group.
     * Can be used with either RATE or UTILIZATION balancing modes,
     * but required if RATE mode. For RATE mode, either maxRate or one
     * of maxRatePerInstance or maxRatePerEndpoint, as appropriate for
     * group type, must be set.
     * 
    */
    public Optional<Integer> maxRate() {
        return Optional.ofNullable(this.maxRate);
    }
    /**
     * The max requests per second (RPS) that a single backend network
     * endpoint can handle. This is used to calculate the capacity of
     * the group. Can be used in either balancing mode. For RATE mode,
     * either maxRate or maxRatePerEndpoint must be set.
     * 
    */
    public Optional<Double> maxRatePerEndpoint() {
        return Optional.ofNullable(this.maxRatePerEndpoint);
    }
    /**
     * The max requests per second (RPS) that a single backend
     * instance can handle. This is used to calculate the capacity of
     * the group. Can be used in either balancing mode. For RATE mode,
     * either maxRate or maxRatePerInstance must be set.
     * 
    */
    public Optional<Double> maxRatePerInstance() {
        return Optional.ofNullable(this.maxRatePerInstance);
    }
    /**
     * Used when balancingMode is UTILIZATION. This ratio defines the
     * CPU utilization target for the group. Valid range is [0.0, 1.0].
     * 
    */
    public Optional<Double> maxUtilization() {
        return Optional.ofNullable(this.maxUtilization);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceBackend defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String balancingMode;
        private @Nullable Double capacityScaler;
        private @Nullable String description;
        private String group;
        private @Nullable Integer maxConnections;
        private @Nullable Integer maxConnectionsPerEndpoint;
        private @Nullable Integer maxConnectionsPerInstance;
        private @Nullable Integer maxRate;
        private @Nullable Double maxRatePerEndpoint;
        private @Nullable Double maxRatePerInstance;
        private @Nullable Double maxUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceBackend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.balancingMode = defaults.balancingMode;
    	      this.capacityScaler = defaults.capacityScaler;
    	      this.description = defaults.description;
    	      this.group = defaults.group;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxConnectionsPerEndpoint = defaults.maxConnectionsPerEndpoint;
    	      this.maxConnectionsPerInstance = defaults.maxConnectionsPerInstance;
    	      this.maxRate = defaults.maxRate;
    	      this.maxRatePerEndpoint = defaults.maxRatePerEndpoint;
    	      this.maxRatePerInstance = defaults.maxRatePerInstance;
    	      this.maxUtilization = defaults.maxUtilization;
        }

        public Builder balancingMode(@Nullable String balancingMode) {
            this.balancingMode = balancingMode;
            return this;
        }
        public Builder capacityScaler(@Nullable Double capacityScaler) {
            this.capacityScaler = capacityScaler;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder group(String group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }
        public Builder maxConnections(@Nullable Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Builder maxConnectionsPerEndpoint(@Nullable Integer maxConnectionsPerEndpoint) {
            this.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
            return this;
        }
        public Builder maxConnectionsPerInstance(@Nullable Integer maxConnectionsPerInstance) {
            this.maxConnectionsPerInstance = maxConnectionsPerInstance;
            return this;
        }
        public Builder maxRate(@Nullable Integer maxRate) {
            this.maxRate = maxRate;
            return this;
        }
        public Builder maxRatePerEndpoint(@Nullable Double maxRatePerEndpoint) {
            this.maxRatePerEndpoint = maxRatePerEndpoint;
            return this;
        }
        public Builder maxRatePerInstance(@Nullable Double maxRatePerInstance) {
            this.maxRatePerInstance = maxRatePerInstance;
            return this;
        }
        public Builder maxUtilization(@Nullable Double maxUtilization) {
            this.maxUtilization = maxUtilization;
            return this;
        }        public BackendServiceBackend build() {
            return new BackendServiceBackend(balancingMode, capacityScaler, description, group, maxConnections, maxConnectionsPerEndpoint, maxConnectionsPerInstance, maxRate, maxRatePerEndpoint, maxRatePerInstance, maxUtilization);
        }
    }
}
