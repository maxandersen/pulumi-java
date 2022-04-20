// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDataExportResult {
    /**
     * The latest data export rule modification time.
     * 
     */
    private final @Nullable String createdDate;
    /**
     * The data export rule ID.
     * 
     */
    private final @Nullable String dataExportId;
    /**
     * Active when enabled.
     * 
     */
    private final @Nullable Boolean enable;
    /**
     * Optional. Allows to define an Event Hub name. Not applicable when destination is Storage Account.
     * 
     */
    private final @Nullable String eventHubName;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Date and time when the export was last modified.
     * 
     */
    private final @Nullable String lastModifiedDate;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The destination resource ID. This can be copied from the Properties entry of the destination resource in Azure.
     * 
     */
    private final String resourceId;
    /**
     * An array of tables to export, for example: [“Heartbeat, SecurityEvent”].
     * 
     */
    private final List<String> tableNames;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDataExportResult(
        @CustomType.Parameter("createdDate") @Nullable String createdDate,
        @CustomType.Parameter("dataExportId") @Nullable String dataExportId,
        @CustomType.Parameter("enable") @Nullable Boolean enable,
        @CustomType.Parameter("eventHubName") @Nullable String eventHubName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModifiedDate") @Nullable String lastModifiedDate,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceId") String resourceId,
        @CustomType.Parameter("tableNames") List<String> tableNames,
        @CustomType.Parameter("type") String type) {
        this.createdDate = createdDate;
        this.dataExportId = dataExportId;
        this.enable = enable;
        this.eventHubName = eventHubName;
        this.id = id;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.resourceId = resourceId;
        this.tableNames = tableNames;
        this.type = type;
    }

    /**
     * The latest data export rule modification time.
     * 
    */
    public Optional<String> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }
    /**
     * The data export rule ID.
     * 
    */
    public Optional<String> dataExportId() {
        return Optional.ofNullable(this.dataExportId);
    }
    /**
     * Active when enabled.
     * 
    */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }
    /**
     * Optional. Allows to define an Event Hub name. Not applicable when destination is Storage Account.
     * 
    */
    public Optional<String> eventHubName() {
        return Optional.ofNullable(this.eventHubName);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Date and time when the export was last modified.
     * 
    */
    public Optional<String> lastModifiedDate() {
        return Optional.ofNullable(this.lastModifiedDate);
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The destination resource ID. This can be copied from the Properties entry of the destination resource in Azure.
     * 
    */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * An array of tables to export, for example: [“Heartbeat, SecurityEvent”].
     * 
    */
    public List<String> tableNames() {
        return this.tableNames;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataExportResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdDate;
        private @Nullable String dataExportId;
        private @Nullable Boolean enable;
        private @Nullable String eventHubName;
        private String id;
        private @Nullable String lastModifiedDate;
        private String name;
        private String resourceId;
        private List<String> tableNames;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataExportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.dataExportId = defaults.dataExportId;
    	      this.enable = defaults.enable;
    	      this.eventHubName = defaults.eventHubName;
    	      this.id = defaults.id;
    	      this.lastModifiedDate = defaults.lastModifiedDate;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.tableNames = defaults.tableNames;
    	      this.type = defaults.type;
        }

        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public Builder dataExportId(@Nullable String dataExportId) {
            this.dataExportId = dataExportId;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Builder eventHubName(@Nullable String eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModifiedDate(@Nullable String lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder tableNames(List<String> tableNames) {
            this.tableNames = Objects.requireNonNull(tableNames);
            return this;
        }
        public Builder tableNames(String... tableNames) {
            return tableNames(List.of(tableNames));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDataExportResult build() {
            return new GetDataExportResult(createdDate, dataExportId, enable, eventHubName, id, lastModifiedDate, name, resourceId, tableNames, type);
        }
    }
}
