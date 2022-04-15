// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.securitycenter_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationMuteConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationMuteConfigArgs Empty = new OrganizationMuteConfigArgs();

    /**
     * A description of the mute config.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The human readable name to be displayed for the mute config.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * An expression that defines the filter to apply across create/update events of findings. While creating a filter string, be mindful of the scope in which the mute configuration is being created. E.g., If a filter contains project = X but is created under the project = Y scope, it might not match any findings. The following field and operator combinations are supported: * severity: `=`, `:` * category: `=`, `:` * resource.name: `=`, `:` * resource.project_name: `=`, `:` * resource.project_display_name: `=`, `:` * resource.folders.resource_folder: `=`, `:` * resource.parent_name: `=`, `:` * resource.parent_display_name: `=`, `:` * resource.type: `=`, `:` * finding_class: `=`, `:` * indicator.ip_addresses: `=`, `:` * indicator.domains: `=`, `:`
     * 
     */
    @Import(name="filter", required=true)
      private final Output<String> filter;

    public Output<String> filter() {
        return this.filter;
    }

    @Import(name="muteConfigId", required=true)
      private final Output<String> muteConfigId;

    public Output<String> muteConfigId() {
        return this.muteConfigId;
    }

    /**
     * This field will be ignored if provided on config creation. Format "organizations/{organization}/muteConfigs/{mute_config}" "folders/{folder}/muteConfigs/{mute_config}" "projects/{project}/muteConfigs/{mute_config}"
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    public OrganizationMuteConfigArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        Output<String> filter,
        Output<String> muteConfigId,
        @Nullable Output<String> name,
        Output<String> organizationId) {
        this.description = description;
        this.displayName = displayName;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.muteConfigId = Objects.requireNonNull(muteConfigId, "expected parameter 'muteConfigId' to be non-null");
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private OrganizationMuteConfigArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.filter = Codegen.empty();
        this.muteConfigId = Codegen.empty();
        this.name = Codegen.empty();
        this.organizationId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationMuteConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private Output<String> filter;
        private Output<String> muteConfigId;
        private @Nullable Output<String> name;
        private Output<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationMuteConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.filter = defaults.filter;
    	      this.muteConfigId = defaults.muteConfigId;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder filter(Output<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Output.of(Objects.requireNonNull(filter));
            return this;
        }
        public Builder muteConfigId(Output<String> muteConfigId) {
            this.muteConfigId = Objects.requireNonNull(muteConfigId);
            return this;
        }
        public Builder muteConfigId(String muteConfigId) {
            this.muteConfigId = Output.of(Objects.requireNonNull(muteConfigId));
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
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }        public OrganizationMuteConfigArgs build() {
            return new OrganizationMuteConfigArgs(description, displayName, filter, muteConfigId, name, organizationId);
        }
    }
}
