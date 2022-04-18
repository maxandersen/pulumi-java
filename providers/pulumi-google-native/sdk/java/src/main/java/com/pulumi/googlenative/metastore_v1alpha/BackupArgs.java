// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupArgs Empty = new BackupArgs();

    @Import(name="backupId", required=true)
      private final Output<String> backupId;

    public Output<String> backupId() {
        return this.backupId;
    }

    /**
     * The description of the backup.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Immutable. The relative resource name of the backup, in the following form:projects/{project_number}/locations/{location_id}/services/{service_id}/backups/{backup_id}
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    @Import(name="serviceId", required=true)
      private final Output<String> serviceId;

    public Output<String> serviceId() {
        return this.serviceId;
    }

    public BackupArgs(
        Output<String> backupId,
        @Nullable Output<String> description,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        Output<String> serviceId) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.description = description;
        this.location = location;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private BackupArgs() {
        this.backupId = Codegen.empty();
        this.description = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.serviceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backupId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private Output<String> serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.description = defaults.description;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder backupId(Output<String> backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }
        public Builder backupId(String backupId) {
            this.backupId = Output.of(Objects.requireNonNull(backupId));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder serviceId(Output<String> serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Output.of(Objects.requireNonNull(serviceId));
            return this;
        }        public BackupArgs build() {
            return new BackupArgs(backupId, description, location, name, project, requestId, serviceId);
        }
    }
}
