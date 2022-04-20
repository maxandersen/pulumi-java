// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.outputs;

import com.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSynapseWorkspaceSqlPoolTableDataSetResult {
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
     * Expected value is &#39;SynapseWorkspaceSqlPoolTable&#39;.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Resource id of the Synapse Workspace SQL Pool Table
     * 
     */
    private final String synapseWorkspaceSqlPoolTableResourceId;
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
    private GetSynapseWorkspaceSqlPoolTableDataSetResult(
        @CustomType.Parameter("dataSetId") String dataSetId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("synapseWorkspaceSqlPoolTableResourceId") String synapseWorkspaceSqlPoolTableResourceId,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.dataSetId = dataSetId;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.synapseWorkspaceSqlPoolTableResourceId = synapseWorkspaceSqlPoolTableResourceId;
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
     * Expected value is &#39;SynapseWorkspaceSqlPoolTable&#39;.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Resource id of the Synapse Workspace SQL Pool Table
     * 
    */
    public String synapseWorkspaceSqlPoolTableResourceId() {
        return this.synapseWorkspaceSqlPoolTableResourceId;
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

    public static Builder builder(GetSynapseWorkspaceSqlPoolTableDataSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String id;
        private String kind;
        private String name;
        private String synapseWorkspaceSqlPoolTableResourceId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSynapseWorkspaceSqlPoolTableDataSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.synapseWorkspaceSqlPoolTableResourceId = defaults.synapseWorkspaceSqlPoolTableResourceId;
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder synapseWorkspaceSqlPoolTableResourceId(String synapseWorkspaceSqlPoolTableResourceId) {
            this.synapseWorkspaceSqlPoolTableResourceId = Objects.requireNonNull(synapseWorkspaceSqlPoolTableResourceId);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSynapseWorkspaceSqlPoolTableDataSetResult build() {
            return new GetSynapseWorkspaceSqlPoolTableDataSetResult(dataSetId, id, kind, name, synapseWorkspaceSqlPoolTableResourceId, systemData, type);
        }
    }
}
