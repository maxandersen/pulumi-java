// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataExportArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataExportArgs Empty = new DataExportArgs();

    /**
     * The latest data export rule modification time.
     * 
     */
    @Import(name="createdDate")
      private final @Nullable Output<String> createdDate;

    public Output<String> createdDate() {
        return this.createdDate == null ? Codegen.empty() : this.createdDate;
    }

    /**
     * The data export rule ID.
     * 
     */
    @Import(name="dataExportId")
      private final @Nullable Output<String> dataExportId;

    public Output<String> dataExportId() {
        return this.dataExportId == null ? Codegen.empty() : this.dataExportId;
    }

    /**
     * The data export rule name.
     * 
     */
    @Import(name="dataExportName")
      private final @Nullable Output<String> dataExportName;

    public Output<String> dataExportName() {
        return this.dataExportName == null ? Codegen.empty() : this.dataExportName;
    }

    /**
     * Active when enabled.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> enable() {
        return this.enable == null ? Codegen.empty() : this.enable;
    }

    /**
     * Optional. Allows to define an Event Hub name. Not applicable when destination is Storage Account.
     * 
     */
    @Import(name="eventHubName")
      private final @Nullable Output<String> eventHubName;

    public Output<String> eventHubName() {
        return this.eventHubName == null ? Codegen.empty() : this.eventHubName;
    }

    /**
     * Date and time when the export was last modified.
     * 
     */
    @Import(name="lastModifiedDate")
      private final @Nullable Output<String> lastModifiedDate;

    public Output<String> lastModifiedDate() {
        return this.lastModifiedDate == null ? Codegen.empty() : this.lastModifiedDate;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The destination resource ID. This can be copied from the Properties entry of the destination resource in Azure.
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * An array of tables to export, for example: [“Heartbeat, SecurityEvent”].
     * 
     */
    @Import(name="tableNames", required=true)
      private final Output<List<String>> tableNames;

    public Output<List<String>> tableNames() {
        return this.tableNames;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    public DataExportArgs(
        @Nullable Output<String> createdDate,
        @Nullable Output<String> dataExportId,
        @Nullable Output<String> dataExportName,
        @Nullable Output<Boolean> enable,
        @Nullable Output<String> eventHubName,
        @Nullable Output<String> lastModifiedDate,
        Output<String> resourceGroupName,
        Output<String> resourceId,
        Output<List<String>> tableNames,
        Output<String> workspaceName) {
        this.createdDate = createdDate;
        this.dataExportId = dataExportId;
        this.dataExportName = dataExportName;
        this.enable = enable;
        this.eventHubName = eventHubName;
        this.lastModifiedDate = lastModifiedDate;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.tableNames = Objects.requireNonNull(tableNames, "expected parameter 'tableNames' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private DataExportArgs() {
        this.createdDate = Codegen.empty();
        this.dataExportId = Codegen.empty();
        this.dataExportName = Codegen.empty();
        this.enable = Codegen.empty();
        this.eventHubName = Codegen.empty();
        this.lastModifiedDate = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.tableNames = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createdDate;
        private @Nullable Output<String> dataExportId;
        private @Nullable Output<String> dataExportName;
        private @Nullable Output<Boolean> enable;
        private @Nullable Output<String> eventHubName;
        private @Nullable Output<String> lastModifiedDate;
        private Output<String> resourceGroupName;
        private Output<String> resourceId;
        private Output<List<String>> tableNames;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataExportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.dataExportId = defaults.dataExportId;
    	      this.dataExportName = defaults.dataExportName;
    	      this.enable = defaults.enable;
    	      this.eventHubName = defaults.eventHubName;
    	      this.lastModifiedDate = defaults.lastModifiedDate;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceId = defaults.resourceId;
    	      this.tableNames = defaults.tableNames;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder createdDate(@Nullable Output<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = Codegen.ofNullable(createdDate);
            return this;
        }
        public Builder dataExportId(@Nullable Output<String> dataExportId) {
            this.dataExportId = dataExportId;
            return this;
        }
        public Builder dataExportId(@Nullable String dataExportId) {
            this.dataExportId = Codegen.ofNullable(dataExportId);
            return this;
        }
        public Builder dataExportName(@Nullable Output<String> dataExportName) {
            this.dataExportName = dataExportName;
            return this;
        }
        public Builder dataExportName(@Nullable String dataExportName) {
            this.dataExportName = Codegen.ofNullable(dataExportName);
            return this;
        }
        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = Codegen.ofNullable(enable);
            return this;
        }
        public Builder eventHubName(@Nullable Output<String> eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }
        public Builder eventHubName(@Nullable String eventHubName) {
            this.eventHubName = Codegen.ofNullable(eventHubName);
            return this;
        }
        public Builder lastModifiedDate(@Nullable Output<String> lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
            return this;
        }
        public Builder lastModifiedDate(@Nullable String lastModifiedDate) {
            this.lastModifiedDate = Codegen.ofNullable(lastModifiedDate);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceId(Output<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Output.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public Builder tableNames(Output<List<String>> tableNames) {
            this.tableNames = Objects.requireNonNull(tableNames);
            return this;
        }
        public Builder tableNames(List<String> tableNames) {
            this.tableNames = Output.of(Objects.requireNonNull(tableNames));
            return this;
        }
        public Builder tableNames(String... tableNames) {
            return tableNames(List.of(tableNames));
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public DataExportArgs build() {
            return new DataExportArgs(createdDate, dataExportId, dataExportName, enable, eventHubName, lastModifiedDate, resourceGroupName, resourceId, tableNames, workspaceName);
        }
    }
}
