// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.outputs;

import com.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKustoClusterDataSetResult {
    /**
     * Unique id for identifying a data set resource
     * 
     */
    private final String dataSetId;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of data set.
     * Expected value is &#39;KustoCluster&#39;.
     * 
     */
    private final String kind;
    /**
     * Resource id of the kusto cluster.
     * 
     */
    private final String kustoClusterResourceId;
    /**
     * Location of the kusto cluster.
     * 
     */
    private final String location;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Provisioning state of the kusto cluster data set.
     * 
     */
    private final String provisioningState;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetKustoClusterDataSetResult(
        @CustomType.Parameter("dataSetId") String dataSetId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("kustoClusterResourceId") String kustoClusterResourceId,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.dataSetId = dataSetId;
        this.id = id;
        this.kind = kind;
        this.kustoClusterResourceId = kustoClusterResourceId;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Unique id for identifying a data set resource
     * 
    */
    public String dataSetId() {
        return this.dataSetId;
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Kind of data set.
     * Expected value is &#39;KustoCluster&#39;.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Resource id of the kusto cluster.
     * 
    */
    public String kustoClusterResourceId() {
        return this.kustoClusterResourceId;
    }
    /**
     * Location of the kusto cluster.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Provisioning state of the kusto cluster data set.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKustoClusterDataSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String id;
        private String kind;
        private String kustoClusterResourceId;
        private String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKustoClusterDataSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.kustoClusterResourceId = defaults.kustoClusterResourceId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder dataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kustoClusterResourceId(String kustoClusterResourceId) {
            this.kustoClusterResourceId = Objects.requireNonNull(kustoClusterResourceId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetKustoClusterDataSetResult build() {
            return new GetKustoClusterDataSetResult(dataSetId, id, kind, kustoClusterResourceId, location, name, provisioningState, systemData, type);
        }
    }
}
