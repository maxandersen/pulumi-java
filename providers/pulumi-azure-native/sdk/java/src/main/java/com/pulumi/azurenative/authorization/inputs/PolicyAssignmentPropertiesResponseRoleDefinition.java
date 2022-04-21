// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of role definition
 * 
 */
public final class PolicyAssignmentPropertiesResponseRoleDefinition extends com.pulumi.resources.InvokeArgs {

    public static final PolicyAssignmentPropertiesResponseRoleDefinition Empty = new PolicyAssignmentPropertiesResponseRoleDefinition();

    /**
     * Display name of the role definition
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Id of the role definition
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Type of the role definition
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private PolicyAssignmentPropertiesResponseRoleDefinition() {}

    private PolicyAssignmentPropertiesResponseRoleDefinition(PolicyAssignmentPropertiesResponseRoleDefinition $) {
        this.displayName = $.displayName;
        this.id = $.id;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyAssignmentPropertiesResponseRoleDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyAssignmentPropertiesResponseRoleDefinition $;

        public Builder() {
            $ = new PolicyAssignmentPropertiesResponseRoleDefinition();
        }

        public Builder(PolicyAssignmentPropertiesResponseRoleDefinition defaults) {
            $ = new PolicyAssignmentPropertiesResponseRoleDefinition(Objects.requireNonNull(defaults));
        }

        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public PolicyAssignmentPropertiesResponseRoleDefinition build() {
            return $;
        }
    }

}
