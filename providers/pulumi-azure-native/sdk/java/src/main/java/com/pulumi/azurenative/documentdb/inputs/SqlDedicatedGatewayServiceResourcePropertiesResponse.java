// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.inputs.SqlDedicatedGatewayRegionalServiceResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for SqlDedicatedGatewayServiceResource.
 * 
 */
public final class SqlDedicatedGatewayServiceResourcePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlDedicatedGatewayServiceResourcePropertiesResponse Empty = new SqlDedicatedGatewayServiceResourcePropertiesResponse();

    /**
     * Time of the last state change (ISO-8601 format).
     * 
     */
    @Import(name="creationTime", required=true)
      private final String creationTime;

    public String creationTime() {
        return this.creationTime;
    }

    /**
     * Instance count for the service.
     * 
     */
    @Import(name="instanceCount")
      private final @Nullable Integer instanceCount;

    public Optional<Integer> instanceCount() {
        return this.instanceCount == null ? Optional.empty() : Optional.ofNullable(this.instanceCount);
    }

    /**
     * Instance type for the service.
     * 
     */
    @Import(name="instanceSize")
      private final @Nullable String instanceSize;

    public Optional<String> instanceSize() {
        return this.instanceSize == null ? Optional.empty() : Optional.ofNullable(this.instanceSize);
    }

    /**
     * An array that contains all of the locations for the service.
     * 
     */
    @Import(name="locations", required=true)
      private final List<SqlDedicatedGatewayRegionalServiceResourceResponse> locations;

    public List<SqlDedicatedGatewayRegionalServiceResourceResponse> locations() {
        return this.locations;
    }

    /**
     * ServiceType for the service.
     * Expected value is 'SqlDedicatedGateway'.
     * 
     */
    @Import(name="serviceType", required=true)
      private final String serviceType;

    public String serviceType() {
        return this.serviceType;
    }

    /**
     * SqlDedicatedGateway endpoint for the service.
     * 
     */
    @Import(name="sqlDedicatedGatewayEndpoint")
      private final @Nullable String sqlDedicatedGatewayEndpoint;

    public Optional<String> sqlDedicatedGatewayEndpoint() {
        return this.sqlDedicatedGatewayEndpoint == null ? Optional.empty() : Optional.ofNullable(this.sqlDedicatedGatewayEndpoint);
    }

    /**
     * Describes the status of a service.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    public SqlDedicatedGatewayServiceResourcePropertiesResponse(
        String creationTime,
        @Nullable Integer instanceCount,
        @Nullable String instanceSize,
        List<SqlDedicatedGatewayRegionalServiceResourceResponse> locations,
        String serviceType,
        @Nullable String sqlDedicatedGatewayEndpoint,
        String status) {
        this.creationTime = Objects.requireNonNull(creationTime, "expected parameter 'creationTime' to be non-null");
        this.instanceCount = instanceCount;
        this.instanceSize = instanceSize;
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
        this.serviceType = Objects.requireNonNull(serviceType, "expected parameter 'serviceType' to be non-null");
        this.sqlDedicatedGatewayEndpoint = sqlDedicatedGatewayEndpoint;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private SqlDedicatedGatewayServiceResourcePropertiesResponse() {
        this.creationTime = null;
        this.instanceCount = null;
        this.instanceSize = null;
        this.locations = List.of();
        this.serviceType = null;
        this.sqlDedicatedGatewayEndpoint = null;
        this.status = null;
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
