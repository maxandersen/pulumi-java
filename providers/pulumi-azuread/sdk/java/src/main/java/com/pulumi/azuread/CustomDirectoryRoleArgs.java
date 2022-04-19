// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread;

import com.pulumi.azuread.inputs.CustomDirectoryRolePermissionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomDirectoryRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDirectoryRoleArgs Empty = new CustomDirectoryRoleArgs();

    /**
     * The description of the custom directory role.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The display name of the custom directory role.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Indicates whether the role is enabled for assignment.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * A collection of `permissions` blocks as documented below.
     * 
     */
    @Import(name="permissions", required=true)
      private final Output<List<CustomDirectoryRolePermissionArgs>> permissions;

    public Output<List<CustomDirectoryRolePermissionArgs>> permissions() {
        return this.permissions;
    }

    /**
     * Custom template identifier that is typically used if one needs an identifier to be the same across different directories. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="templateId")
      private final @Nullable Output<String> templateId;

    public Output<String> templateId() {
        return this.templateId == null ? Codegen.empty() : this.templateId;
    }

    /**
     * - The version of the role definition. This can be any arbitrary string between 1-128 characters.
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> version() {
        return this.version;
    }

    public CustomDirectoryRoleArgs(
        @Nullable Output<String> description,
        Output<String> displayName,
        Output<Boolean> enabled,
        Output<List<CustomDirectoryRolePermissionArgs>> permissions,
        @Nullable Output<String> templateId,
        Output<String> version) {
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.templateId = templateId;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private CustomDirectoryRoleArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.enabled = Codegen.empty();
        this.permissions = Codegen.empty();
        this.templateId = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDirectoryRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private Output<Boolean> enabled;
        private Output<List<CustomDirectoryRolePermissionArgs>> permissions;
        private @Nullable Output<String> templateId;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDirectoryRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.permissions = defaults.permissions;
    	      this.templateId = defaults.templateId;
    	      this.version = defaults.version;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder permissions(Output<List<CustomDirectoryRolePermissionArgs>> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(List<CustomDirectoryRolePermissionArgs> permissions) {
            this.permissions = Output.of(Objects.requireNonNull(permissions));
            return this;
        }
        public Builder permissions(CustomDirectoryRolePermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder templateId(@Nullable Output<String> templateId) {
            this.templateId = templateId;
            return this;
        }
        public Builder templateId(@Nullable String templateId) {
            this.templateId = Codegen.ofNullable(templateId);
            return this;
        }
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public CustomDirectoryRoleArgs build() {
            return new CustomDirectoryRoleArgs(description, displayName, enabled, permissions, templateId, version);
        }
    }
}
