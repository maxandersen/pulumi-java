// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.azurenative.documentdb.outputs.SqlDedicatedGatewayRegionalServiceResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlDedicatedGatewayServiceResourcePropertiesResponse {
    /**
     * Time of the last state change (ISO-8601 format).
     * 
     */
    private final String creationTime;
    /**
     * Instance count for the service.
     * 
     */
    private final @Nullable Integer instanceCount;
    /**
     * Instance type for the service.
     * 
     */
    private final @Nullable String instanceSize;
    /**
     * An array that contains all of the locations for the service.
     * 
     */
    private final List<SqlDedicatedGatewayRegionalServiceResourceResponse> locations;
    /**
     * ServiceType for the service.
     * Expected value is 'SqlDedicatedGateway'.
     * 
     */
    private final String serviceType;
    /**
     * SqlDedicatedGateway endpoint for the service.
     * 
     */
    private final @Nullable String sqlDedicatedGatewayEndpoint;
    /**
     * Describes the status of a service.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private SqlDedicatedGatewayServiceResourcePropertiesResponse(
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("instanceCount") @Nullable Integer instanceCount,
        @CustomType.Parameter("instanceSize") @Nullable String instanceSize,
        @CustomType.Parameter("locations") List<SqlDedicatedGatewayRegionalServiceResourceResponse> locations,
        @CustomType.Parameter("serviceType") String serviceType,
        @CustomType.Parameter("sqlDedicatedGatewayEndpoint") @Nullable String sqlDedicatedGatewayEndpoint,
        @CustomType.Parameter("status") String status) {
        this.creationTime = creationTime;
        this.instanceCount = instanceCount;
        this.instanceSize = instanceSize;
        this.locations = locations;
        this.serviceType = serviceType;
        this.sqlDedicatedGatewayEndpoint = sqlDedicatedGatewayEndpoint;
        this.status = status;
    }

    /**
     * Time of the last state change (ISO-8601 format).
     * 
    */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * Instance count for the service.
     * 
    */
    public Optional<Integer> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    /**
     * Instance type for the service.
     * 
    */
    public Optional<String> instanceSize() {
        return Optional.ofNullable(this.instanceSize);
    }
    /**
     * An array that contains all of the locations for the service.
     * 
    */
    public List<SqlDedicatedGatewayRegionalServiceResourceResponse> locations() {
        return this.locations;
    }
    /**
     * ServiceType for the service.
     * Expected value is 'SqlDedicatedGateway'.
     * 
    */
    public String serviceType() {
        return this.serviceType;
    }
    /**
     * SqlDedicatedGateway endpoint for the service.
     * 
    */
    public Optional<String> sqlDedicatedGatewayEndpoint() {
        return Optional.ofNullable(this.sqlDedicatedGatewayEndpoint);
    }
    /**
     * Describes the status of a service.
     * 
    */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDedicatedGatewayServiceResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private @Nullable Integer instanceCount;
        private @Nullable String instanceSize;
        private List<SqlDedicatedGatewayRegionalServiceResourceResponse> locations;
        private String serviceType;
        private @Nullable String sqlDedicatedGatewayEndpoint;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDedicatedGatewayServiceResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceSize = defaults.instanceSize;
    	      this.locations = defaults.locations;
    	      this.serviceType = defaults.serviceType;
    	      this.sqlDedicatedGatewayEndpoint = defaults.sqlDedicatedGatewayEndpoint;
    	      this.status = defaults.status;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Builder instanceSize(@Nullable String instanceSize) {
            this.instanceSize = instanceSize;
            return this;
        }
        public Builder locations(List<SqlDedicatedGatewayRegionalServiceResourceResponse> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(SqlDedicatedGatewayRegionalServiceResourceResponse... locations) {
            return locations(List.of(locations));
        }
        public Builder serviceType(String serviceType) {
            this.serviceType = Objects.requireNonNull(serviceType);
            return this;
        }
        public Builder sqlDedicatedGatewayEndpoint(@Nullable String sqlDedicatedGatewayEndpoint) {
            this.sqlDedicatedGatewayEndpoint = sqlDedicatedGatewayEndpoint;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public SqlDedicatedGatewayServiceResourcePropertiesResponse build() {
            return new SqlDedicatedGatewayServiceResourcePropertiesResponse(creationTime, instanceCount, instanceSize, locations, serviceType, sqlDedicatedGatewayEndpoint, status);
        }
    }
}
